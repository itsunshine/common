package com.boliao.sunshine.biz.utils;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.http.HttpStatus;
import org.apache.log4j.Logger;

public class HttpUtil {

	// 错误日志记录器
	private static final Logger errLogger = Logger.getLogger(LogUtil.ERROR);

	/**
	 * 根据 url 和网页类型生成需要保存的网页的文件名 去除掉 url 中非文件名字符
	 */
	public String getFileNameByUrl(String url, String contentType) {
		url = url.substring(7);// remove http://
		if (contentType.indexOf("html") != -1)// text/html
		{
			url = url.replaceAll("[\\?/:*|<>\"]", "_") + ".html";
			return url;
		} else// 如application/pdf
		{
			return url.replaceAll("[\\?/:*|<>\"]", "_") + "." + contentType.substring(contentType.lastIndexOf("/") + 1);
		}
	}

	/**
	 * 保存网页字节数组到本地文件 filePath 为要保存的文件的相对地址
	 */
	private void saveToLocal(byte[] data, String filePath) {
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream(new File(filePath)));
			for (int i = 0; i < data.length; i++)
				out.write(data[i]);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* 下载 url 指向的网页 */
	public String downloadFile(String url) {
		String filePath = null;
		/* 1.生成 HttpClinet 对象并设置参数 */
		HttpClient httpClient = new HttpClient();
		// 设置 Http 连接超时 5s
		httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(5000);

		/* 2.生成 GetMethod 对象并设置参数 */
		GetMethod getMethod = new GetMethod(url);
		// 设置 get 请求超时 5s
		getMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 5000);
		// 设置请求重试处理
		getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());

		/* 3.执行 HTTP GET 请求 */
		try {
			int statusCode = httpClient.executeMethod(getMethod);
			// 判断访问的状态码
			if (statusCode != HttpStatus.SC_OK) {
				System.err.println("Method failed: " + getMethod.getStatusLine());
				filePath = null;
			}

			/* 4.处理 HTTP 响应内容 */
			byte[] responseBody = getMethod.getResponseBody();// 读取为字节数组
			// 根据网页 url 生成保存时的文件名
			filePath = "temp\\" + getFileNameByUrl(url, getMethod.getResponseHeader("Content-Type").getValue());
			createFile(filePath);
			saveToLocal(responseBody, filePath);
		} catch (HttpException e) {
			// 发生致命的异常，可能是协议不对或者返回的内容有问题
			LogUtil.error(errLogger, "Please check your provided http address! url: " + url, e);
		} catch (IOException e) {
			// 发生网络异常
			LogUtil.error(errLogger, "根据url下载页面异常，url: " + url, e);
		} finally {
			// 释放连接
			getMethod.releaseConnection();
		}
		return filePath;
	}

	public boolean createFile(String filePath) throws IOException {
		File file = new File(filePath);
		if (!file.exists()) {
			file.createNewFile();
		}
		return true;

	}

	/**
	 * 根据URL 抓取网页内容
	 * 
	 * @param url
	 * @return
	 */
	public static String getHtmlContent(String url) throws Exception {
		/* 1.生成 HttpClinet 对象并设置参数 */
		HttpClient httpClient = new HttpClient();
		// 设置 Http 连接超时 5s
		httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(5000);
		// 抓取防爬虫网站
		httpClient.getParams().setParameter(HttpMethodParams.USER_AGENT, "Mozilla/5.0 (X11; U; Linux i686; zh-CN; rv:1.9.1.2) Gecko/20090803 Fedora/3.5");
		/* 2.生成 GetMethod 对象并设置参数 */
		GetMethod getMethod = new GetMethod(url);
		// 设置 get 请求超时 5s
		getMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 10000);
		// 设置请求重试处理
		getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());

		/* 3.执行 HTTP GET 请求 */
		try {
			int statusCode = httpClient.executeMethod(getMethod);
			// 判断访问的状态码
			if (statusCode != HttpStatus.SC_OK) {
				LogUtil.warn(errLogger, "Method failed: " + getMethod.getStatusLine());
			}
			/* 4.处理 HTTP 响应内容 */
			byte[] responseBody = getMethod.getResponseBody();// 读取为字节数组
			String htmlContent = new String(responseBody, "utf-8");
			htmlContent = StringHelperUtil.removeBlankWord(htmlContent);
			return htmlContent;
		} catch (Exception e) {
			LogUtil.error(errLogger, "根据url下载页面异常，url: " + url, e);
			throw e;
		} finally {
			// get方法释放链接
			getMethod.releaseConnection();
		}
	}

	// 测试的 main 方法
	public static void main(String[] args) {
		HttpUtil downLoader = new HttpUtil();
		downLoader.downloadFile("http://www.twt.edu.cn");
	}
}