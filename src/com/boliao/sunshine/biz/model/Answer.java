package com.boliao.sunshine.biz.model;

import java.io.Serializable;

/**
 * 问题的答案，为了缓存到ehcache进行了序列化
 * 
 * @author liaobo
 * 
 */
public class Answer implements Serializable {

	protected Long id;
	protected String content;// 内容
	protected String author; // 作者
	protected String createTime; // 创建时间
	protected String updateTime; // 更新时间
	protected Long questionId;

	@Override
	public String toString() {
		return "Answer [author=" + author + ", content=" + content
				+ ", createTime=" + createTime + ", id=" + id + ", questionId="
				+ questionId + ", updateTime=" + updateTime + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

}