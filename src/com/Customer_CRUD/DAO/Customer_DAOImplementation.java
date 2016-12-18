package com.Customer_CRUD.DAO;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Customer_CRUD.Entity.Customer;

@Repository
public class Customer_DAOImplementation implements CustomerDAO {

	
	//sessionFactory is bean name in configfile
	//Autowired annotation scans the base package recursively to get the entity class 
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	
	public List<Customer> getcustomers() {
	
		//get the hibernate session
		Session currentsession = sessionFactory.getCurrentSession();
		
		//Querying the database
		Query<Customer> thequery = 
				currentsession.createQuery("from Customer order by firstName" , Customer.class);
		
		//execute the query
		List<Customer> customers  = 
				thequery.getResultList();
		
		//return the customers
		
		return customers;
		
	}

	@Override
	public void savecustomer(Customer thecustomer) {
	//get the current session
		Session currentsession = sessionFactory.getCurrentSession();
		
		//saving the customer
		//if primary key id exists then it will update,else it will insert
		currentsession.saveOrUpdate(thecustomer);
	
		
	}

	

	@Override
	public Customer getcustomer(int theId) {

		//establish a session
		Session currentsession = sessionFactory.getCurrentSession();
		
		//query db
		Customer thecustomer = currentsession.get(Customer.class,theId);
		return thecustomer;
	}

	@Override
	public void deletecustomer(int theId) {
		// TODO Auto-generated method stub
		

		//establish a session
		Session currentsession = sessionFactory.getCurrentSession();
		
		//query to delete the customer based on id 
		Query query = currentsession.createQuery("delete from Customer where id=:customerId");
		
		
		query.setParameter("customerId", theId);
		
		
		//process the hql
		query.executeUpdate();
		
	}

	


	

}
