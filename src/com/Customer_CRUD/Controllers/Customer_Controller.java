package com.Customer_CRUD.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Customer_CRUD.DAO.CustomerDAO;
import com.Customer_CRUD.Entity.Customer;
import com.Customer_CRUD.service.Customerservice;

@Controller
@RequestMapping("/customer")
public class Customer_Controller {
	
	
	//injecting service layer to our controller
	@Autowired
	private Customerservice customerserv;
	
	
	//new annotation in spring 4.3 which will only accept get requests
	@GetMapping("/list")
	public String Homepage(Model themodel) {
		//getting customers from service instead of dao!!
		List<Customer> customerslist = customerserv.getcustomers();
		//add customers to model
		themodel.addAttribute("customers" , customerslist);
		return "customerlist";
	}
	
	@GetMapping("/showFormToAdd")
	public String form(Model themodel){
		
		
		//model to bind the form data
		Customer customer = new Customer();
		
		themodel.addAttribute("customer" , customer);
		return "customer-form";
	}

	
	@PostMapping("/saveCustomer")
	public String savecustomer(@ModelAttribute("customer") Customer thecustomer) {
		
		
		customerserv.savecustomer(thecustomer);
		
		return "redirect:/customer/list";
	}
	
@GetMapping("/showFormToUpdate")
public String showFormToUpdate(@RequestParam("customerId") int theId , Model themodel){
	//getting the data based on id
	Customer thecustomer = customerserv.getcustomer(theId);
	System.out.println(thecustomer);
	//adding to model
	themodel.addAttribute("customer" , thecustomer);
	
	return "customer-form";
}


@RequestMapping("/delete")
public String deletecustomer(@RequestParam("customerId")  int theId , Model themodel) {
	
	
	customerserv.deletecustomer(theId);
	return "redirect:/customer/list";
}

//	
//	@GetMapping("/showFormToUpdate") 
//	public String Show
//	
	
}
