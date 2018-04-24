package com.jimmy.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends MyGenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(req instanceof HttpServletRequest){
			HttpServletRequest request = (HttpServletRequest) req;
			if(res instanceof HttpServletResponse){
				HttpServletResponse response = (HttpServletResponse)res;
				String method = request.getMethod();
				service(request, response);	
			}	
		}
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String method = req.getMethod();
		if(method.equalsIgnoreCase("GET")){
			doGet(req,res);
		}else if(method.equalsIgnoreCase("POST")){
			doPost(req,res);
		}
				
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		// TODO Auto-generated method stub
		
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
