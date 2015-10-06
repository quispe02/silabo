package com.demo.service.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.core.dao.CustomerDao;
import com.demo.core.domain.Customer;

/**
 * 
 * @author ocalsin
 * 
 */

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	// public void setCustomerDao(CustomerDao calendarDao) {
	// this.customerDao = calendarDao;
	// }

	public List<Customer> findCustomerAll() {
		return customerDao.findCustomerAll();
	}

	public Customer findCustomerById(Long customerId) {
		return customerDao.findCustomerById(customerId);
	}

	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

	public void deleteCustomer(Long customerId) {
		Customer customer = customerDao.findCustomerById(customerId);
		customerDao.deleteCustomer(customer);
	}

}
