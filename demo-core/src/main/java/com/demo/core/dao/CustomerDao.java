package com.demo.core.dao;

import java.util.List;

import com.demo.core.domain.Customer;

/**
 * 
 * @author ocalsin
 * 
 */

public interface CustomerDao {

	List<Customer> findCustomerAll();

	Customer findCustomerById(Long customerId);

	void saveCustomer(Customer customer);

	List<Customer> findCustomerByAllName(String allName);

	void deleteCustomer(Customer customer);
	
}
