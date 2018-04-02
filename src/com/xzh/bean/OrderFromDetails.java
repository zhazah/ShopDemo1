package com.xzh.bean;

public class OrderFromDetails {
	private int ofd_id;
	private OrderFrom orderFrom;
	private CommodityDetails commodityDetails;
	private GoodsDetail goodsDetail;
	private String ofd_univalence;
	private int ofd_number;
	
	public OrderFromDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOfd_id() {
		return ofd_id;
	}

	public void setOfd_id(int ofd_id) {
		this.ofd_id = ofd_id;
	}

	public OrderFrom getOrderFrom() {
		return orderFrom;
	}

	public void setOrderFrom(OrderFrom orderFrom) {
		this.orderFrom = orderFrom;
	}

	public CommodityDetails getCommodityDetails() {
		return commodityDetails;
	}

	public void setCommodityDetails(CommodityDetails commodityDetails) {
		this.commodityDetails = commodityDetails;
	}

	public GoodsDetail getGoodsDetail() {
		return goodsDetail;
	}

	public void setGoodsDetail(GoodsDetail goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getOfd_univalence() {
		return ofd_univalence;
	}

	public void setOfd_univalence(String ofd_univalence) {
		this.ofd_univalence = ofd_univalence;
	}

	public int getOfd_number() {
		return ofd_number;
	}

	public void setOfd_number(int ofd_number) {
		this.ofd_number = ofd_number;
	}
}
