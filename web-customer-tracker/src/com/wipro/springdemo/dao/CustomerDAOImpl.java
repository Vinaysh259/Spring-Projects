package com.wipro.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
	
		//Get the session
		Session session = sessionFactory.getCurrentSession();
				
		//Create a query
		Query<Customer> query = session.createQuery("from Customer order by firstName",Customer.class);
		
		//Get the list of customers
		List<Customer> customers = query.getResultList();
		
		//return customers
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		
		//Get the session
		Session session = sessionFactory.getCurrentSession();
		
		//Save the customer
		session.saveOrUpdate(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Customer customer = session.get(Customer.class, id);
		System.out.println("Customer : " + customer.toString());
		return customer;
		
	}

	@Override
	public void deleteCustomer(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
		System.out.println("Deleted successfully!!!!!!!!");
		
		
//		Query<Customer> query = session.createQuery("delete from Customer where id=:customerId");
//		query.setParameter("customerId", id	);
//		
//		query.executeUpdate();
	}



}
