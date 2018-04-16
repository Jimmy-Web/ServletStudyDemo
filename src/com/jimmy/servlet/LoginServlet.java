package com.jimmy.servlet;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//ServletRequest:封装了请求的信息,可以从中获取到任何的请求信息
		//ServletResponse:封装了响应信息,如果想给用户响应什么信息,具体可以使用该接口的方法实现
		//这两个接口的实现类都是Servelt服务器实现的
		//arg0:org.apache.catalina.connector.RequestFacade@3e49beeb
		System.out.println("Login请求来了");
		System.out.println(request);
		//getParameter()可以根据传递的参数名来获取到传递过来的数据
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println("用户名:" +userName + "---" +"密码:" + password);
		//getParameterValues()用来获取传递过来的参数名带有多组数据的时候
		String[] parms = request.getParameterValues("insteresting");
		for(String parm :parms){
			System.out.println("interesting:" + parm);
		}
		Enumeration<String> enumeration =  request.getParameterNames();
		
		Map<String, String[]> map = request.getParameterMap();
		
	}

}
