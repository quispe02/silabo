package org.elecciones.core.domain;

/**
 * 
 * @author ocalsin
 *
 */

//@XmlRootElement(name = "institution")
public class Institution extends BaseEntity {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 0L;

	private String name;
	private String description;
	private String address;
	private String logo;
	private String phone;
	private String owner;
	private StatusInstitution statusInstitution;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public StatusInstitution getStatusInstitution() {
		return statusInstitution;
	}

	public void setStatusInstitution(StatusInstitution statusInstitution) {
		this.statusInstitution = statusInstitution;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	
}
