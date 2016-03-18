/**
 * 
 */
package com.boliao.sunshine.biz.model;

import java.io.Serializable;

/**
 * @author Liaobo 用户和简历的映射关系表
 * 
 */
public class Uresume implements Serializable {
	/** 数据库标示id */
	private Long id;

	/** 用户id */
	private Long uid;

	/** 记录类型，用于标示是否该条记录是否启用 */
	private Boolean isRes = true;

	/** 简历地址 */
	private String resume;

	/** 创建时间 */
	private String createTime;

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
	 * @return the isRes
	 */
	public Boolean getIsRes() {
		return isRes;
	}

	/**
	 * @param isRes
	 *            the isRes to set
	 */
	public void setIsRes(Boolean isRes) {
		this.isRes = isRes;
	}

	/**
	 * @return the resume
	 */
	public String getResume() {
		return resume;
	}

	/**
	 * @param resume
	 *            the resume to set
	 */
	public void setResume(String resume) {
		this.resume = resume;
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

}
