/**
 * 
 */
package com.boliao.sunshine.biz.model;

import java.io.Serializable;

/**
 * 城市领域模型
 * 
 * @author Liaobo
 * 
 */
public class JobCity implements Serializable {

	/** id */
	private Integer id;

	/** 地方 */
	private String location;

	/** 扩展字段 */
	private String extend;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the extend
	 */
	public String getExtend() {
		return extend;
	}

	/**
	 * @param extend
	 *            the extend to set
	 */
	public void setExtend(String extend) {
		this.extend = extend;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JobCity [extend=" + extend + ", id=" + id + ", location=" + location + "]";
	}

}
