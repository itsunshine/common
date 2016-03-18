/**
 * 
 */
package com.boliao.sunshine.biz.model;

import java.io.Serializable;

/**
 * @author Liaobo
 * 
 */
public class ProjExperiences implements Serializable {

	/** 项目经验开始时间 */
	private String proStartTime;

	/** 项目经验结束时间 */
	private String proEndTime;

	/** 登陆用户的id */
	private long uid;

	/** 项目名称 */
	private String projectName;

	/** 项目的软件环境 */
	private String softEnv;

	/** 项目用到的工具 */
	private String tools;

	/** 在该项目中的主要责任 */
	private String mainResp;

	/** 为该项目的主要贡献 */
	private String mainContr;

	/**
	 * @return the proStartTime
	 */
	public String getProStartTime() {
		return proStartTime;
	}

	/**
	 * @param proStartTime
	 *            the proStartTime to set
	 */
	public void setProStartTime(String proStartTime) {
		this.proStartTime = proStartTime;
	}

	/**
	 * @return the proEndTime
	 */
	public String getProEndTime() {
		return proEndTime;
	}

	/**
	 * @param proEndTime
	 *            the proEndTime to set
	 */
	public void setProEndTime(String proEndTime) {
		this.proEndTime = proEndTime;
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName
	 *            the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the softEnv
	 */
	public String getSoftEnv() {
		return softEnv;
	}

	/**
	 * @param softEnv
	 *            the softEnv to set
	 */
	public void setSoftEnv(String softEnv) {
		this.softEnv = softEnv;
	}

	/**
	 * @return the tools
	 */
	public String getTools() {
		return tools;
	}

	/**
	 * @param tools
	 *            the tools to set
	 */
	public void setTools(String tools) {
		this.tools = tools;
	}

	/**
	 * @return the mainResp
	 */
	public String getMainResp() {
		return mainResp;
	}

	/**
	 * @param mainResp
	 *            the mainResp to set
	 */
	public void setMainResp(String mainResp) {
		this.mainResp = mainResp;
	}

	/**
	 * @return the mainContr
	 */
	public String getMainContr() {
		return mainContr;
	}

	/**
	 * @param mainContr
	 *            the mainContr to set
	 */
	public void setMainContr(String mainContr) {
		this.mainContr = mainContr;
	}

	/**
	 * @return the uid
	 */
	public long getUid() {
		return uid;
	}

	/**
	 * @param uid
	 *            the uid to set
	 */
	public void setUid(long uid) {
		this.uid = uid;
	}

}
