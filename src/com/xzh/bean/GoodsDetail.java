package com.xzh.bean;

public class GoodsDetail {
	private int gd_id;
	private CommodityDetails commodityDetails;
	private String gd_specification;
	private String gd_price;
	private String gd_stock;
	
	public GoodsDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getGd_id() {
		return gd_id;
	}

	public void setGd_id(int gd_id) {
		this.gd_id = gd_id;
	}

	public CommodityDetails getCommodityDetails() {
		return commodityDetails;
	}

	public void setCommodityDetails(CommodityDetails commodityDetails) {
		this.commodityDetails = commodityDetails;
	}

	public String getGd_specification() {
		return gd_specification;
	}

	public void setGd_specification(String gd_specification) {
		this.gd_specification = gd_specification;
	}

	public String getGd_price() {
		return gd_price;
	}

	public void setGd_price(String gd_price) {
		this.gd_price = gd_price;
	}

	public String getGd_stock() {
		return gd_stock;
	}

	public void setGd_stock(String gd_stock) {
		this.gd_stock = gd_stock;
	}
}
