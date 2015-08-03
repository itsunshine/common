/**
 * 
 */
package com.boliao.sunshine.biz.model;

/**
 * 城市领域模型
 * 
 * @author Liaobo
 * 
 */
public class JobCity {

	/** id */
	private int id;

	/** 地方 */
	private String location;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JobCity [id=" + id + ", location=" + location + "]";
	}

}
