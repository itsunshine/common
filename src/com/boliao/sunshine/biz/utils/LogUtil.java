/**
 * 
 */
package com.boliao.sunshine.biz.utils;

import org.apache.log4j.Logger;

/**
 * 日志记录工具
 * 
 * @author liaobo
 * 
 */
public class LogUtil {

	public static final String ERROR = "ERROR";

	/**
	 * 记录debug日志
	 * 
	 * @param logger
	 *            日志记录器
	 * @param message
	 *            日志内容
	 */
	public static void debug(Logger logger, String message) {
		if (logger.isDebugEnabled()) {
			logger.debug(message);
		}
	}

	/**
	 * 记录info日志
	 * 
	 * @param logger
	 *            日志记录器
	 * @param message
	 *            日志
	 */
	public static void info(Logger logger, String message) {
		if (logger.isInfoEnabled()) {
			logger.info(message);
		}
	}

	/**
	 * 打印warn日志
	 * 
	 * @param logger
	 *            日志记录器
	 * @param message
	 *            日志内容
	 * @param e
	 *            异常
	 */
	public static void warn(Logger logger, String message, Throwable e) {
		logger.warn(message, e);
	}

	/**
	 * 打印warn日志
	 * 
	 * @param logger
	 *            日志记录器
	 * @param message
	 *            日志内容
	 */
	public static void warn(Logger logger, String message) {
		warn(logger, message, null);
	}

	/**
	 * 打印error日志
	 * 
	 * @param logger
	 *            日志记录器
	 * @param msg
	 *            日志内容
	 * @param e
	 *            错误异常
	 */
	public static void error(Logger logger, String msg, Throwable e) {
		logger.error(msg, e);
	}
}
