package com.demo.core.dao;

import java.util.List;

public interface MasterDataDao {

	<T> List<T> findTypes(Class<T> entityClass);
	<T> T findType(Class<T> entityClass,Long id);
	<T> void saveEntityType(T entity);
	<T> void deleteEntityType(T entity);

}
