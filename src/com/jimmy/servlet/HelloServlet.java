package com.jimmy.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet {

	public static final String TAG = "执行";

	public HelloServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("执行Helloservlet()构造方法");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println(TAG + "destroy()方法");

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println(TAG + "getServletConfig()方法");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println(TAG + "getServletInfo()方法");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println(TAG + "init()方法");
		// TODO Auto-generated method stub
		String user = arg0.getInitParameter("user");
		System.out.println(user);

		Enumeration<String> names = arg0.getInitParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String value = arg0.getInitParameter(name);
			System.out.println("####" + name + ":" + value);
		}
		String servletName = arg0.getServletName();
		System.out.println(servletName);
		
		//ServletContext代表当前web应用,可以看做是web应用的大管家,可以由servletConfig获取
		ServletContext servletContext = arg0.getServletContext();
		String driver = servletContext.getInitParameter("driver");
		System.out.println("driver:" + driver);
		Enumeration<String> names2 = servletContext.getInitParameterNames();
		while (names2.hasMoreElements()) {
			String name = names2.nextElement();
			String value = servletContext.getInitParameter(name);
			System.out.println("####" + name + ":" + value);
		}
		
		//获取Web中某个文件的绝对路径,这个路径是文件在服务器上的绝对路径,而不是部署之前的项目路径
		String realPath = servletContext.getRealPath("/note.txt");
		System.out.println(realPath);
		
		//获取当前Web应用的名称
		String contextPath = servletContext.getContextPath();
		System.out.println(contextPath);
		
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			InputStream inputStream = classLoader.getResourceAsStream("resources/jdbc.properties");
			System.out.println("方式1:" + inputStream);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			InputStream inputStream = servletContext.getResourceAsStream("WEB-INF/classes/resources/jdbc.properties");
			System.out.println("方式2:" + inputStream);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(TAG + "service()方法");
	}

}
