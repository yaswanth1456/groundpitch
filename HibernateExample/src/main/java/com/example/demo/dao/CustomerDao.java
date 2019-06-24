package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.User;



public interface CustomerDao {
	public List<User> getAllCustomers();

	public User getCustomer(int id);

	public User addCustomer(User user);

	
	 
	public void updateCustomer(User user) ;

	
}
