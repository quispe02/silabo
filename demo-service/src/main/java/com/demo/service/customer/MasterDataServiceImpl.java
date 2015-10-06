package com.demo.service.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.core.dao.MasterDataDao;

/**
 * 
 * @author ocalsin
 * 
 */

@Service("masterDataService")
public class MasterDataServiceImpl {

	@Autowired
	private MasterDataDao masterDataDao;

	public <T> List<T> findTypes(Class<T> entityClass) {
		return masterDataDao.findTypes(entityClass);
	}

	public <T> T findType(Class<T> entityClass, Long id) {
		return masterDataDao.findType(entityClass, id);
	}

	public <T> void saveEntityType(T entity) {
		masterDataDao.saveEntityType(entity);
	}

	public <T> void deleteEntityType(T entity) {
		masterDataDao.deleteEntityType(entity);
	}

}
