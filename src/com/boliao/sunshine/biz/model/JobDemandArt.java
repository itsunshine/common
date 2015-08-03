/**
 * 
 */
package com.boliao.sunshine.biz.model;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

/**
 * 工作要求的类
 * 
 * @author Liaobo
 * 
 */
public class JobDemandArt implements Serializable {
	protected Long id;
	protected String title;// 标题
	protected String content;// 内容
	protected String source;// 来源
	protected String createTime; // 创建时间
	protected String location; // 工作地点
	protected Integer hrNumber; // 招聘人数
	protected Integer jobType; // 职位类别
	protected Integer recutType; // 招聘类别
	protected String companyName;// 公司名称
	protected String education = "本科";// 学历
	protected String jobTime = "全职";// 工作性质（全职、兼职）
	protected String departmentName;// 部门名称

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
	 * @return the jobTime
	 */
	public String getJobTime() {
		return jobTime;
	}

	/**
	 * @param jobTime
	 *            the jobTime to set
	 */
	public void setJobTime(String jobTime) {
		this.jobTime = jobTime;
	}

	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * @param education
	 *            the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = StringUtils.trim(title);
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = StringUtils.trim(content);
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(String source) {
		this.source = StringUtils.trim(source);
	}

	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = StringUtils.trim(createTime);
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
		this.location = StringUtils.trim(location);
	}

	/**
	 * @return the hrNumber
	 */
	public Integer getHrNumber() {
		return hrNumber;
	}

	/**
	 * @param hrNumber
	 *            the hrNumber to set
	 */
	public void setHrNumber(Integer hrNumber) {
		this.hrNumber = hrNumber;
	}

	/**
	 * @return the jobType
	 */
	public Integer getJobType() {
		return jobType;
	}

	/**
	 * @param jobType
	 *            the jobType to set
	 */
	public void setJobType(Integer jobType) {
		this.jobType = jobType;
	}

	/**
	 * @return the recutType
	 */
	public Integer getRecutType() {
		return recutType;
	}

	/**
	 * @param recutType
	 *            the recutType to set
	 */
	public void setRecutType(Integer recutType) {
		this.recutType = recutType;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName
	 *            the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = StringUtils.trim(companyName);
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName
	 *            the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = StringUtils.trim(departmentName);
	}

}
