/**
 * 
 */
package com.boliao.sunshine.biz.model;

/**
 * 用户返回给前端页面右侧的领域模型类
 * 
 * @author liaobo
 *
 */
public class Item {

	/**
	 * 业务数据的id
	 */
	private long id;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 哪一个标签页的数据
	 */
	private String type;

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
		this.title = title;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
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

}
