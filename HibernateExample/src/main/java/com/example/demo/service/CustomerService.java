package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.User;


@Service("customerService")
public class CustomerService {
 
	@Autowired
	CustomerDao customerdao;
 //basic controller
	@Transactional
	public List<User> getAllCustomers() {
		return customerdao.getAllCustomers();
	}
	//transactional
	@Transactional
	public User getUserById(int id) {
		return customerdao.getUserById(id);
	}
 
	@Transactional
	public void addCustomer(User user) {
		customerdao.addCustomer(user);
	}
 
	@Transactional
	public void updateCustomer(User user) {
		customerdao.updateCustomer(user);
 
	}
 
	/*
	 * @Transactional public void addCustomer(User user) { user.addCustomer(user); }
	 */
	
	
}