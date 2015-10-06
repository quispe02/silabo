
CREATE TABLE person
(
	id                   INTEGER NOT NULL AUTO_INCREMENT,
	name                 VARCHAR(40) NULL,
	lastNameF            VARCHAR(40) NULL,
	lastNameM            VARCHAR(40) NULL,
	dni                  VARCHAR(15) NULL,
	createdBy            VARCHAR(20) NULL,
	dateCreated          DATETIME NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	dateLastUpdated      DATETIME NULL,
	version              integer NULL,
	PRIMARY KEY (id)
);

CREATE TABLE institution
(
	id                   INTEGER NOT NULL AUTO_INCREMENT,
	name                 VARCHAR(50) NULL,
	description          VARCHAR(100) NULL,
	address              VARCHAR(100) NULL,
	logo                 VARCHAR(50) NULL,
	phone                VARCHAR(50) NULL,
	owner                VARCHAR(50) NULL,
	status               VARCHAR(20) NULL,
	createdBy            VARCHAR(20) NULL,
	dateCreated          DATE NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	dateLastUpdated      DATE NULL,
	version              INTEGER NULL,
	PRIMARY KEY (id)
);

CREATE TABLE student
(
	id                   INTEGER NOT NULL AUTO_INCREMENT,
	codeStudent          VARCHAR(25) NULL,
	personId             INTEGER NULL,
	institutionId        INTEGER NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (personId) REFERENCES person (id),
	FOREIGN KEY (institutionId) REFERENCES institution (id)
);

CREATE TABLE election
(
	id                   INTEGER NOT NULL AUTO_INCREMENT,
	institutionId        INTEGER NULL,
	year                 VARCHAR(4) NULL,
	comment              VARCHAR(200) NULL,
	status               VARCHAR(20) NULL,
	dateIni              DATETIME NULL,
	dateEnd              DATETIME NULL,
	createdBy            VARCHAR(20) NULL,
	dateCreated          DATETIME NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	dateLastUpdated      DATETIME NULL,
	version              INTEGER NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (institutionId) REFERENCES institution (id)
);

CREATE TABLE competitor
(
	id                   INTEGER NOT NULL AUTO_INCREMENT,
	electionId           INTEGER NULL,
	studentId            INTEGER NULL,
	nameCompetitor       VARCHAR(50) NULL,
	logoCompetitor       VARCHAR(50) NULL,
	comment              VARCHAR(100) NULL,
	createdBy            VARCHAR(20) NULL,
	dateCreated          DATETIME NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	dateLastUpdated      DATETIME NULL,
	version              INTEGER NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (electionId) REFERENCES election (id),
	FOREIGN KEY (studentId) REFERENCES student (id)
);

CREATE TABLE vote
(
	id                   INTEGER NOT NULL AUTO_INCREMENT,
	studentId            INTEGER NULL,
	competitorId         INTEGER NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (studentId) REFERENCES student (id),
	FOREIGN KEY (competitorId) REFERENCES competitor (id)
);

CREATE TABLE userSystem
(
	id                   INTEGER NOT NULL AUTO_INCREMENT,
	userName             varchar(20) NULL,
	passName             varchar(20) NULL,
	status               varchar(20) NULL,
	personId             INTEGER NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (personId) REFERENCES person (id)
);

CREATE TABLE sessionElection
(
	id                   INTEGER NOT NULL AUTO_INCREMENT,
	electionId           INTEGER NULL,
	userSession          VARCHAR(20) NULL,
	passSession          VARCHAR(20) NULL,
	status               VARCHAR(20) NULL,
	createdBy            VARCHAR(20) NULL,
	dateCreated          DATETIME NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	dateLastUpdated      DATETIME NULL,
	version              INTEGER NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (electionId) REFERENCES election (id)
);