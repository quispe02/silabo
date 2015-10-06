package org.elecciones.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.elecciones.core.service.InstitutionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author ocalsin
 *
 */

@Controller
public class InstitutionController {

	protected Log logger = LogFactory.getLog(getClass());

	@Autowired
	@Qualifier("institutionService")
	InstitutionServiceImpl institutionService;

	@RequestMapping(value = "home/dashboard", method = RequestMethod.GET)
	public String dashboard(Model model, HttpServletRequest request) {
		logger.info("::::::::::::dashboard:::::::::::::::");
		return "home/dashboard";
	}
	
	
}
