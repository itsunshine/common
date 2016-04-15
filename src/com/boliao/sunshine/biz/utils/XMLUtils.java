/**
 * 
 */
package com.boliao.sunshine.biz.utils;

import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * @author liaobo
 * 
 *         用于操作xml的工具类
 *
 */
public class XMLUtils {

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

	public static void main(String[] args) throws Exception {
		generateSiteMap();
	}

}
