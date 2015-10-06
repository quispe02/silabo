package com.demo.core.domain;

/**
 * 
 * @author ocalsin
 * 
 */

public class Customer extends BaseEntity {

	private static final long serialVersionUID = -1990092165203817820L;
	private String firstName;
	private String lastName;
	private String dniRucNumber;
	private String companyName;
	private String phone;
	private String cell;
	private String email;
	private String websity;
	private CustomerStatus customerStatus;
	private SexType sexType;
	private CustomerType customerType;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDniRucNumber() {
		return dniRucNumber;
	}

	public void setDniRucNumber(String dniRucNumber) {
		this.dniRucNumber = dniRucNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsity() {
		return websity;
	}

	public void setWebsity(String websity) {
		this.websity = websity;
	}

	public CustomerStatus getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(CustomerStatus customerStatus) {
		this.customerStatus = customerStatus;
	}

	public SexType getSexType() {
		return sexType;
	}

	public void setSexType(SexType sexType) {
		this.sexType = sexType;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public String getName() {
		return firstName + " "+lastName;
	}

	
}
