package org.elecciones.core.dao;

import java.util.List;

import org.elecciones.core.domain.BaseEntity;
import org.elecciones.core.domain.Institution;

/**
 * 
 * @author ocalsin
 *
 */

public interface InstitutionDAO {

	List<Institution> findAllInstitution();

	public <T> T findById(Class<T> entityClass, Long id);

	public void save(BaseEntity entity);

	public void saveObject(Object entity);

	public void saveObjectAll(List<?> entities);

	public <T> void delete(T entity);

	public void update(BaseEntity entity);

}
