create table ec_Test (
	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	name VARCHAR(75) NOT NULL UNIQUE ,	password VARCHAR(75) ) engine InnoDB;