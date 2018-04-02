package com.xzh.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.xzh.bean.User;
import com.xzh.service.ShoppingService;

public class RegisterAction extends ActionSupport {
	//使用Ajax与数据库数据进行匹配，注册
	private String user_name;
	private ShoppingService shopServices;
	Map<String, Object> mapState = new HashMap<String, Object>();

	public String register() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		User user = new User();
		user.setUser_name(user_name);
		String user_name=request.getParameter("user_name");
		// 1.判断用户是否存在
		User user_temp = shopServices.loginUserName(user);
		if (user_temp != null) {
			mapState.put("readState", "error");
		} else {
			mapState.put("readState", "success");
		}
		return Action.SUCCESS;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setMapState(Map<String, Object> mapState) {
		this.mapState = mapState;
	}

	public Map<String, Object> getMapState() {
		return mapState;
	}

	public ShoppingService getShopServices() {
		return shopServices;
	}

	public void setShopServices(ShoppingService shopServices) {
		this.shopServices = shopServices;
	}

}
