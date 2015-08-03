/**
 * 
 */
package com.boliao.sunshine.biz.model;

import java.util.List;

/**
 * @author liaobo
 * 
 */
public class PageBase<T> {

	private int pageSize = 5;
	private int totalPage;
	private int pageNo = 1;
	private long totalCount;
	private List<T> results;

	public Integer getStart() {
		int start = (pageNo - 1) * pageSize;
		return start;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPage() {
		int totalPage = (int) (totalCount / pageSize);
		int modvalue = (int) (totalCount % pageSize);
		if (modvalue > 0) {
			totalPage++;
		}
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	// 获取pageNo的时候，如果pageNo比总页数到，就赋值总页数
	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public List<T> getResults() {
		return results;
	}

	public void setResults(List<T> results) {
		this.results = results;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
}
