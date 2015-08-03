/**
 * 
 */
package com.boliao.sunshine.biz.location.utils;

/**
 * 根据ip或者host获得 位置信息
 * 
 * @author liaobo
 * 
 */
public interface IpUtil {
	/**
	 * 根据ip地址获得位置信息
	 * 
	 * @param ip
	 * @return
	 */
	public String getLocationByIp(String ip);

	/**
	 * 根据host获得位置信息
	 * 
	 * @param host
	 * @return
	 */
	public String getLocationByHost(String host);
}
