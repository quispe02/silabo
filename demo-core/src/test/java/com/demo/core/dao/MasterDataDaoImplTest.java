package com.demo.core.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.core.AbstractUnitTest;
import com.demo.core.domain.CustomerType;

/**
 * 
 * @author ocalsin
 *
 */
public class MasterDataDaoImplTest extends AbstractUnitTest {

	@Autowired
	protected MasterDataDao masterDataDao;

	public void testType() {
		List<CustomerType> list = masterDataDao.findTypes(CustomerType.class);
		assertNotNull(list);
	}
}
