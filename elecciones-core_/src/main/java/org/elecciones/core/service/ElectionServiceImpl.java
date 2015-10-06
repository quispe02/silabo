package org.elecciones.core.service;

import java.util.List;

import org.elecciones.core.dao.ElectionDAO;
import org.elecciones.core.domain.Competitor;
import org.elecciones.core.domain.Election;
import org.elecciones.core.domain.SessionElection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author ocalsin
 *
 */

@Service("electionService")
public class ElectionServiceImpl {

	@Autowired
	private ElectionDAO electionDAO;

	// sessionElection
	public SessionElection findSessionElectionById(Long sessionElectionId) {
		return electionDAO.findById(SessionElection.class, sessionElectionId);
	}

	public List<SessionElection> findSessionElectionByElectioinId(Long electionId) {
		return electionDAO.findSessionElectionByElectioinId(electionId);
	}

	public void saveSessionElection(SessionElection sessionElection) {
		electionDAO.save(sessionElection);
	}

	public void deleteSessionElection(SessionElection sessionElection) {
		electionDAO.delete(sessionElection);
	}

	// competotor
	public Competitor findCompetitorById(Long competitorId) {
		return electionDAO.findById(Competitor.class, competitorId);
	}

	public List<Competitor> findCompetitorByElectionId(Long electioinId) {
		return electionDAO.findCompetitorByElectioinId(electioinId);
	}

	public void saveCompetitor(Competitor competitor) {
		electionDAO.save(competitor);
	}

	public void deleteCompetitor(Competitor competitor) {
		electionDAO.delete(competitor);
	}

	// election
	public Election findElectionById(Long electionId) {
		return electionDAO.findById(Election.class, electionId);
	}

	public List<Election> findElectionByInstitutionId(Long institutionId) {
		return electionDAO.findElectionByInstitutionId(institutionId);
	}

	public void saveElection(Election election) {
		electionDAO.save(election);
	}

	public void deleteElection(Election election) {
		electionDAO.delete(election);
	}

}
