CREATE DATABASE googlstar;

CREATE TABLE calendar (
  id BIGINT(20) NOT NULL AUTO_INCREMENT,
  DAY DATETIME DEFAULT NULL,
  WEEK INT(20) DEFAULT '0',
  PRIMARY KEY (id)
) ENGINE=INNODB DEFAULT CHARSET=utf8;