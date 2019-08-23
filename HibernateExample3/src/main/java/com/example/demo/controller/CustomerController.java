package com.example.demo.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Address;
import com.example.demo.model.Student;
import com.example.demo.model.User;
import com.example.demo.service.CustomerService;

@Controller
public class CustomerController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET, headers = "Accept=application/json")
	public String addCustomer() {
		Student student1 = new Student("Eswar");
		Student student2 = new Student("Joe");
		Address address1 = new Address("OMR Road", "Chennai", "TN", "600097", student1);
		Address address2 = new Address("Ring Road", "Banglore", "Karnataka", "560000", student2);

		{
			// customerService.addCustomer(address1);

		}

		return "homepage";
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addCustomer(@RequestParam Map<String, String> requestParams,Model model) {

		model.addAttribute("user", new User());
			User user= new User();
		user.setName(requestParams.get("name"));
		//user.setId(requestParams.get());
		user.setDob(requestParams.get("dob"));
		user.setAge(requestParams.get("age"));
	
			
			customerService.addUser(user);
		}
	
      @RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
      public String homePage(Model model) {
    	  model.addAttribute("user", new User());
    	 return "customerDetails";
      }
		 /* @RequestMapping(value = "/getAllCustomers", method = RequestMethod.GET, headers = "Accept=application/json") 
	 public String getAllCustomers(Modelmodel) {
	 
	 * model.addAttribute("user", new User()); model.addAttribute("listOfCustomers",
	 * listOfCustomers); return "customerDetails"; }

	 * @RequestMapping(value = "/", method = RequestMethod.GET, headers =
	 * "Accept=application/json") public String goToHomePage() {
	 * 
	 * return "homepage"; }
	 * 
	 * @RequestMapping(value = "/getuserbyid", method = RequestMethod.POST, headers
	 * = "Accept=application/json") public String getuserById(@RequestParam("id")
	 * int id, Model model) {
	 * 
	 * model.addAttribute("user", this.customerService.getUserById(id));
	 * logger.info("from controller entry point");
	 * 
	 * logger.warn("this is a warn message");
	 * logger.error("this is a error message");
	 * 
	 * return "customerbyid"; }
	 */
	
}

