package com.Customer_CRUD.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Customer_CRUD.DAO.CustomerDAO;
import com.Customer_CRUD.Entity.Customer;


@Repository
@Service
public class Customerserviceimpl implements Customerservice {

	@Autowired
	private CustomerDAO customerdoa;
	
	private Customerservice customer;
	
	@Override
	//service layer says when to begin and stop the transaction
	@Transactional
	public List<Customer> getcustomers() {
		
		/*when get getcustomers() in service is called it will
		customers from cstomerdao*/
		return customerdoa.getcustomers();
	}

	@Override
	@Transactional
	public void savecustomer(Customer thecustomer) {
		customerdoa.savecustomer(thecustomer);
		
	}

	

	

	@Override
	@Transactional
	public Customer getcustomer(int theId) {
		// TODO Auto-generated method stub
		return customerdoa.getcustomer(theId);
		
	}

	@Override
	@Transactional
	public void deletecustomer(int theId) {
		
		 customerdoa.deletecustomer(theId);
		// TODO Auto-generated method stub
		
	}

	

	
}
