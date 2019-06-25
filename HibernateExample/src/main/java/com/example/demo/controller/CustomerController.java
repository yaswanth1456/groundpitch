package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demo.model.User;
import com.example.demo.service.CustomerService;

@Controller
public class CustomerController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/getAllCustomers", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getAllCustomers(Model model) {

		List<User> listOfCustomers = customerService.getAllCustomers();
		model.addAttribute("user", new User());
		model.addAttribute("listOfCustomers", listOfCustomers);
		return "customerDetails";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		
		return "homepage";
	}
	@RequestMapping(value = "/getuserbyid", method = RequestMethod.POST, headers = "Accept=application/json")
	public String getuserById(@RequestParam("id")int id, Model model) {
		
		model.addAttribute("user", this.customerService.getUserById( id));
		logger.info("from controller entry point");
		
	      logger.warn("this is a warn message");
	      logger.error("this is a error message");
		
		return "customerbyid";
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addCustomer(@ModelAttribute("user") User user) {
		
		{
			customerService.addCustomer(user);
		}

		return "redirect:/getAllCustomers";
	}

}
