/**
 * 
 */
package com.boliao.sunshine.biz.model;

/**
 * @author liaobo
 *
 */
public class ArticleType {
	private Integer id;
	private String type;
	private Boolean enabled;

	@Override
	public String toString() {
		return "ArticleType [enabled=" + enabled + ", id=" + id + ", type="
				+ type + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
}
