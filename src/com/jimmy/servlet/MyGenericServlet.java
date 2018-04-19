package com.jimmy.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class  MyGenericServlet implements Servlet,ServletConfig {

	private ServletConfig servletConfig;
	
	@Override
	public String getServletName() {
		// TODO Auto-generated method stub
		return servletConfig.getServletName() ;
	}

	@Override
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return servletConfig.getServletContext();
	}

	/**
	 * ����ΪServletConfig�ķ���
	 */
	@Override
	public String getInitParameter(String name) {
		// TODO Auto-generated method stub
		return servletConfig.getInitParameter(name);
	}

	@Override
	public Enumeration<String> getInitParameterNames() {
		// TODO Auto-generated method stub
		return servletConfig.getInitParameterNames();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.servletConfig = config;
		this.init();
	}
	
	/**
	 * Ϊ�˱���������дinit()������ʱ��,�����init()����ʧЧ(java�̳�����,����Ḳ�Ǹ��෽��)
	 * �Ӷ�����servletConfigΪ��
	 * @throws ServletException
	 */
	public void init() throws ServletException {
        // NOOP by default
    }

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return servletConfig;
	}

	@Override
	public abstract void service(ServletRequest req, ServletResponse res) throws ServletException, IOException;

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return getServletContext().getServerInfo();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	

}
