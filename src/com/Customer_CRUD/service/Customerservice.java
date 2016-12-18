package com.Customer_CRUD.service;

import java.util.List;

import com.Customer_CRUD.Entity.Customer;

public interface Customerservice {

	
	
	public List<Customer>  getcustomers();

	public void savecustomer(Customer thecustomer);

	public Customer getcustomer(int theId);

	public void deletecustomer(int theId);

	


}
