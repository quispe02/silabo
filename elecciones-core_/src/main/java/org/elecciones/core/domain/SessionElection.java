package org.elecciones.core.domain;

/**
 * 
 * @author ocalsin
 *
 */

public class SessionElection extends BaseEntity {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 0L;

	private String userSession;
	private String passSession;

	// private String status
	// electionId
	public String getUserSession() {
		return userSession;
	}

	public void setUserSession(String userSession) {
		this.userSession = userSession;
	}

	public String getPassSession() {
		return passSession;
	}

	public void setPassSession(String passSession) {
		this.passSession = passSession;
	}

}
