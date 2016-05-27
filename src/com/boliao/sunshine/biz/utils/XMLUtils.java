/**
 * 
 */
package com.boliao.sunshine.biz.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import com.boliao.sunshine.biz.constants.SITEMAPConstants;
import com.boliao.sunshine.biz.model.JobDemandArt;

/**
 * @author liaobo
 * 
 *         用于操作xml的工具类
 *
 */
public class XMLUtils {

	/** 岗位描述，通配url模板 */
	private static final String HR_CONTENT_URL = "http://www.itsunshine.net/views/index.do?m=getContent&id=${id}&type=hr";

	/** 工作招聘页面的list页 */
	private static final String HR_LIST_URL = "http://www.itsunshine.net/views/index.do?type=hr";

	/** 在线api文档首页 */
	private static final String API_ON_LINE = "http://www.itsunshine.net/views/index.do?type=doc";

	/** 在线电子书首页 */
	private static final String EBOOK_ON_LINE = "http://www.itsunshine.net/views/index.do?type=ebook";

	/** 招聘岗位分析 */
	private static final String ANALYSIS_ON_LINE = "http://www.itsunshine.net/views/index.do?type=analysis";

	/** 在线工具 */
	private static final String TOOL_ON_LINE = "http://www.itsunshine.net/views/index.do?type=tool";

	/** 个人中心首页 */
	private static final String PER_INFO_URL = "http://www.itsunshine.net/views/index.do?type=personalInfoInput";

	/** 装生成sitemap时，需要的通用url */
	static List<String> commonUrlSet = new ArrayList<String>();

	/** 日期格式化工具 */
	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	static {
		commonUrlSet.add(HR_LIST_URL);
		commonUrlSet.add(API_ON_LINE);
		commonUrlSet.add(EBOOK_ON_LINE);
		commonUrlSet.add(TOOL_ON_LINE);
		commonUrlSet.add(PER_INFO_URL);
		commonUrlSet.add(ANALYSIS_ON_LINE);
	}

	/**
	 * 生成siteMap.xml文件
	 * 
	 * @throws IOException
	 */
	public static void generateSiteMap() throws IOException {

		Element root = DocumentHelper.createElement("urlset");
		Document document = DocumentHelper.createDocument(root);
		document.setRootElement(root);
		Element urlElement = root.addElement("url");
		Element locElement = urlElement.addElement("loc");
		locElement.addText("http://www.itsunshine.net");
		Element freqElement = urlElement.addElement("changefreq");
		freqElement.addText("always");
		Element priorityElement = urlElement.addElement("priority");
		priorityElement.addText("1.0");
		// 把生成的xml文档存放在硬盘上 true代表是否换行
		OutputFormat format = new OutputFormat("    ", true);
		format.setEncoding("GBK");// 设置编码格式
		XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("siteMap.xml"), format);
		xmlWriter.write(document);
		xmlWriter.close();
	}

	/**
	 * 生成通用url的siteMap
	 * 
	 * @param root
	 */
	public static void generateCommonSiteMap(Element root) {
		for (String commonUrl : commonUrlSet) {
			Element urlElement = root.addElement(SITEMAPConstants.URL);
			Element locElement = urlElement.addElement(SITEMAPConstants.LOC);
			locElement.addText(commonUrl);
			Element freqElement = urlElement.addElement(SITEMAPConstants.CHANGEFREQ);
			freqElement.addText(SITEMAPConstants.DAYLY);
			Element priorityElement = urlElement.addElement(SITEMAPConstants.PRIORITY);
			priorityElement.addText("0.8");
			Element lastModElement = urlElement.addElement(SITEMAPConstants.LASTMOD);
			lastModElement.addText(dateFormat.format(new Date()));
		}
	}

	/**
	 * 根据工作信息链表，像root节点添加工作页的url
	 * 
	 * @param root
	 * @param jobList
	 * @throws IOException
	 */
	public static void generateJobSiteMap(Element root, List<JobDemandArt> jobList) throws IOException {
		for (JobDemandArt job : jobList) {
			Element urlElement = root.addElement(SITEMAPConstants.URL);
			Element locElement = urlElement.addElement(SITEMAPConstants.LOC);
			String url = HR_CONTENT_URL.replace("${id}", String.valueOf(job.getId()));
			locElement.addText(url);
			Element freqElement = urlElement.addElement(SITEMAPConstants.CHANGEFREQ);
			freqElement.addText(SITEMAPConstants.YEARLY);
			Element priorityElement = urlElement.addElement(SITEMAPConstants.PRIORITY);
			priorityElement.addText("0.4");
			Element lastModElement = urlElement.addElement(SITEMAPConstants.LASTMOD);
			lastModElement.addText(job.getCreateTime());
		}
	}

	public static void main(String[] args) throws Exception {
		// generateSiteMap();
		List<JobDemandArt> jobList = new ArrayList<JobDemandArt>();
		for (int i = 0; i < 10; i++) {
			JobDemandArt job = new JobDemandArt();
			job.setCreateTime("2016-04-16 00:00:00");
			job.setId((89099l + i));
			jobList.add(job);
		}

		Element root = DocumentHelper.createElement("urlset");
		Document document = DocumentHelper.createDocument(root);
		document.setRootElement(root);
		generateCommonSiteMap(root);
		generateJobSiteMap(root, jobList);
		// 把生成的xml文档存放在硬盘上 true代表是否换行
		OutputFormat format = new OutputFormat("    ", true);
		format.setEncoding("UTF-8");// 设置编码格式
		XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("siteMap.xml"), format);
		xmlWriter.setEscapeText(false);
		xmlWriter.write(document);
		xmlWriter.close();
	}

}
