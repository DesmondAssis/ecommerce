drop database if exists ecommerce;create database ecommerce character set utf8;use ecommerce;

create table ec_user (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	name VARCHAR(75) NOT NULL UNIQUE ,	password VARCHAR(75) ,	reallyName VARCHAR(75) ,	identity VARCHAR(75) ,	postcode VARCHAR(75) ,	email VARCHAR(75) UNIQUE ,	address VARCHAR(75) ,	phone VARCHAR(75) ,	question VARCHAR(75) ,	answer VARCHAR(75) ) engine InnoDB;

create table ec_order (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	status INT NOT NULL ,	userId BIGINT(25) NOT NULL ,	name VARCHAR(75) NOT NULL ,	address VARCHAR(75) NOT NULL ,	postCode VARCHAR(75) ,	telephone VARCHAR(75) NOT NULL ,	phone VARCHAR(75) ,	post INT NOT NULL ,	pay VARCHAR(75) NOT NULL ,	notes VARCHAR(75) ) engine InnoDB;

create table ec_OrderGoods (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	orderId BIGINT(25) NOT NULL ,	orderGoodId BIGINT(25) NOT NULL ,	orderGoodNum INT NOT NULL ,	orderGoodPrice DOUBLE NOT NULL ) engine InnoDB;

create table ec_Administrator (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	userId BIGINT(25) NOT NULL UNIQUE ,	authority INT NOT NULL ) engine InnoDB;

create table ec_Goods (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	name BIGINT(25) NOT NULL ,	mainClass VARCHAR(75) NOT NULL ,	subClass VARCHAR(75) NOT NULL ,	price DOUBLE NOT NULL ,	remain INT NOT NULL ,	image VARCHAR(75) NOT NULL ,	unit VARCHAR(75) NOT NULL ,	isRecommend TINYINT NOT NULL ) engine InnoDB;

create table ec_Cart (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	sessionId VARCHAR(75) NOT NULL ,	goodId BIGINT(25) NOT NULL ,	goodNum INT ,	userId BIGINT(25) ) engine InnoDB;

create table ec_GoodsClass (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	name VARCHAR(75) NOT NULL UNIQUE ,	parentClass BIGINT(25) ) engine InnoDB;

create table ec_Comment (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	userId BIGINT(25) NOT NULL ,	content VARCHAR(75) NOT NULL ,	goodId BIGINT(25) NOT NULL ) engine InnoDB;

create table ec_Information (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	title VARCHAR(75) NOT NULL UNIQUE ,	content VARCHAR(75) NOT NULL ,	status INT NOT NULL ,	type INT NOT NULL ) engine InnoDB;

create table ec_SaleStatics (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	goodId BIGINT(25) NOT NULL ,	goodsClass BIGINT(25) NOT NULL ,	saleNumber INT NOT NULL ,	saleNumAmount INT NOT NULL ) engine InnoDB;

create table ec_OrderHistory (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	orderId BIGINT(25) NOT NULL ,	modifiedReason VARCHAR(75) NOT NULL ,	userId BIGINT(25) NOT NULL ) engine InnoDB;

create table ec_AdminAuthority (	id BIGINT(25) PRIMARY KEY ,	createdDate TIMESTAMP ,	modifiedDate TIMESTAMP ,	name VARCHAR(75) NOT NULL UNIQUE ) engine InnoDB;

create table ec_counter (	name varchar(75) not null primary key,	currentId bigint(20)) engine InnoDB;