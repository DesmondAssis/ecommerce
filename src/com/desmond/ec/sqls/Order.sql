

create table ec_order (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	status INT NOT NULL ,	userId BIGINT(25) NOT NULL ,	name VARCHAR(75) NOT NULL ,	address VARCHAR(75) NOT NULL ,	postCode VARCHAR(75) ,	telephone VARCHAR(75) NOT NULL ,	phone VARCHAR(75) ,	post INT NOT NULL ,	pay VARCHAR(75) NOT NULL ,	notes VARCHAR(75) ) engine InnoDB;