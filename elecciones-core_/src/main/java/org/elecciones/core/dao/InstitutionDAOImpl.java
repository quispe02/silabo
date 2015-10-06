package org.elecciones.core.dao;

import java.util.List;

import org.elecciones.core.domain.Institution;

/**
 * 
 * @author ocalsin
 *
 */

public class InstitutionDAOImpl extends BaseDAOHibernate implements InstitutionDAO{
	
//	@Override
	public List<Institution> findAllInstitution(){
		return find(Institution.class, "from Institution");
	}
	

//	@Override
//	public Institution findInstitutionById(Long id){
//		return findById(Institution.class, id);
//	}
	


}
