

create table ec_OrderHistory (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	orderId BIGINT(25) NOT NULL ,	modifiedReason VARCHAR(75) NOT NULL ,	userId BIGINT(25) NOT NULL ) engine InnoDB;