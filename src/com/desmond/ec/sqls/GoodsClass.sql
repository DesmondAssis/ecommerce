

create table ec_GoodsClass (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	name VARCHAR(75) NOT NULL UNIQUE ,	parentClass BIGINT(25) ) engine InnoDB;