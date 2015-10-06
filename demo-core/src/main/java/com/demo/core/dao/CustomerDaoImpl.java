package com.demo.core.dao;

import java.util.List;

import com.demo.core.domain.Customer;

/**
 * 
 * @author ocalsin
 * 
 */

public class CustomerDaoImpl extends BaseDAOHibernate implements CustomerDao {

	public List<Customer> findCustomerAll() {
		return this.find(Customer.class, "from Customer");
	}

	public List<Customer> findCustomerByAllName(String allName) {
		StringBuilder queryString = new StringBuilder();
		// Object param[] = new Object[] { allName };

		queryString
				.append("FROM Customer WHERE  CONCAT( dniRucNumber , UPPER(firstName), ' ', UPPER(lastName) ) LIKE '%"
						+ allName + "%' order by firstName,lastName ");

		return this.find(Customer.class, queryString.toString());
	}

	public Customer findCustomerById(Long customerId) {
		return this.findById(Customer.class, customerId);
	}

	@Override
	public void saveCustomer(Customer customer) {
		save(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		delete(customer);
	}
}
