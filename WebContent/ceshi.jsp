<%@ page language="java" import="java.net.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shopin Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndroId Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--theme-style-->
<link href="css/style4.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<script src="js/jquery.min.js"></script>
<!--- start-rate---->
<script src="js/jstarbox.js"></script>
	<link rel="stylesheet" href="css/jstarbox.css" type="text/css" media="screen" charset="utf-8" />
		<script type="text/javascript">
			jQuery(function() {
			jQuery('.starbox').each(function() {
				var starbox = jQuery(this);
					starbox.starbox({
					average: starbox.attr('data-start-value'),
					changeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,
					ghosting: starbox.hasClass('ghosting'),
					autoUpdateAverage: starbox.hasClass('autoupdate'),
					buttons: starbox.hasClass('smooth') ? false : starbox.attr('data-button-count') || 5,
					stars: starbox.attr('data-star-count') || 5
					}).bind('starbox-value-changed', function(event, value) {
					if(starbox.hasClass('random')) {
					var val = Math.random();
					starbox.next().text(' '+val);
					return val;
					} 
				})
			});
		});
		</script>
		<script type="text/javascript">
	function reloadCode(){
		var time=new Date().getTime();
		document.getElementById("imagecode").src="<%=request.getContextPath() %>/ImageServlet?d="+time;
		}
	</script>
		
<!---//End-rate---->
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String user_name="";
	String user_password="";
	Cookie [] cookies=request.getCookies();
	if(cookies!=null || cookies.length>0){
		for(Cookie c:cookies){
			if(c.getName().equals("user_name")){
				user_name=URLDecoder.decode(c.getValue(),"utf-8");
			}
			if(c.getName().equals("user_password")){
				user_password=URLDecoder.decode(c.getValue(),"utf-8");
			}
		}
	}
%>
<!--header-->
<div class="header">
<div class="container">
		<div class="head">
			<div class=" logo">
				<a href="#"><img src="images/logo.png" alt=""></a>	
			</div>
		</div>
	</div>
	<div class="header-top">
		<div class="container">
		<div class="col-sm-5 col-md-offset-2  header-login">
					<ul >
						<li><a href="#">Login</a></li>
						<li><a href="#">Register</a></li>
						<li><a href="#">Checkout</a></li>
					</ul>
				</div>
				
			<div class="col-sm-5 header-social">		
					<ul >
						<li><a href="#"><i></i></a></li>
						<li><a href="#"><i class="ic1"></i></a></li>
						<li><a href="#"><i class="ic2"></i></a></li>
						<li><a href="#"><i class="ic3"></i></a></li>
						<li><a href="#"><i class="ic4"></i></a></li>
					</ul>
					
			</div>
				<div class="clearfix"> </div>
		</div>
		</div>
		
		<div class="container">
		
			<div class="head-top">
			
		 <div class="col-sm-8 col-md-offset-2 h_menu4">
				<nav class="navbar nav_bottom" role="navigation">
 
 <!-- Brand and toggle get grouped for better mobile display -->
  <div class="navbar-header nav_2">
      <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
     
   </div> 
   <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
        <ul class="nav navbar-nav nav_1">
        
            <li><a class="color" href="#" onclick="return confirm('请先进行登陆')">Home</a></li>
            
    		<li class="dropdown mega-dropdown active">
			    <a class="color1" href="#" onclick="return confirm('请先进行登陆')" class="dropdown-toggle" data-toggle="dropdown">Women<span class="caret"></span></a>				
				<div class="dropdown-menu ">
                    <div class="menu-top">
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu1</h4>
									<ul>
										<li><a href="#" onclick="return confirm('请先进行登陆')">Accessories</a></li>
										<li><a href="#" onclick="return confirm('请先进行登陆')">Bags</a></li>
										<li><a href="#" onclick="return confirm('请先进行登陆')">Caps & Hats</a></li>
										<li><a href="#" onclick="return confirm('请先进行登陆')">Hoodies & Sweatshirts</a></li>
										
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu2</h4>
								<ul>
										<li><a href="#">Jackets & Coats</a></li>
										<li><a href="#">Jeans</a></li>
										<li><a href="#">Jewellery</a></li>
										<li><a href="#">Jumpers & Cardigans</a></li>
										<li><a href="#">Leather Jackets</a></li>
										<li><a href="#">Long Sleeve T-Shirts</a></li>
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu3</h4>
									<ul>
										<li><a href="#">Shirts</a></li>
										<li><a href="#">Shoes, Boots & Trainers</a></li>
										<li><a href="#">Sunglasses</a></li>
										<li><a href="#">Sweatpants</a></li>
										<li><a href="#">Swimwear</a></li>
										<li><a href="#">Trousers & Chinos</a></li>
										
									</ul>	
								
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu4</h4>
								<ul>
									<li><a href="#">T-Shirts</a></li>
									<li><a href="#">Underwear & Socks</a></li>
									<li><a href="#">Vests</a></li>
									<li><a href="#">Jackets & Coats</a></li>
									<li><a href="#">Jeans</a></li>
									<li><a href="#">Jewellery</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1 col5">
						<img src="images/me.png" class="img-responsive" alt="">
						</div>
						<div class="clearfix"></div>
					</div>                  
				</div>				
			</li>
			<li class="dropdown mega-dropdown active">
			    <a class="color2" href="#" onclick="return confirm('请先进行登陆')" class="dropdown-toggle" data-toggle="dropdown">Men<span class="caret"></span></a>				
				<div class="dropdown-menu mega-dropdown-menu">
                    <div class="menu-top">
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu1</h4>
									<ul>
										<li><a href="#">Accessories</a></li>
										<li><a href="#">Bags</a></li>
										<li><a href="#">Caps & Hats</a></li>
										<li><a href="#">Hoodies & Sweatshirts</a></li>
										
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu2</h4>
								<ul>
										<li><a href="#">Jackets & Coats</a></li>
										<li><a href="#">Jeans</a></li>
										<li><a href="#">Jewellery</a></li>
										<li><a href="#">Jumpers & Cardigans</a></li>
										<li><a href="#">Leather Jackets</a></li>
										<li><a href="#">Long Sleeve T-Shirts</a></li>
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu3</h4>
								
<ul>
										<li><a href="#">Shirts</a></li>
										<li><a href="#">Shoes, Boots & Trainers</a></li>
										<li><a href="#">Sunglasses</a></li>
										<li><a href="#">Sweatpants</a></li>
										<li><a href="#">Swimwear</a></li>
										<li><a href="#">Trousers & Chinos</a></li>
										
									</ul>	
								
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu4</h4>
								<ul>
									<li><a href="#">T-Shirts</a></li>
									<li><a href="#">Underwear & Socks</a></li>
									<li><a href="#">Vests</a></li>
									<li><a href="#">Jackets & Coats</a></li>
									<li><a href="#">Jeans</a></li>
									<li><a href="#">Jewellery</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1 col5">
						<img src="images/me1.png" class="img-responsive" alt="">
						</div>
						<div class="clearfix"></div>
					</div>                  
				</div>				
			</li>
			<li><a class="color3" href="#" onclick="return confirm('请先进行登陆')">Sale</a></li>
			<li><a class="color4" href="#" onclick="return confirm('请先进行登陆')">About</a></li>
            <li><a class="color5" href="#" onclick="return confirm('请先进行登陆')">Short Codes</a></li>
            <li ><a class="color6" href="#" onclick="return confirm('请先进行登陆')">Contact</a></li>
        </ul>
     </div><!-- /.navbar-collapse -->

</nav>
			</div>
			<div class="col-sm-2 search-right">
				<ul class="heart">
				<li>
				<a href="#" >
				<span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
				</a></li>
				<li><a class="play-icon popup-with-zoom-anim" href="#small-dialog"><i class="glyphicon glyphicon-search"> </i></a></li>
					</ul>
					<div class="cart box_1">
						<a href="#">
						<h3> <div class="total">
							<span class="simpleCart_total"></span></div>
							<img src="images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
					<div class="clearfix"> </div>
					
						<!----->

						<!---pop-up-box---->					  
			<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
			<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
			<!---//pop-up-box---->
			<div id="small-dialog" class="mfp-hide">
				<div class="search-top">
					<div class="login-search">
						<input type="submit" value="">
						<input type="text" value="Search.." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search..';}">		
					</div>
					<p>Shopin</p>
				</div>				
			</div>
		 <script>
			$(document).ready(function() {
			$('.popup-with-zoom-anim').magnificPopup({
			type: 'inline',
			fixedContentPos: false,
			fixedBgPos: true,
			overflowY: 'auto',
			closeBtnInside: true,
			preloader: false,
			midClick: true,
			removalDelay: 300,
			mainClass: 'my-mfp-zoom-in'
			});
																						
			});
		</script>		
						<!----->
			</div>
			<div class="clearfix"></div>
		</div>	
	</div>	
</div>
<!--banner-->
<div class="banner-top">
	<div class="container">
		<h1>Login</h1>
		<em></em>
		<h2><a href="#">Home</a><label>/</label>Login</a></h2>
	</div>
</div>
<!--login-->
<div class="container">
		<div class="login">
		
			<form action="shopping_login" method="post" name="/">
			<div class="col-md-6 login-do">
				<div class="login-mail">
					<input type="text" name="user_name" value="<%=user_name %>" placeholder="name" required="">
					<i  class="glyphicon glyphicon-envelope"></i>
				</div>
				<div class="login-mail">
					<input type="password" name="user_password" value="<%=user_password %>" placeholder="password" required="">
					<i class="glyphicon glyphicon-lock"></i>
				</div>
				<div class="login-mail">
					<input type="text" id="checkcode" name="checkcode" class="text captcha" maxlength="4" autocomplete="off" onblur="validateCode()" />
    				<img id="rightcode" src="${pageContext.request.contextPath}/checkImg.action" alt="点击换一张" onclick="ChangeCodeImg()" />
					<a href="javaScript:reloadCode();">点击切换图片</a>
					<i class="glyphicon glyphicon-lock"></i>
				</div>
				   <a class="news-letter " href="#">
						 <label class="checkbox1"><input type="checkbox" name="isusecookie" checked="checked"><i> </i>十天内记住账号和密码</label>
					   </a>
				<label class="hvr-skew-backward">
					<input type="submit" value="login">
				</label>
			</div>
			<div class="col-md-6 login-right">
				 <h3>Completely Free Account</h3>
				 
				 <p><font color="red"><s:actionerror/></font>如果你还没有账户,那么，这个网站将是您最好的选择，这是一个免费的网站，点击下方“Register”进行注册</p>
				<a href="register.jsp" class=" hvr-skew-backward">Register</a>

			</div>
			
			<div class="clearfix"> </div>
			</form>
		</div>

</div>

<!--//login-->

			<!--brand-->
		<div class="container">
			<div class="brand">
				<div class="col-md-3 brand-grid">
					<img src="images/ic.png" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="images/ic1.png" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="images/ic2.png" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="images/ic3.png" class="img-responsive" alt="">
				</div>
				<div class="clearfix"></div>
			</div>
			</div>
			<!--//brand-->
			</div>
			
		</div>
	<!--//content-->
		<!--//footer-->
	<div class="footer">
	<div class="footer-middle">
				<div class="container">
					<div class="col-md-3 footer-middle-in">
						<a href="#"><img src="images/log.png" alt=""></a>
						<p>Suspendisse sed accumsan risus. Curabitur rhoncus, elit vel tincidunt elementum, nunc urna tristique nisi, in interdum libero magna tristique ante. adipiscing varius. Vestibulum dolor lorem.</p>
					</div>
					
					<div class="col-md-3 footer-middle-in">
						<h6>Information</h6>
						<ul class=" in">
							<li><a href="#">About</a></li>
							<li><a href="#">Contact Us</a></li>
							<li><a href="#">Returns</a></li>
							<li><a href="#">Site Map</a></li>
						</ul>
						<ul class="in in1">
							<li><a href="#">Order History</a></li>
							<li><a href="#">Wish List</a></li>
							<li><a href="#">Login</a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="col-md-3 footer-middle-in">
						<h6>Tags</h6>
						<ul class="tag-in">
							<li><a href="#">Lorem</a></li>
							<li><a href="#">Sed</a></li>
							<li><a href="#">Ipsum</a></li>
							<li><a href="#">Contrary</a></li>
							<li><a href="#">Chunk</a></li>
							<li><a href="#">Amet</a></li>
							<li><a href="#">Omnis</a></li>
						</ul>
					</div>
					<div class="col-md-3 footer-middle-in">
						<h6>Newsletter</h6>
						<span>Sign up for News Letter</span>
							<form>
								<input type="text" value="Enter your E-mail" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='Enter your E-mail';}">
								<input type="submit" value="Subscribe">	
							</form>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
			<div class="footer-bottom">
				<div class="container">
					<ul class="footer-bottom-top">
						<li><a href="#"><img src="images/f1.png" class="img-responsive" alt=""></a></li>
						<li><a href="#"><img src="images/f2.png" class="img-responsive" alt=""></a></li>
						<li><a href="#"><img src="images/f3.png" class="img-responsive" alt=""></a></li>
					</ul>
					<p class="footer-class">Copyright &copy; 2016.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<!--//footer-->

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

	<script src="js/simpleCart.min.js"> </script>
<!-- slide -->
<script src="js/bootstrap.min.js"></script>
 
</body>
</html>