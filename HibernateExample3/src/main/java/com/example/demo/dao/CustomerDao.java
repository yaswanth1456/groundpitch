package com.example.demo.dao;

import com.example.demo.model.Address;
import com.example.demo.model.Student;
import com.example.demo.model.User;



public interface CustomerDao {
	

	public Address addCustomer(Address address1);
	public User addUser(User user);

	/*
	 * public User getUserById(int id); public List<User> getAllCustomers();
	 * 
	 * public User getCustomer(int id); public void updateCustomer(User user) ;
	 */

	
}
