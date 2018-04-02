package com.xzh.bean;

public class Footprint {
	private int fp_id;
	private User user;
	private CommodityDetails commodityDetails;
	private String fp_datatime;
	private int fp_viewCount;
	
	public Footprint() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getFp_id() {
		return fp_id;
	}

	public void setFp_id(int fp_id) {
		this.fp_id = fp_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CommodityDetails getCommodityDetails() {
		return commodityDetails;
	}

	public void setCommodityDetails(CommodityDetails commodityDetails) {
		this.commodityDetails = commodityDetails;
	}

	public String getFp_datatime() {
		return fp_datatime;
	}

	public void setFp_datatime(String fp_datatime) {
		this.fp_datatime = fp_datatime;
	}

	public int getFp_viewCount() {
		return fp_viewCount;
	}

	public void setFp_viewCount(int fp_viewCount) {
		this.fp_viewCount = fp_viewCount;
	}
}
