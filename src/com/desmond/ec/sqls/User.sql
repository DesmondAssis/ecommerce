

create table ec_user (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	name VARCHAR(75) NOT NULL UNIQUE ,	password VARCHAR(75) ,	reallyName VARCHAR(75) ,	identity VARCHAR(75) ,	postcode VARCHAR(75) ,	email VARCHAR(75) UNIQUE ,	address VARCHAR(75) ,	phone VARCHAR(75) ,	question VARCHAR(75) ,	answer VARCHAR(75) ) engine InnoDB;