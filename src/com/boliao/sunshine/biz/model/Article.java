package com.boliao.sunshine.biz.model;



public class Article extends BaseModel{
	private String keyword; //关键字
	private String intro; //简介
	private Boolean recommend; //是否推荐阅读
	private Integer clickNumber; //点击量
	private String deployTime; //发布时间
	

	@Override
	public String toString() {
		return "Article [author=" + author + ", clickNumber=" + clickNumber
				+ ", content=" + content + ", createTime=" + createTime
				+ ", deployTime=" + deployTime + ", id=" + id + ", intro="
				+ intro + ", keyword=" + keyword + ", recommend=" + recommend
				+ ", source=" + source + ", title=" + title + ", typeId="
				+ typeId + ", updateTime=" + updateTime + "]";
	}


	public String getKeyword() {
		return keyword;
	}


	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}


	public String getIntro() {
		return intro;
	}


	public void setIntro(String intro) {
		this.intro = intro;
	}


	public Boolean getRecommend() {
		return recommend;
	}


	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}


	public Integer getClickNumber() {
		return clickNumber;
	}


	public void setClickNumber(Integer clickNumber) {
		this.clickNumber = clickNumber;
	}


	public String getDeployTime() {
		return deployTime;
	}


	public void setDeployTime(String deployTime) {
		this.deployTime = deployTime;
	}
	
	
	
}
