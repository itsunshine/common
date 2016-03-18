/**
 * 
 */
package com.boliao.sunshine.biz.model;

import java.io.Serializable;

/**
 * @author liaobo
 * 
 *         用户基本信息
 * 
 */
public class PersonBasicInfo implements Serializable {

	/** 业务标示Id */
	private Long id;

	/** 登陆用户id */
	private Long uid;

	/** 用户名 */
	private String username;

	/** 性别 0表示男、1表示女 */
	private int sex;

	/** 生日 */
	private String birthDay;

	/** 电话号码 */
	private String phoneNum;

	/** 电子邮箱 */
	private String email;

	/** 年收入薪水 */
	private int salary;

	/** 婚姻状况 0表示未婚、1表示已婚、2表示保密 */
	private int marriage;

	/** 身高 */
	private int height;

	/** 微信号 */
	private String weixin;

	/** qq号 */
	private String qq;

	/** 个人技术总结 */
	private String skillDesc;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the birthDay
	 */
	public String getBirthDay() {
		return birthDay;
	}

	/**
	 * @param birthDay
	 *            the birthDay to set
	 */
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param phoneNum
	 *            the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the weixin
	 */
	public String getWeixin() {
		return weixin;
	}

	/**
	 * @param weixin
	 *            the weixin to set
	 */
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	/**
	 * @return the qq
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * @param qq
	 *            the qq to set
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * @return the skillDesc
	 */
	public String getSkillDesc() {
		return skillDesc;
	}

	/**
	 * @param skillDesc
	 *            the skillDesc to set
	 */
	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}

	/**
	 * @return the sex
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * @return the marriage
	 */
	public int getMarriage() {
		return marriage;
	}

	/**
	 * @param marriage
	 *            the marriage to set
	 */
	public void setMarriage(int marriage) {
		this.marriage = marriage;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
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
