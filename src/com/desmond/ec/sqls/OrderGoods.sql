

create table ec_OrderGoods (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	orderId BIGINT(25) NOT NULL ,	orderGoodId BIGINT(25) NOT NULL ,	orderGoodNum INT NOT NULL ,	orderGoodPrice DOUBLE NOT NULL ) engine InnoDB;