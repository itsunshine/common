package com.boliao.sunshine.biz.model;

import java.io.Serializable;

/**
 * 
 * @author liaobo
 * 
 */
public class Doc extends DocAndEbookPare implements Serializable {

	protected String updateTime; // 更新时间

	/**
	 * @return the updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}