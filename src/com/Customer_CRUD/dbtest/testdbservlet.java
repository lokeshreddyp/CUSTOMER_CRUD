package com.Customer_CRUD.dbtest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class testdbservlet
 */
@WebServlet("/testdbservlet")
public class testdbservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//setup connection variable
		String user = "lokesh";
		String password  = "loki";
		String url = "jdbc:mysql://127.0.0.1:3306/web_customer_tracker?useSSL=false";
		
		
		//driver  com.mysql.jdbc.Driver is case sensitive
		String Driver  = "com.mysql.jdbc.Driver";
		try {
			//to print 
			PrintWriter output = response.getWriter();
			output.println("hey you are connected to " + url);
			
			
			//c should be capital in class
			//loading the driver
			Class.forName(Driver);
			
			Connection con = DriverManager.getConnection(url,user,password);
			
			output.println("hehe our connection is sucessfull from servlet!!");
			
			con.close();
		}
		
		catch (Exception ex) {
			
			ex.printStackTrace();
			throw new ServletException(ex);
		}
	}

}
