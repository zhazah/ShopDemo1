package com.xzh.bean;

public class ShoppingCart {
	private int sc_id;
	private CommodityDetails commodityDetails;
	private int sc_count;
	private GoodsDetail goodsDetail;
	private User user;
	private int sc_sessionid;
	private String sc_datatime;
	
	public ShoppingCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSc_id() {
		return sc_id;
	}

	public void setSc_id(int sc_id) {
		this.sc_id = sc_id;
	}

	public CommodityDetails getCommodityDetails() {
		return commodityDetails;
	}

	public void setCommodityDetails(CommodityDetails commodityDetails) {
		this.commodityDetails = commodityDetails;
	}

	public int getSc_count() {
		return sc_count;
	}

	public void setSc_count(int sc_count) {
		this.sc_count = sc_count;
	}

	public GoodsDetail getGoodsDetail() {
		return goodsDetail;
	}

	public void setGoodsDetail(GoodsDetail goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getSc_sessionid() {
		return sc_sessionid;
	}

	public void setSc_sessionid(int sc_sessionid) {
		this.sc_sessionid = sc_sessionid;
	}

	public String getSc_datatime() {
		return sc_datatime;
	}

	public void setSc_datatime(String sc_datatime) {
		this.sc_datatime = sc_datatime;
	}
}
