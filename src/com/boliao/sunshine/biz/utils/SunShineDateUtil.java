/**
 * 
 */
package com.boliao.sunshine.biz.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author liaobo 日期操作工具类
 *
 */
public class SunShineDateUtil {

	/**
	 * 获取几天前的日期
	 * 
	 * @param days
	 * @return
	 */
	public static String getDaysAgo(int days) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		String yesterday = new SimpleDateFormat("yyyy-MM-dd ").format(cal.getTime());
		return yesterday;
	}

}
