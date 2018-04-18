package com.jimmy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

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
		// ServletRequest:封装了请求的信息,可以从中获取到任何的请求信息
		// ServletResponse:封装了响应信息,如果想给用户响应什么信息,具体可以使用该接口的方法实现
		// 这两个接口的实现类都是Servelt服务器实现的
		// arg0:org.apache.catalina.connector.RequestFacade@3e49beeb
		System.out.println("Login请求来了");
		System.out.println(request);
		// getParameter()可以根据传递的参数名来获取到传递过来的数据
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println("用户名:" + userName + "---" + "密码:" + password);
		// getParameterValues()用来获取传递过来的参数名带有多组数据的时候
		String[] parms = request.getParameterValues("insteresting");
		for (String parm : parms) {
			System.out.println("interesting:" + parm);
		}
		Enumeration<String> enumeration = request.getParameterNames();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			System.out.println(string);
		}
		Map<String, String[]> map = request.getParameterMap();
		for (String s : map.keySet()) {
			System.out.println("key:" + s);
		}
		for (Entry<String, String[]> entry : map.entrySet()) {
			System.out.println("key= " + entry.getKey());
			for (String s : entry.getValue()) {
				System.out.println("value= " + s);
			}
		}
		//HttpServletRequest是ServletRequest的子接口,针对于HTTP请求所定义	,里面包含了大量获取HTTP信息的数据
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		//获取请求的uri
		String uri = httpServletRequest.getRequestURI();
		System.out.println("HTTP请求的uri:"+uri);
		//获取请求的方式	
		String reqMethod = httpServletRequest.getMethod();
		System.out.println("HTTP请求的方式:" + reqMethod);
		//如果是一个Get请求,获取请求参数对应的那个字符串,即?后的那个字符串
		//如果是一个post请求,那么queryString为null
		String queryString = httpServletRequest.getQueryString();
		System.out.println(queryString);
		//获取请求Servlet的映射路径
		String 	servletPath = httpServletRequest.getServletPath();
		System.out.println("Servlet的映射路径:" + servletPath);

		//ServletReponse：封装了响应信息，如果想给用户什么响应，具体可以使用该接口的方法实现
		//HttpServletReponse：是ServletResponse的子接口
		
		//设置响应的类型，比如我设置为：application/msword 然后在printWrite()中打印Hello World 
		//那么在浏览器中就会下载一个包含Hello World的world文件
//		response.setContentType("application/msword");
			
		//getWriter()：返回PrintWriter对象，调用该对象的print(String s)方法，将输入的字符串打印到客户的浏览器中
		PrintWriter printWriter =  response.getWriter();
		printWriter.print("Hello world");
		
		
		
		
	}

}
