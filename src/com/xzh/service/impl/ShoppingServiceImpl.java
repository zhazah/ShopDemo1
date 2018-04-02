package com.xzh.service.impl;

import java.util.List;

import com.xzh.bean.CommodityDetails;
import com.xzh.bean.PageBean;
import com.xzh.bean.User;
import com.xzh.dao.ShoppingDao;
import com.xzh.service.ShoppingService;

public class ShoppingServiceImpl implements ShoppingService {

	private ShoppingDao shoppingDao;
	public void setShoppingDao(ShoppingDao shoppingDao) {
		this.shoppingDao = shoppingDao;
	}


	@Override
	public User login(User user) {
		User exituser=shoppingDao.findusernameandpassword(user);
		return exituser;
	}


	@Override
	public void save(User user) {
		shoppingDao.save(user);
	}

	
	@Override
	public List findAll(CommodityDetails commodityDetails) {
		return shoppingDao.findAll(commodityDetails);
	}




	@Override
	public CommodityDetails findById(int cd_id) {
		return shoppingDao.findById(cd_id);
	}






	@Override
	public CommodityDetails findShopId(int cd_id) {
		return shoppingDao.findShopId(cd_id);
	}




	@Override
	public User loginUserName(User user) {
		return shoppingDao.loginUserName(user);
	}


	@Override
	public List findProduct(CommodityDetails commodityDetails) {
		return shoppingDao.findProduct(commodityDetails);
	}




	@Override
	public List findShopPriceOne(CommodityDetails commodityDetails) {
		return shoppingDao.findShopPriceOne(commodityDetails);
	}


	@Override
	public List findShopPriceOneAndTwo(CommodityDetails commodityDetails) {
		return shoppingDao.findShopPriceOneAndTwo(commodityDetails);
	}


	@Override
	public List findShopPriceTwoAndThree(CommodityDetails commodityDetails) {
		return shoppingDao.findShopPriceTwoAndThree(commodityDetails);
	}


	@Override
	public List findShopPriceThree(CommodityDetails commodityDetails) {
		return shoppingDao.findShopPriceThree(commodityDetails);
	}


	@Override
	public List findShopSexMen(CommodityDetails commodityDetails) {
		return shoppingDao.findShopSexMen(commodityDetails);
	}


	@Override
	public List findShopSexWoMen(CommodityDetails commodityDetails) {
		// TODO Auto-generated method stub
		return shoppingDao.findShopSexWoMen(commodityDetails);
	}



	  
	}  
