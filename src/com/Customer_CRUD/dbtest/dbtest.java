package com.Customer_CRUD.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbtest {

	public static void main(String[] args) {
		
		
		String url = "jdbc:mysql://127.0.0.1:3306/web_customer_tracker?useSSL=false";
		String user = "lokesh";
		String password  = "loki";
		
		try {
			
			System.out.println("Connected to database"  + url);
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection sucessfull!!");
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
			
			
		}
		
	}

}
