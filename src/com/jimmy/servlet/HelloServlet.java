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

	public static final String TAG = "ִ��";

	public HelloServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("ִ��Helloservlet()���췽��");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println(TAG + "destroy()����");

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println(TAG + "getServletConfig()����");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println(TAG + "getServletInfo()����");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println(TAG + "init()����");
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
		
		//ServletContext����ǰwebӦ��,���Կ�����webӦ�õĴ�ܼ�,������servletConfig��ȡ
		ServletContext servletContext = arg0.getServletContext();
		String driver = servletContext.getInitParameter("driver");
		System.out.println("driver:" + driver);
		Enumeration<String> names2 = servletContext.getInitParameterNames();
		while (names2.hasMoreElements()) {
			String name = names2.nextElement();
			String value = servletContext.getInitParameter(name);
			System.out.println("####" + name + ":" + value);
		}
		
		//��ȡWeb��ĳ���ļ��ľ���·��,���·�����ļ��ڷ������ϵľ���·��,�����ǲ���֮ǰ����Ŀ·��
		String realPath = servletContext.getRealPath("/note.txt");
		System.out.println(realPath);
		
		//��ȡ��ǰWebӦ�õ�����
		String contextPath = servletContext.getContextPath();
		System.out.println(contextPath);
		
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			InputStream inputStream = classLoader.getResourceAsStream("resources/jdbc.properties");
			System.out.println("��ʽ1:" + inputStream);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			InputStream inputStream = servletContext.getResourceAsStream("WEB-INF/classes/resources/jdbc.properties");
			System.out.println("��ʽ2:" + inputStream);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(TAG + "service()����");
	}

}
