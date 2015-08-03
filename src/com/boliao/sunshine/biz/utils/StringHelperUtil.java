package com.boliao.sunshine.biz.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 对字符串做转换
 * 
 * @author liaobo.lb
 * 
 */
public class StringHelperUtil {
	/**
	 * 将汉字转换成utf8编码
	 * 
	 * @param link
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String transformUrl(String link) throws UnsupportedEncodingException {
		Pattern pattern = Pattern.compile("[\u0391-\uFFE5]+");
		Matcher match = pattern.matcher(link);
		StringBuffer sb = new StringBuffer();
		while (match.find()) {
			String str = match.group();
			str = URLEncoder.encode(str, "utf-8");
			match.appendReplacement(sb, str);
		}
		match.appendTail(sb);
		return sb.toString();
	}

	/**
	 * 获取字符串的摘要
	 * 
	 * @param data
	 * @return
	 */
	public static String generateMD5Str(String data) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			return String.valueOf(md.digest(data.getBytes()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 替换掉网页中的空白字符
	 * 
	 * @param htmlContent
	 * @return 去掉空白字符的字符串
	 */
	public static String removeBlankWord(String htmlContent) {
		htmlContent = htmlContent.replaceAll("\r", "").replaceAll("\n", "").replaceAll("\\s{3,}", " ");
		return htmlContent;
	}
}
