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
		//ServletRequest:��װ���������Ϣ,���Դ��л�ȡ���κε�������Ϣ
		//ServletResponse:��װ����Ӧ��Ϣ,�������û���Ӧʲô��Ϣ,�������ʹ�øýӿڵķ���ʵ��
		//�������ӿڵ�ʵ���඼��Servelt������ʵ�ֵ�
		//arg0:org.apache.catalina.connector.RequestFacade@3e49beeb
		System.out.println("Login��������");
		System.out.println(request);
		//getParameter()���Ը��ݴ��ݵĲ���������ȡ�����ݹ���������
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println("�û���:" +userName + "---" +"����:" + password);
		//getParameterValues()������ȡ���ݹ����Ĳ��������ж������ݵ�ʱ��
		String[] parms = request.getParameterValues("insteresting");
		for(String parm :parms){
			System.out.println("interesting:" + parm);
		}
		Enumeration<String> enumeration =  request.getParameterNames();
		
		Map<String, String[]> map = request.getParameterMap();
		
	}

}
