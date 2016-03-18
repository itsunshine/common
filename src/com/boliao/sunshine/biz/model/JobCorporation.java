/**
 * 
 */
package com.boliao.sunshine.biz.model;

import java.io.Serializable;

/**
 * 公司类
 * 
 * @author Liaobo
 * 
 */
public class JobCorporation implements Serializable {
	/** id */
	private int id;

	/** 公司名 */
	private String name;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JobCorporation [id=" + id + ", name=" + name + "]";
	}

}
