

create table ec_Goods (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	name BIGINT(25) NOT NULL ,	mainClass VARCHAR(75) NOT NULL ,	subClass VARCHAR(75) NOT NULL ,	price DOUBLE NOT NULL ,	remain INT NOT NULL ,	image VARCHAR(75) NOT NULL ,	unit VARCHAR(75) NOT NULL ,	isRecommend TINYINT NOT NULL ) engine InnoDB;