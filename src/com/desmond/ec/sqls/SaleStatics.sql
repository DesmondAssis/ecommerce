

create table ec_SaleStatics (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	goodId BIGINT(25) NOT NULL ,	goodsClass BIGINT(25) NOT NULL ,	saleNumber INT NOT NULL ,	saleNumAmount INT NOT NULL ) engine InnoDB;