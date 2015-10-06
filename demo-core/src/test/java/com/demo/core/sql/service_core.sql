CREATE TABLE baseType (
    typeCode VARCHAR(15) NOT NULL,
    typeCategory VARCHAR(20) DEFAULT NULL,
    description VARCHAR(100) DEFAULT NULL,
    orderBy BIGINT(2) DEFAULT NULL,
    attribute1 VARCHAR(20) DEFAULT NULL,
    PRIMARY KEY (typeCode)    
);

insert into baseType (typeCode, typeCategory, description, orderBy, attribute1) values('CUST_COMPANY','TYPE_CUST','Company',NULL,NULL);
insert into baseType (typeCode, typeCategory, description, orderBy, attribute1) values('CUST_PERSON','TYPE_CUST','Person',NULL,NULL);
insert into baseType (typeCode, typeCategory, description, orderBy, attribute1) values('SEX_F','TYPE_SEX','Female',NULL,NULL);
insert into baseType (typeCode, typeCategory, description, orderBy, attribute1) values('SEX_M','TYPE_SEX','Male',NULL,NULL);
insert into baseType (typeCode, typeCategory, description, orderBy, attribute1) values('STS_CUST_CAN','STATUS_CUST','Cancelled',NULL,NULL);
insert into baseType (typeCode, typeCategory, description, orderBy, attribute1) values('STS_CUST_CLS','STATUS_CUST','Close',NULL,NULL);
insert into baseType (typeCode, typeCategory, description, orderBy, attribute1) values('STS_CUST_OK','STATUS_CUST','Active',NULL,NULL);
insert into baseType (typeCode, typeCategory, description, orderBy, attribute1) values('STS_PRD_CAN','STS_CUST_PRD','Cancell',NULL,NULL);
insert into baseType (typeCode, typeCategory, description, orderBy, attribute1) values('STS_PRD_OK','STS_CUST_PRD','Active',NULL,NULL);


CREATE TABLE customer (
  id BIGINT(20) NOT NULL AUTO_INCREMENT,
  firstName VARCHAR(30) DEFAULT NULL,
  lastName VARCHAR(50) DEFAULT NULL,
  sex VARCHAR(15) DEFAULT NULL,
  customerType VARCHAR(15) DEFAULT NULL COMMENT 'Person or Company',
  dniRucNumber VARCHAR(20) DEFAULT NULL,
  companyName VARCHAR(60) DEFAULT NULL,
  phone VARCHAR(15) DEFAULT NULL,
  cell VARCHAR(15) DEFAULT NULL,
  email VARCHAR(50) DEFAULT NULL,
  websity VARCHAR(70) DEFAULT NULL,
  customerStatus VARCHAR(15) DEFAULT NULL,
  createdBy VARCHAR(20) DEFAULT NULL,
  dateCreated DATETIME DEFAULT NULL,
  dateLastUpdated DATETIME DEFAULT NULL,
  lastUpdatedBy VARCHAR(20) DEFAULT NULL,
  VERSION INT(20) DEFAULT '0',
  PRIMARY KEY (id),
  CONSTRAINT FK_customer_basetype_01 FOREIGN KEY (sex) REFERENCES baseType(typeCode),
  CONSTRAINT FK_customer_basetype_02 FOREIGN KEY (customerType) REFERENCES baseType(typeCode),
  CONSTRAINT FK_customer_basetype_03 FOREIGN KEY (customerStatus) REFERENCES baseType(typeCode)
);

CREATE TABLE customerProduct (
  id BIGINT(20) NOT NULL AUTO_INCREMENT,
  customerId BIGINT(20) NOT NULL,
  plateNumber VARCHAR(10) DEFAULT NULL,
  line VARCHAR(15) DEFAULT NULL COMMENT 'movistar or claro',
  number VARCHAR(15) DEFAULT NULL COMMENT 'Number of line',
  codOn VARCHAR(15) DEFAULT NULL COMMENT 'Number of line',
  codOff VARCHAR(15) DEFAULT NULL COMMENT 'code auto shutdown',
  codTracker VARCHAR(15) DEFAULT NULL COMMENT 'code car to tracker',
  customerProductStatus VARCHAR(15) DEFAULT NULL,
  createdBy VARCHAR(20) DEFAULT NULL,
  dateCreated DATETIME DEFAULT NULL,
  dateLastUpdated DATETIME DEFAULT NULL,
  lastUpdatedBy VARCHAR(20) DEFAULT NULL,
  VERSION INT(20) DEFAULT '0',
  PRIMARY KEY (id),
  CONSTRAINT FK_customerProduct_basetype_01 FOREIGN KEY (customerProductStatus) REFERENCES baseType(typeCode)
);
