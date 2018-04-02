package com.xzh.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xzh.bean.CommodityDetails;
import com.xzh.bean.User;
import com.xzh.dao.ShoppingDao;

public class ShoppingDaoImpl extends HibernateDaoSupport implements ShoppingDao  {

	

	@SuppressWarnings("unchecked")
	@Override
	public User findusernameandpassword(User user) {
		String hql="from User where user_name=? and user_password=?";
		List<User> list=this.getHibernateTemplate().find(hql,user.getUser_name(),user.getUser_password());
		if(list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	@Override
	public List findAll(CommodityDetails commodityDetails) {
		String hql="from CommodityDetails";
		return this.getHibernateTemplate().find(hql);
	}


	@Override
	public CommodityDetails findById(int cd_id) {
		return this.getHibernateTemplate().get(CommodityDetails.class, cd_id);
	}



	@Override
	public CommodityDetails findShopId(int cd_id) {
		return this.getHibernateTemplate().get(CommodityDetails.class, cd_id);
	}

	@Override
	public User loginUserName(User user) {
		String hql="from User where user_name=?";
		List<User> list=this.getHibernateTemplate().find(hql,user.getUser_name());
		if(list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public List findProduct(CommodityDetails commodityDetails) {
		String hql="from CommodityDetails";
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public CommodityDetails findShopPrice(String cd_gross) {
		
		return this.getHibernateTemplate().get(CommodityDetails.class, cd_gross);
	}

	@Override
	public List findShopPriceOne(CommodityDetails commodityDetails) {
		String hql="from CommodityDetails where cd_gross<100";
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public List findShopPriceOneAndTwo(CommodityDetails commodityDetails) {
		String hql="from CommodityDetails where cd_gross>=100 and cd_gross<=200";
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public List findShopPriceTwoAndThree(CommodityDetails commodityDetails) {
		String hql="from CommodityDetails where cd_gross>=200 and cd_gross<=300";
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public List findShopPriceThree(CommodityDetails commodityDetails) {
		String hql="from CommodityDetails where cd_gross>=300";
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public List findShopSexMen(CommodityDetails commodityDetails) {
		String hql="from CommodityDetails where cd_sex='ÄÐ'";
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public List findShopSexWoMen(CommodityDetails commodityDetails) {
		String hql="from CommodityDetails where cd_sex='Å®'";
		return this.getHibernateTemplate().find(hql);
	}


	






	
	
}
	



