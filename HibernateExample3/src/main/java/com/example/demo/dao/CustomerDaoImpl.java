package com.example.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Address;
import com.example.demo.model.Student;
import com.example.demo.model.User;

@Repository
public class CustomerDaoImpl implements CustomerDao{
 
	@Autowired
	private SessionFactory sessionFactory;
	public Address addCustomer(Address address) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(address);
		return address;
	}
	public User addUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(user);
		return user;
	}
	/*
	 * public void setSessionFactory(SessionFactory sf) { this.sessionFactory = sf;
	 * }
	 * 
	 * public List<User> getAllCustomers() { Session session =
	 * this.sessionFactory.getCurrentSession(); List<User> userlist =
	 * session.createQuery("from User").list();
	 * 
	 * return userlist; }
	 * 
	 * public User getCustomer(int id) { Session session =
	 * this.sessionFactory.getCurrentSession(); User user = (User)
	 * session.get(User.class, id); return user; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public void updateCustomer(User user) { Session session =
	 * this.sessionFactory.getCurrentSession(); session.update(user); } public User
	 * getUserById(int id){ Session session =
	 * this.sessionFactory.getCurrentSession(); User user = (User)
	 * session.get(User.class, id); return user;
	 * 
	 * }
	 */

	
	
	}
 

 
	
	
