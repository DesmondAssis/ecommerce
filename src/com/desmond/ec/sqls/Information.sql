

create table ec_Information (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	title VARCHAR(75) NOT NULL UNIQUE ,	content VARCHAR(75) NOT NULL ,	status INT NOT NULL ,	type INT NOT NULL ) engine InnoDB;