

create table ec_AdminAuthority (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	name VARCHAR(75) NOT NULL UNIQUE ) engine InnoDB;