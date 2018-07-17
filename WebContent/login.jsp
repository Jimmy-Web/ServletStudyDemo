<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--<meta charset="utf-8"> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>登录</title>
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!-- JavaWeb路径是一个非常值得注意的问题，因为浏览器跟服务器的根路径“/”表示的意思是不同的 -->
<link rel="stylesheet" href="res/css/amazeui.min.css">
<link rel="stylesheet" href="res/css/app.css">
</head>
<body>
	<div class="am-g myapp-login">
		<div class="myapp-login-logo-block">
			<div class="myapp-login-logo-text">
				<!-- 				<div class="myapp-login-logo-text"> -->
				<!-- 					Browser<span>Sync</span> <i class="am-icon-skyatlas"></i> -->
				<!-- 				</div> -->
				<div class="myapp-login-logo-text">JavaWeb从入门到精通</div>
			</div>

			<div class="login-font">
				<i></i><span></span>
			</div>
			<div class="am-u-sm-10 login-am-center">
				<form action="index.jsp" class="am-form" onsubmit="return submit()">
					<fieldset>
						<div class="am-form-group">
							<input type="text" class="" id="doc-ipt-email-1" name="userName"
								placeholder="请输入手机号/电子邮件/账号">
						</div>
						<br />
						<div class="am-form-group">
							<input type="password" class="" id="doc-ipt-pwd-1"
								name="password" placeholder="请输入密码">
						</div>
						<p>
							<button type="submit" class="am-btn am-btn-default">登录</button>
						</p>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
	<script src="res/js/jquery.min.js"></script>
	<script src="res/js/amazeui.min.js"></script>
	<script src="res/js/app.js"></script>
	<script type="text/javascript" src="res/js/login/login.js"></script>
</body>
</html>