package com.demo.service.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.demo.core.domain.CustomerStatus;
import com.demo.service.config.AbstractUnitTest;

public class MasterDataServiceImplTest extends AbstractUnitTest {

	@Autowired
	@Qualifier("masterDataService")
	private MasterDataServiceImpl masterDataService;

	public void test() {
		List<CustomerStatus> list = masterDataService
				.findTypes(CustomerStatus.class);
		assertNotNull(list);
	}

}
