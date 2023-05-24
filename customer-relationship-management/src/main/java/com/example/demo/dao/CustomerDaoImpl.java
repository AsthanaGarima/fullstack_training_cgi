package com.example.demo.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Customer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Repository
@EnableTransactionManagement
public class CustomerDaoImpl implements CustomerDao{
	
	public final SessionFactory sessionFactory;

	public CustomerDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM Customer", Customer.class);
		List<Customer> customers = query.getResultList();
		// TODO Auto-generated method stub
		return customers;
	}

}
