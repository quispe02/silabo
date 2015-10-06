package org.elecciones.core.domain;

import java.util.Date;

/**
 * 
 * @author ocalsin
 *
 */

public class Election extends BaseEntity {
	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 0L;

	private String year;
	private String comment;
	private Date dateIni;
	private Date dateEnd;

	// institutionId
	// statusElection
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDateIni() {
		return dateIni;
	}

	public void setDateIni(Date dateIni) {
		this.dateIni = dateIni;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

}
