package org.elecciones.core.dao;

import java.util.List;

import org.elecciones.core.domain.BaseEntity;
import org.elecciones.core.domain.Competitor;
import org.elecciones.core.domain.Election;
import org.elecciones.core.domain.SessionElection;

/**
 * 
 * @author ocalsin
 *
 */

public interface ElectionDAO {

	public <T> T findById(Class<T> entityClass, Long id);

	public void save(BaseEntity entity);

	public void saveObject(Object entity);

	public void saveObjectAll(List<?> entities);

	public <T> void delete(T entity);

	public void update(BaseEntity entity);

	List<Election> findElectionByInstitutionId(Long institutionId);

	List<Competitor> findCompetitorByElectioinId(Long electionId);

	List<SessionElection> findSessionElectionByElectioinId(Long electionId);
}
