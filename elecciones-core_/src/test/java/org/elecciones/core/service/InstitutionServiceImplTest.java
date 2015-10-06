package org.elecciones.core.service;

import org.elecciones.core.dao.AbstractUnitTest;
import org.elecciones.core.domain.Institution;
import org.springframework.beans.factory.annotation.Autowired;

public class InstitutionServiceImplTest extends AbstractUnitTest{

	
	@Autowired
	protected InstitutionServiceImpl institutionService;
	
	public void testSaveInstitution() {
		
		Institution institution = new Institution();
		institution.setName("Colegio Tupac Amaru");
		institution.setDescription("Colegio Adventista Tupac Amaru");
		institution.setAddress("Jr: Moquegua");
		institution.setPhone("95590753");
		
		institutionService.saveInstitution(institution);
	}
	
}
