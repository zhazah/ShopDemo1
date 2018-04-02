package com.xzh.dao;


import java.util.List;

import com.xzh.bean.CommodityDetails;
import com.xzh.bean.User;  
public interface ShoppingDao {  
   
	User findusernameandpassword(User user);

	void save(User user);



	List findAll(CommodityDetails commodityDetails);


	CommodityDetails findById(int cd_id);



	CommodityDetails findShopId(int cd_id);



	User loginUserName(User user);

	List findProduct(CommodityDetails commodityDetails);

	CommodityDetails findShopPrice(String cd_gross);


	List findShopPriceOne(CommodityDetails commodityDetails);

	List findShopPriceOneAndTwo(CommodityDetails commodityDetails);

	List findShopPriceTwoAndThree(CommodityDetails commodityDetails);

	List findShopPriceThree(CommodityDetails commodityDetails);

	List findShopSexMen(CommodityDetails commodityDetails);

	List findShopSexWoMen(CommodityDetails commodityDetails);  
}