

create table ec_Cart (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	sessionId VARCHAR(75) NOT NULL ,	goodId BIGINT(25) NOT NULL ,	goodNum INT ,	userId BIGINT(25) ) engine InnoDB;