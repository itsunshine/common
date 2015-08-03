package com.boliao.sunshine.biz.model;

import java.io.Serializable;

public class BaseModel implements Serializable {
	protected Long id;
	protected String title;// 标题
	protected String content;// 内容
	protected String source;// 来源
	protected String author; // 作者
	protected Integer typeId; // 分类
	protected String createTime; // 创建时间
	protected String updateTime; // 更新时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	@Override
	public String toString() {
		return "BaseModel [author=" + author + ", content=" + content
				+ ", createTime=" + createTime + ", id=" + id + ", source="
				+ source + ", title=" + title + ", typeId=" + typeId
				+ ", updateTime=" + updateTime + "]";
	}

}
