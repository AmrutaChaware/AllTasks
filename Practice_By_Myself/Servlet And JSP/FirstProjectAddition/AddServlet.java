package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		
		int additionIs =number1+number2;
		
		PrintWriter result = response.getWriter();//write result on browser
		
		result.println("Addition is "+additionIs);
		
		//System.out.println("Addition is "+additionIs");//always give result on concsole window
	}
}
