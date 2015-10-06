package com.demo.service.customer;

import java.util.List;

import com.demo.core.domain.Customer;

/**
 * 
 * @author ocalsin
 * 
 */

public interface CustomerService {

	List<Customer> findCustomerAll();

	Customer findCustomerById(Long customerId);

	void saveCustomer(Customer customer);

	void deleteCustomer(Long customerId);

}
