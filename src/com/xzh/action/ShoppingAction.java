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

	// ��Ʒ��½
	public String login() throws UnsupportedEncodingException {
		System.out.println("Loginִ����");
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

				Cookie usernamecookie = new Cookie("user_name", user_name);// ���û��������뱣����cookie��
				Cookie passwordcookie = new Cookie("user_password", user_password);
				usernamecookie.setMaxAge(864000);// �����û�������������������
				passwordcookie.setMaxAge(864000);
				response.addCookie(usernamecookie);
				response.addCookie(passwordcookie);
			} else {
				Cookie[] cookies = request.getCookies();
				if (cookies != null || cookies.length > 0) {
					for (Cookie c : cookies) {
						if (c.getName().equals("user_name") || c.getName().equals("user_password")) {
							c.setMaxAge(0);// �����û���������Ĵ�������Ϊ0
							response.addCookie(c);// ���±���
						}
					}
				}
			}
			return SUCCESS;

		} else {
			this.addActionError("�û����������������");
			return INPUT;
		}
	}

	// �û�ע��
	public String register() {
		System.out.println("regusterִ����");
		shoppingService.save(user);
		return "registerSuccess";

	}
	
	/*private String user_name;
    private Map<String,Object> map;
	public String jsonRegister(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		request.setCharacterEncoding("utf-8");
		System.out.println("jsonRegisterִ����");
		boolean mark = false;
		
		//User user1 = shoppingService.loginUserName(user);
		
		String username = request.getParameter("user_name");
		System.out.println(username + "ǰ̨��ȡ����");

		
	if (user1 != null) {
			if (username.equals(user1.getUser_name())) {
				mark = true;
			}
		

		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		// PrintWriter out = response.getWriter();
		if (true) {
			// out.println("<font color='red'>���ʺ��Ѿ����ڣ�����������!</font>");
			map.put("aabbcc", "1");
			// out.flush();// ˢ����
			// out.close();
		} else {
			// out.println("<font color='green'>��ϲ�������ʺſ���ʹ��!</font>");
			map.put("aabbcc", "2");
			// out.flush();// ˢ����
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
	// ѭ����������index��jspҳ�����Ʒ
	public String findAll() {
		System.out.println("findAllִ����");
		list = shoppingService.findAll(commodityDetails);
		return "findAll";
	}

	// ����id������ҳ��������ݣ������ݵ�������
	public String findById() {
		System.out.println("findByIdִ����");
		commodityDetails = (CommodityDetails) shoppingService.findById(Integer.parseInt(cd_id));
		return "findById";
	}

	// ����id����Ʒ��ӵ����ﳵ
	public String findShopId() {
		System.out.println("findShopIdִ����");
		commodityDetails = (CommodityDetails) shoppingService.findShopId(Integer.parseInt(cd_id));
		return "findShopId";
	}
	
	// ѭ����������product��jspҳ�����Ʒ
	public String findProduct() {
		System.out.println("findAllִ����");
		list = shoppingService.findProduct(commodityDetails);
		return "findProduct";
	}
	
	// ͨ����װ�۸�۸�ѷ�װ��������,��ѯ�۸���100$һ�µķ�װ
	public String findShopPriceOne() {
		System.out.println("findShopPriceOneִ����");
		list=shoppingService.findShopPriceOne(commodityDetails);
		return "findShopPriceOne";
	}
	// ͨ����װ�۸�۸�ѷ�װ��������,��ѯ�۸���100$-200$�ķ�װ
	public String findShopPriceOneAndTwo() {
		System.out.println("findShopPriceOneAndTwoִ����");
		list=shoppingService.findShopPriceOneAndTwo(commodityDetails);
		return "findShopPriceOneAndTwo";
	}
	// ͨ����װ�۸�۸�ѷ�װ��������,��ѯ�۸���200$-300$�ķ�װ
	public String findShopPriceTwoAndThree() {
		System.out.println("findShopPriceTwoAndThreeִ����");
		list=shoppingService.findShopPriceTwoAndThree(commodityDetails);
		return "findShopPriceTwoAndThree";
	}
	// ͨ����װ�۸�۸�ѷ�װ��������,��ѯ�۸���200$-300$�ķ�װ
	public String findShopPriceThree() {
		System.out.println("findShopPriceThreeִ����");
		list=shoppingService.findShopPriceThree(commodityDetails);
		return "findShopPriceThree";
	}
	// ͨ����װ�Ա�۸�ѷ�װ��������,��ѯ�Ա�Ϊ�еķ�װ
	public String findShopSexMen() {
		System.out.println("findShopSexMenִ����");
		list=shoppingService.findShopSexMen(commodityDetails);
		return "findShopSexMen";
	}
	// ͨ����װ�Ա�۸�ѷ�װ��������,��ѯ�Ա�ΪŮ�ķ�װ
	public String findShopSexWoMen() {
		System.out.println("findShopSexWoMenִ����");
		list=shoppingService.findShopSexWoMen(commodityDetails);
		return "findShopSexWoMen";
	}
	
}