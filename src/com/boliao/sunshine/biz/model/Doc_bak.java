package com.boliao.sunshine.biz.model;

/**
 * 
 * @author liaobo
 * 
 */
public class Doc_bak extends BaseModel {

	private Integer clickNumber; // 点击量

	@Override
	public String toString() {
		return "Question [clickNumber=" + clickNumber + ", author=" + author + ", content=" + content + ", createTime=" + createTime + ", id=" + id + ", source=" + source
				+ ", title=" + title + ", typeId=" + typeId + ", updateTime=" + updateTime + "]";
	}

	public Integer getClickNumber() {
		return clickNumber;
	}

	public void setClickNumber(Integer clickNumber) {
		this.clickNumber = clickNumber;
	}

}