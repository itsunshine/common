/**
 * 
 */
package com.boliao.sunshine.biz.model;

import java.io.Serializable;

/**
 * @author Liaobo
 * 
 *         教育实体类
 * 
 */
public class Education implements Serializable {

	/** 业务标示Id */
	private Long id;

	/** 登陆用户id */
	private Long uid;

	/** 开始时间 */
	private String startTime;

	/** 结束时间 */
	private String endTime;

	/** 学校 */
	private String school;

	/** 专业 */
	private String mayor;

	/** 专业描述 */
	private String proDesc;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the uid
	 */
	public Long getUid() {
		return uid;
	}

	/**
	 * @param uid
	 *            the uid to set
	 */
	public void setUid(Long uid) {
		this.uid = uid;
	}

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school
	 *            the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * @return the mayor
	 */
	public String getMayor() {
		return mayor;
	}

	/**
	 * @param mayor
	 *            the mayor to set
	 */
	public void setMayor(String mayor) {
		this.mayor = mayor;
	}

	/**
	 * @return the proDesc
	 */
	public String getProDesc() {
		return proDesc;
	}

	/**
	 * @param proDesc
	 *            the proDesc to set
	 */
	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime
	 *            the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
