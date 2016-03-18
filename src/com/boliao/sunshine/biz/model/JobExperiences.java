/**
 * 
 */
package com.boliao.sunshine.biz.model;

import java.io.Serializable;

/**
 * @author Liaobo
 * 
 */
public class JobExperiences implements Serializable {

	/** 业务id号 */
	private Long id;

	/** 登陆用户id */
	private Long uid;

	/** 工作开始时间 */
	private String jobStartTime;

	/** 工作结束时间 */
	private String jobEndTime;

	/** 公司 */
	private String company;

	/** 行业 */
	private String industry;

	/** 员工数 */
	private int staffNums;

	/** 公司性质 */
	private String compType;

	/** 所在部门 */
	private String departMent;

	/** 公司职位 */
	private String position;

	/** 主要工作描述 */
	private String jobDesc;

	/**
	 * @return the jobStartTime
	 */
	public String getJobStartTime() {
		return jobStartTime;
	}

	/**
	 * @param jobStartTime
	 *            the jobStartTime to set
	 */
	public void setJobStartTime(String jobStartTime) {
		this.jobStartTime = jobStartTime;
	}

	/**
	 * @return the jobEndTime
	 */
	public String getJobEndTime() {
		return jobEndTime;
	}

	/**
	 * @param jobEndTime
	 *            the jobEndTime to set
	 */
	public void setJobEndTime(String jobEndTime) {
		this.jobEndTime = jobEndTime;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the industry
	 */
	public String getIndustry() {
		return industry;
	}

	/**
	 * @param industry
	 *            the industry to set
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	/**
	 * @return the staffNums
	 */
	public int getStaffNums() {
		return staffNums;
	}

	/**
	 * @param staffNums
	 *            the staffNums to set
	 */
	public void setStaffNums(int staffNums) {
		this.staffNums = staffNums;
	}

	/**
	 * @return the compType
	 */
	public String getCompType() {
		return compType;
	}

	/**
	 * @param compType
	 *            the compType to set
	 */
	public void setCompType(String compType) {
		this.compType = compType;
	}

	/**
	 * @return the departMent
	 */
	public String getDepartMent() {
		return departMent;
	}

	/**
	 * @param departMent
	 *            the departMent to set
	 */
	public void setDepartMent(String departMent) {
		this.departMent = departMent;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the jobDesc
	 */
	public String getJobDesc() {
		return jobDesc;
	}

	/**
	 * @param jobDesc
	 *            the jobDesc to set
	 */
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

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

}
