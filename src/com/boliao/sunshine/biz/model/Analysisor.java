/**
 * 
 */
package com.boliao.sunshine.biz.model;

import java.io.Serializable;

/**
 * 统计分析领域模型
 * 
 * @author Liaobo
 * 
 */
public class Analysisor implements Serializable {

	/** 地方 */
	private String comp;

	/** 扩展字段 */
	private int number;

	/** 格式化好的日期 */
	private String formatedDate;

	/**
	 * @return the comp
	 */
	public String getComp() {
		return comp;
	}

	/**
	 * @param comp
	 *            the comp to set
	 */
	public void setComp(String comp) {
		this.comp = comp;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the formatedDate
	 */
	public String getFormatedDate() {
		return formatedDate;
	}

	/**
	 * @param formatedDate
	 *            the formatedDate to set
	 */
	public void setFormatedDate(String formatedDate) {
		this.formatedDate = formatedDate;
	}

}
