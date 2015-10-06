package org.elecciones.core.domain;

/**
 * 
 * @author ocalsin
 *
 */

public class Competitor extends BaseEntity {
	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 0L;

	private String nameCompetitor;
	private String logoCompetitor;
	private String comment;

	// electionId
	// studentId
	public String getNameCompetitor() {
		return nameCompetitor;
	}

	public void setNameCompetitor(String nameCompetitor) {
		this.nameCompetitor = nameCompetitor;
	}

	public String getLogoCompetitor() {
		return logoCompetitor;
	}

	public void setLogoCompetitor(String logoCompetitor) {
		this.logoCompetitor = logoCompetitor;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
