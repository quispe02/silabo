package com.demo.core.dao;

import java.util.List;

import com.demo.core.domain.BaseEntity;

/**
 * 
 * @author ocalsin
 * 
 */
public class MasterDataDaoImpl extends BaseDAOHibernate implements
		MasterDataDao {

	public <T> void deleteEntityType(T entity) {
		if (entity instanceof BaseEntity) {
			BaseEntity baseEntity = (BaseEntity) entity;
			delete(baseEntity);
		}
	}

	public <T> T findType(Class<T> entityClass, Long id) {
		return findById(entityClass, id);
	}

	public <T> List<T> findTypes(Class<T> entityClass) {
		String hql = "from " + entityClass.getName() + " order by description";
		return (List<T>) getHibernateTemplate().find(hql);
	}

	public <T> void saveEntityType(T entity) {
		if (entity instanceof BaseEntity) {
			BaseEntity baseEntity = (BaseEntity) entity;
			save(baseEntity);
		}
	}

}
