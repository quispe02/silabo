package org.elecciones.core.service;

import java.util.List;

import org.elecciones.core.dao.InstitutionDAO;
import org.elecciones.core.domain.Institution;
import org.elecciones.core.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author ocalsin
 *
 */

@Service("institutionService")
public class InstitutionServiceImpl {

	@Autowired
	private InstitutionDAO institutionDAO;

	public Institution findById(Long institutionId) {
		return institutionDAO.findById(Institution.class, institutionId);
	}

	public void saveStudent(Student student) {
		institutionDAO.save(student);
	}

	public void deleteStudent(Student student) {
		institutionDAO.delete(student);
	}

	public List<Institution> findAllInstitution() {
		return institutionDAO.findAllInstitution();
	}

	public void saveInstitution(Institution institution) {
		institutionDAO.save(institution);
	}

	public void deleteInstitution(Institution institution) {
		institutionDAO.delete(institution);
	}

}
