package com.Customer_CRUD.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Customer_HomeController {
	
	@RequestMapping("/")
	public String HomeController() {
		return "Homeview";
	}
	

}
