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
		// ServletRequest:��װ���������Ϣ,���Դ��л�ȡ���κε�������Ϣ
		// ServletResponse:��װ����Ӧ��Ϣ,�������û���Ӧʲô��Ϣ,�������ʹ�øýӿڵķ���ʵ��
		// �������ӿڵ�ʵ���඼��Servelt������ʵ�ֵ�
		// arg0:org.apache.catalina.connector.RequestFacade@3e49beeb
		System.out.println("Login��������");
		System.out.println(request);
		// getParameter()���Ը��ݴ��ݵĲ���������ȡ�����ݹ���������
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println("�û���:" + userName + "---" + "����:" + password);
		// getParameterValues()������ȡ���ݹ����Ĳ��������ж������ݵ�ʱ��
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
		//HttpServletRequest��ServletRequest���ӽӿ�,�����HTTP����������	,��������˴�����ȡHTTP��Ϣ������
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		//��ȡ�����uri
		String uri = httpServletRequest.getRequestURI();
		System.out.println("HTTP�����uri:"+uri);
		//��ȡ����ķ�ʽ	
		String reqMethod = httpServletRequest.getMethod();
		System.out.println("HTTP����ķ�ʽ:" + reqMethod);
		//�����һ��Get����,��ȡ���������Ӧ���Ǹ��ַ���,��?����Ǹ��ַ���
		//�����һ��post����,��ôqueryStringΪnull
		String queryString = httpServletRequest.getQueryString();
		System.out.println(queryString);
		//��ȡ����Servlet��ӳ��·��
		String 	servletPath = httpServletRequest.getServletPath();
		System.out.println("Servlet��ӳ��·��:" + servletPath);

		//ServletReponse����װ����Ӧ��Ϣ���������û�ʲô��Ӧ���������ʹ�øýӿڵķ���ʵ��
		//HttpServletReponse����ServletResponse���ӽӿ�
		
		//������Ӧ�����ͣ�����������Ϊ��application/msword Ȼ����printWrite()�д�ӡHello World 
		//��ô��������оͻ�����һ������Hello World��world�ļ�
//		response.setContentType("application/msword");
			
		//getWriter()������PrintWriter���󣬵��øö����print(String s)��������������ַ�����ӡ���ͻ����������
		PrintWriter printWriter =  response.getWriter();
		printWriter.print("Hello world");
		
		
		
		
	}

}
