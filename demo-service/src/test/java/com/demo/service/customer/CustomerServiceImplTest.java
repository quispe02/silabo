package com.demo.service.customer;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.service.config.AbstractUnitTest;


public class CustomerServiceImplTest extends AbstractUnitTest {

	@Autowired
	protected CustomerService customerService;

	public void testCalendatrList() {
		System.out.println("::::: "+customerService.findCustomerAll());
		logger.info("ini");
		logger.info("::::::::: size :::::::: "+customerService.findCustomerAll());
	}

}
