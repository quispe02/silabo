package com.demo.core.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.core.AbstractUnitTest;
import com.demo.core.domain.Customer;

/**
 * 
 * @author ocalin
 *
 */

public class CustomerDaoImplTest extends AbstractUnitTest {

	@Autowired
	protected CustomerDao customerDao;

	public void testCustomerList() {
		System.out.println("::::: " + customerDao.findCustomerAll());
		logger.info("::::::::: size :::::::: " + customerDao.findCustomerAll());
	}

	public void test() {
		List<Customer> list = customerDao.findCustomerByAllName("pe");
		assertNotNull(list);

	}

}
