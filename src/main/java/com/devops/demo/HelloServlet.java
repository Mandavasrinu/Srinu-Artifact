package com.devops.demo;

import javax.servlet.*;
import java.io.*;

public class HelloServlet implements Servlet
{
	ServletConfig config = null;
	public void init(ServletConfig sc)
	{
		config =sc;
		System.out.println("in init");
	}	

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h2> Hello from liffe cycle servlet </h2>");
		System.out.println("in Service");
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "LifeCycleServlet";
	}
	
	public void destroy() {
		System.out.println("in destroy");
		
	}
	
}
