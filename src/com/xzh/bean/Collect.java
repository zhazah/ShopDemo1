package com.xzh.bean;

public class Collect {
	private int c_id;
	private CommodityDetails commodityDetails;
	private User user;
	private String c_datatime;
	
	public Collect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public CommodityDetails getCommodityDetails() {
		return commodityDetails;
	}

	public void setCommodityDetails(CommodityDetails commodityDetails) {
		this.commodityDetails = commodityDetails;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getC_datatime() {
		return c_datatime;
	}

	public void setC_datatime(String c_datatime) {
		this.c_datatime = c_datatime;
	}
}
