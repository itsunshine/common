/**
 * 
 */
package com.boliao.sunshine.biz.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liaobo.lb
 * 
 */
public class User implements Serializable {
	private long id;
	private String userName;
	private String email;
	private final Map<String, String> extInfo = new HashMap<String, String>();
	private String address;
	private String password;
	private String birthDay;
	private String degree;
	private Date entered;

	/**
	 * @return the entered
	 */
	public Date getEntered() {
		return entered;
	}

	/**
	 * @param entered
	 *            the entered to set
	 */
	public void setEntered(Date entered) {
		this.entered = entered;
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
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * @param degree
	 *            the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the extInfo
	 */
	public Map<String, String> getExtInfo() {
		return extInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [address=" + address + ", birthDay=" + birthDay + ", degree=" + degree + ", email=" + email + ", extInfo=" + extInfo + ", id=" + id + ", password=" + password
				+ ", userName=" + userName + "]";
	}

}
