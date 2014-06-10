

create table ec_Administrator (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	userId BIGINT(25) NOT NULL UNIQUE ,	authority INT NOT NULL ) engine InnoDB;