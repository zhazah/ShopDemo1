package com.xzh.bean;

public class CommodityDetails {
	private int cd_id;
	private String cd_name;
	private String cd_img;
	private String cd_describe;
	private String cd_priceTier;
	private int cd_gross;
	private String cd_gaishu;
	private String cd_free;
	private String cd_sex;
	
	public String getCd_sex() {
		return cd_sex;
	}
	public void setCd_sex(String cd_sex) {
		this.cd_sex = cd_sex;
	}
	public String getCd_free() {
		return cd_free;
	}
	public void setCd_free(String cd_free) {
		this.cd_free = cd_free;
	}
	public String getCd_gaishu() {
		return cd_gaishu;
	}
	public void setCd_gaishu(String cd_gaishu) {
		this.cd_gaishu = cd_gaishu;
	}
	public CommodityDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCd_id() {
		return cd_id;
	}
	
	public String getCd_img() {
		return cd_img;
	}
	public void setCd_img(String cd_img) {
		this.cd_img = cd_img;
	}
	public void setCd_id(int cd_id) {
		this.cd_id = cd_id;
	}
	public String getCd_name() {
		return cd_name;
	}
	public void setCd_name(String cd_name) {
		this.cd_name = cd_name;
	}
	public String getCd_describe() {
		return cd_describe;
	}
	public void setCd_describe(String cd_describe) {
		this.cd_describe = cd_describe;
	}
	public String getCd_priceTier() {
		return cd_priceTier;
	}
	public void setCd_priceTier(String cd_priceTier) {
		this.cd_priceTier = cd_priceTier;
	}
	public int getCd_gross() {
		return cd_gross;
	}
	public void setCd_gross(int cd_gross) {
		this.cd_gross = cd_gross;
	}
}
