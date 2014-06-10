

create table ec_Comment (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	userId BIGINT(25) NOT NULL ,	content VARCHAR(75) NOT NULL ,	goodId BIGINT(25) NOT NULL ) engine InnoDB;