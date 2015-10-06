package org.elecciones.core.dao;

import java.util.List;

import org.elecciones.core.domain.Competitor;
import org.elecciones.core.domain.Election;
import org.elecciones.core.domain.SessionElection;

/**
 * 
 * @author ocalsin
 *
 */

public class ElectionDAOImpl extends BaseDAOHibernate implements ElectionDAO {

	
	
//	@Override
	public List<Election> findElectionByInstitutionId(Long institutionId) {
		String query="FROM Election ";
		return find(Election.class, query);
	}


//	@Override
	public List<Competitor> findCompetitorByElectioinId(Long electionId) {
		return null;
	}
	
	
	
//	@Override
	public List<SessionElection> findSessionElectionByElectioinId(Long electionId) {
		return null;
	}	
}
