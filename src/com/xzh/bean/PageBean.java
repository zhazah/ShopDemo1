package com.xzh.bean;

import java.util.List;

/*
分页封装的类
*/
public class PageBean<T> {
	private Integer	currPage;//��ǰҳ��
	private Integer pageSize;//ÿҳ��ʾ�ļ�¼��
	private Integer totalCount;//�ܼ�¼��
	private Integer totalPage;//��ҳ��
	private List<T> list;//ÿҳ��ʾ������
	public Integer getCurrPage() {
		return currPage;
	}
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
}
