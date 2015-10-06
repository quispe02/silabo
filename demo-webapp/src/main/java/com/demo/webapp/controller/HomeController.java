package com.demo.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.demo.core.domain.Customer;
import com.demo.core.domain.CustomerStatus;
import com.demo.core.domain.CustomerType;
import com.demo.core.domain.SexType;
import com.demo.service.customer.CustomerService;
import com.demo.service.customer.MasterDataServiceImpl;

/**
 * 
 * @author ocalsin
 * 
 */

@Controller
@SessionAttributes( { "customer" })
public class HomeController {

	protected Log logger = LogFactory.getLog(getClass());

	@Autowired
	CustomerService customerService;

	@Autowired
	@Qualifier("masterDataService")
	MasterDataServiceImpl masterDataService;

	@RequestMapping(value = "home/dashboard", method = RequestMethod.GET)
	public String dashboard(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "home");
		model.addAttribute("customers", customerService.findCustomerAll());
		return "home/dashboard";
	}

	@RequestMapping(value = "home/customerForm")
	public String customerForm(Model model, HttpServletRequest request) {
		Customer customer = new Customer();
		if ("editCustomer".equals(request.getParameter("action").toString())) {
			customer = customerService.findCustomerById(NumberUtils
					.createLong(request.getParameter("id")));
			
			model.addAttribute("customerAction", "Editar Cliente");
		}else{
			model.addAttribute("customerAction", "Registrar Cliente");
		}
		model.addAttribute("customer", customer);
		return "home/customerForm";
	}

	@RequestMapping(value = "home/saveCustomer", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer,
			Model model,BindingResult result, SessionStatus status) {
		customerService.saveCustomer(customer);
		return "redirect:dashboard";
	}

	@RequestMapping(value = "home/deleteCustomer", method = RequestMethod.POST)
	public String deleteCustomer(@ModelAttribute("id") Long id) {
		customerService.deleteCustomer(id);
		return "redirect:dashboard";
	}
	
	@ModelAttribute("customerStatusList")
	public List<CustomerStatus> customerStatusList() {
		return masterDataService.findTypes(CustomerStatus.class);
	}

	@ModelAttribute("sexTypeList")
	public List<SexType> sexTypeList() {
		return masterDataService.findTypes(SexType.class);
	}

	@ModelAttribute("customerTypeList")
	public List<CustomerType> customerTypeList() {
		return masterDataService.findTypes(CustomerType.class);
	}

}
