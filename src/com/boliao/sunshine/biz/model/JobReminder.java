/**
 * 
 */
package com.boliao.sunshine.biz.model;

import java.io.Serializable;

/**
 * @author liaobo
 * 
 *         工作提醒类
 * 
 */
public class JobReminder implements Serializable {

	/** 数据库标示id */
	private Long id;

	/** 用户id */
	private Long uid;

	/** 期望公司 */
	private String expComName;

	/** 期望职位 */
	private String expPosition;

	/** 工作提醒开始时间 */
	private String startTime;

	/** 工作提醒结束时间 */
	private String endTime;

	/** 创建时间 */
	private String createTime;

	/** 修改时间 */
	private String modifyTime;

	/** 记录类型，用于标示是否该条记录是否启用 */
	private Boolean rType = true;

	/**
	 * @return the expPosition
	 */
	public String getExpPosition() {
		return expPosition;
	}

	/**
	 * @param expPosition
	 *            the expPosition to set
	 */
	public void setExpPosition(String expPosition) {
		this.expPosition = expPosition;
	}

	/**
	 * @return the expComName
	 */
	public String getExpComName() {
		return expComName;
	}

	/**
	 * @param expComName
	 *            the expComName to set
	 */
	public void setExpComName(String expComName) {
		this.expComName = expComName;
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
		this.createTime = createTime;
	}

	/**
	 * @return the modifyTime
	 */
	public String getModifyTime() {
		return modifyTime;
	}

	/**
	 * @param modifyTime
	 *            the modifyTime to set
	 */
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * @return the rType
	 */
	public Boolean getrType() {
		return rType;
	}

	/**
	 * @return the rType
	 */
	public Boolean getRType() {
		return rType;
	}

	/**
	 * @param rType
	 *            the rType to set
	 */
	public void setrType(Boolean rType) {
		this.rType = rType;
	}

	/**
	 * @param rType
	 *            the rType to set
	 */
	public void setRType(Boolean rType) {
		this.rType = rType;
	}

}
