package com.xzh.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.map.HashedMap;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xzh.bean.CommodityDetails;
import com.xzh.bean.User;
import com.xzh.service.ShoppingService;

public class ShoppingAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();
	private String name;
	private List list;
	private List list1;
	private String cd_id;
	private String cd_gross;
	
	public String getCd_gross() {
		return cd_gross;
	}
	public void setCd_gross(String cd_gross) {
		this.cd_gross = cd_gross;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCd_id() {
		return cd_id;
	}

	public void setCd_id(String cd_id) {
		this.cd_id = cd_id;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	private CommodityDetails commodityDetails;

	public CommodityDetails getCommodityDetails() {
		return commodityDetails;
	}

	public void setCommodityDetails(CommodityDetails commodityDetails) {
		this.commodityDetails = commodityDetails;
	}

	private ShoppingService shoppingService;

	public void setShoppingService(ShoppingService shoppingService) {
		this.shoppingService = shoppingService;
	}

	// 商品登陆
	public String login() throws UnsupportedEncodingException {
		System.out.println("Login执行了");
		User exituser = shoppingService.login(user);
		if (exituser != null) {
			ActionContext.getContext().getSession().put("exituser", exituser);
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpServletResponse response = ServletActionContext.getResponse();
			request.setCharacterEncoding("utf-8");
			String[] iscookie = request.getParameterValues("isusecookie");
			if (iscookie != null && iscookie.length > 0) {
				String user_name = URLEncoder.encode(request.getParameter("user_name"), "utf-8");
				;
				String user_password = URLEncoder.encode(request.getParameter("user_password"), "utf-8");
				;

				Cookie usernamecookie = new Cookie("user_name", user_name);// 将用户名和密码保存在cookie中
				Cookie passwordcookie = new Cookie("user_password", user_password);
				usernamecookie.setMaxAge(864000);// 设置用户名和密码的最长存在期限
				passwordcookie.setMaxAge(864000);
				response.addCookie(usernamecookie);
				response.addCookie(passwordcookie);
			} else {
				Cookie[] cookies = request.getCookies();
				if (cookies != null || cookies.length > 0) {
					for (Cookie c : cookies) {
						if (c.getName().equals("user_name") || c.getName().equals("user_password")) {
							c.setMaxAge(0);// 设置用户名和密码的存在期限为0
							response.addCookie(c);// 重新保存
						}
					}
				}
			}
			return SUCCESS;

		} else {
			this.addActionError("用户名或密码输入错误");
			return INPUT;
		}
	}

	// 用户注册
	public String register() {
		System.out.println("reguster执行了");
		shoppingService.save(user);
		return "registerSuccess";

	}
	
	/*private String user_name;
    private Map<String,Object> map;
	public String jsonRegister(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		request.setCharacterEncoding("utf-8");
		System.out.println("jsonRegister执行了");
		boolean mark = false;
		
		//User user1 = shoppingService.loginUserName(user);
		
		String username = request.getParameter("user_name");
		System.out.println(username + "前台获取数据");

		
	if (user1 != null) {
			if (username.equals(user1.getUser_name())) {
				mark = true;
			}
		

		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		// PrintWriter out = response.getWriter();
		if (true) {
			// out.println("<font color='red'>该帐号已经存在，请重新输入!</font>");
			map.put("aabbcc", "1");
			// out.flush();// 刷新流
			// out.close();
		} else {
			// out.println("<font color='green'>恭喜您，该帐号可以使用!</font>");
			map.put("aabbcc", "2");
			// out.flush();// 刷新流
			// out.close();
		}
		if(user_name == "" || user_name == null) {
			map.put("state", "false");
		}else {
			map.put("state", "true");
		}
		return Action.SUCCESS;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
*/
	// 循环遍历所有index，jsp页面的商品
	public String findAll() {
		System.out.println("findAll执行了");
		list = shoppingService.findAll(commodityDetails);
		return "findAll";
	}

	// 根据id查找主页里面的数据，将数据单个传输
	public String findById() {
		System.out.println("findById执行了");
		commodityDetails = (CommodityDetails) shoppingService.findById(Integer.parseInt(cd_id));
		return "findById";
	}

	// 根据id把商品添加到购物车
	public String findShopId() {
		System.out.println("findShopId执行了");
		commodityDetails = (CommodityDetails) shoppingService.findShopId(Integer.parseInt(cd_id));
		return "findShopId";
	}
	
	// 循环遍历所有product，jsp页面的商品
	public String findProduct() {
		System.out.println("findAll执行了");
		list = shoppingService.findProduct(commodityDetails);
		return "findProduct";
	}
	
	// 通过服装价格价格把服装遍历出来,查询价格在100$一下的服装
	public String findShopPriceOne() {
		System.out.println("findShopPriceOne执行了");
		list=shoppingService.findShopPriceOne(commodityDetails);
		return "findShopPriceOne";
	}
	// 通过服装价格价格把服装遍历出来,查询价格在100$-200$的服装
	public String findShopPriceOneAndTwo() {
		System.out.println("findShopPriceOneAndTwo执行了");
		list=shoppingService.findShopPriceOneAndTwo(commodityDetails);
		return "findShopPriceOneAndTwo";
	}
	// 通过服装价格价格把服装遍历出来,查询价格在200$-300$的服装
	public String findShopPriceTwoAndThree() {
		System.out.println("findShopPriceTwoAndThree执行了");
		list=shoppingService.findShopPriceTwoAndThree(commodityDetails);
		return "findShopPriceTwoAndThree";
	}
	// 通过服装价格价格把服装遍历出来,查询价格在200$-300$的服装
	public String findShopPriceThree() {
		System.out.println("findShopPriceThree执行了");
		list=shoppingService.findShopPriceThree(commodityDetails);
		return "findShopPriceThree";
	}
	// 通过服装性别价格把服装遍历出来,查询性别为男的服装
	public String findShopSexMen() {
		System.out.println("findShopSexMen执行了");
		list=shoppingService.findShopSexMen(commodityDetails);
		return "findShopSexMen";
	}
	// 通过服装性别价格把服装遍历出来,查询性别为女的服装
	public String findShopSexWoMen() {
		System.out.println("findShopSexWoMen执行了");
		list=shoppingService.findShopSexWoMen(commodityDetails);
		return "findShopSexWoMen";
	}
	
}