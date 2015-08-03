package com.boliao.sunshine.biz.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipFile;
import org.apache.tools.zip.ZipOutputStream;

/**
 * 压缩解压缩<br>
 * 该程序依赖于Ant包 Ant 下载地址:http://ant.apache.org/
 * 
 * @author <a href="mailto:xzknet@gmail.com">Ken_xu</a>
 * @version 1.0 Copyright 2011年7月8日11:33:39
 */
public class KenZip {
	private static final Log log = LogFactory.getLog(KenZip.class.getName());
	private static int BUF_SIZE = 1024;
	private static String ZIP_ENCODEING = "GBK";

	public KenZip() {
		this(1024 * 10);
	}

	public KenZip(int bufSize) {
		BUF_SIZE = bufSize;
	}

	/**
	 * 压缩文件或文件夹
	 * 
	 * @param zipFileName
	 * @param inputFile
	 * @throws Exception
	 */
	public static void zip(String zipFileName, String inputFile)
			throws Exception {
		zip(zipFileName, new File(inputFile));
	}

	/**
	 * 压缩文件或文件夹
	 * 
	 * @param zipFileName
	 * @param inputFile
	 * @throws Exception
	 */
	public static void zip(String zipFileName, File inputFile) throws Exception {
		// 未指定压缩文件名，默认为"ZipFile"
		if (zipFileName == null || zipFileName.equals(""))
			zipFileName = "ZipFile";

		// 添加".zip"后缀
		if (!zipFileName.endsWith(".zip"))
			zipFileName += ".zip";

		// 创建文件夹
		/*
		 * String path =
		 * Pattern.compile("[\\/]").matcher(zipFileName).replaceAll
		 * (File.separator); int endIndex = path.lastIndexOf(File.separator);
		 * path = path.substring(0, endIndex); File f = new File(path);
		 * f.mkdirs();
		 */
		// 开始压缩
		{
			ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(
					new FileOutputStream(zipFileName)));
			zos.setEncoding(ZIP_ENCODEING);
			compress(zos, inputFile, "");
			log.debug("zip done");
			zos.close();
		}
	}

	/**
	 * 解压缩zip压缩文件到指定目录
	 * 
	 * @param unZipFileName
	 * @param outputDirectory
	 * @throws Exception
	 */
	public static void unZip(String unZipFileName, String outputDirectory)
			throws Exception {
		// 创建输出文件夹对象
		File outDirFile = new File(outputDirectory);
		outDirFile.mkdirs();
		// 打开压缩文件文件夹
		ZipFile zipFile = new ZipFile(unZipFileName, ZIP_ENCODEING);
		for (Enumeration entries = zipFile.getEntries(); entries
				.hasMoreElements();) {
			ZipEntry ze = (ZipEntry) entries.nextElement();
			File file = new File(outDirFile, ze.getName());
			if (ze.isDirectory()) {// 是目录，则创建之
				file.mkdirs();
				log.debug("mkdir " + file.getAbsolutePath());
			} else {
				File parent = file.getParentFile();
				if (parent != null && !parent.exists()) {
					parent.mkdirs();
				}
				log.debug("unziping " + ze.getName());
				file.createNewFile();
				FileOutputStream fos = new FileOutputStream(file);
				InputStream is = zipFile.getInputStream(ze);
				inStream2outStream(is, fos);
				fos.close();
				is.close();
			}
		}
		zipFile.close();
	}

	/**
	 * 压缩一个文件夹或文件对象到已经打开的zip输出流 <b>不建议直接调用该方法</b>
	 * 
	 * @param zos
	 * @param f
	 * @param fileName
	 * @throws Exception
	 */
	public static void compress(ZipOutputStream zos, File f, String fileName)
			throws Exception {
		log.debug("Zipping " + f.getName());
		if (f.isDirectory()) {
			// 压缩文件夹
			File[] fl = f.listFiles();
			zos.putNextEntry(new ZipEntry(fileName + "/"));
			fileName = fileName.length() == 0 ? "" : fileName + "/";
			for (int i = 0; i < fl.length; i++) {
				compress(zos, fl[i], fileName + fl[i].getName());
			}
		} else {
			// 压缩文件
			zos.putNextEntry(new ZipEntry(fileName));
			FileInputStream fis = new FileInputStream(f);
			inStream2outStream(fis, zos);
			fis.close();
			zos.closeEntry();
		}
	}

	private static void inStream2outStream(InputStream is, OutputStream os)
			throws IOException {
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		int bytesRead = 0;
		for (byte[] buffer = new byte[BUF_SIZE]; ((bytesRead = bis.read(buffer,
				0, BUF_SIZE)) != -1);) {
			bos.write(buffer, 0, bytesRead); // 将流写入
		}
	}

	public static void main(String[] args) {
		try {
			KenZip t = new KenZip();
			t.zip("D:\\workspaceBoliao\\spider\\images\\使用CSS3中的伪类渲染表格.zip",
					"D:\\workspaceBoliao\\spider\\images/使用CSS3中的伪类渲染表格");
			// t.unZip("d:\\temp\\xzk2.zip", "E:\\驾校模拟考试2");
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
}