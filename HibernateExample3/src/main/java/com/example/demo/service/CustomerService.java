package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Address;
import com.example.demo.model.Student;
import com.example.demo.model.User;


@Service("customerService")
public class CustomerService {
 
	@Autowired
	CustomerDao customerdao;
	@Transactional
	public void addCustomer(Address address1) {
		customerdao.addCustomer(address1);
	}
	@Transactional
	public void addUser(User user) {
		customerdao.addUser(user);
	}
	/*
	 * @Transactional public List<User> getAllCustomers() { return
	 * customerdao.getAllCustomers(); }
	 * 
	 * @Transactional public User getUserById(int id) { return
	 * customerdao.getUserById(id); }
	 * 
	 * 
	 * @Transactional public void updateCustomer() {
	 * customerdao.updateCustomer(user);
	 * 
	 * }
	 */
 
	/*
	 * @Transactional public void addCustomer(User user) { user.addCustomer(user); }
	 */
	
	
}