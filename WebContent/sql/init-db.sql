drop database if exists ecommerce;
create database ecommerce character set utf8;
use ecommerce;

/**
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	visible tinyint,
*/
/*table: order information*/
create table ec_order (
	id bigint not null primary key AUTO_INCREMENT,
	status int not null,
	time_ datetime not null,
	userId bigint not null,
	name varchar(75) not null,
	address varchar(75) not null,
	postCode varchar(75) null,
	telephone varchar(75) not null,
	phone varchar(75) null,
	post int not null,
	pay varchar(75) not null,
	notes varchar(75) null
) engine InnoDB;

/*table: order goods*/
create table ec_order_goods (
	id bigint not null primary key AUTO_INCREMENT,
	orderId bigint not null, /*the ID of order*/
	orderGoodGid bigint not null, /*the ID of the good*/
	orderGoodNum bigint not null, /*the number of the good*/
	orderGoodPrice double not null /*the price of the good*/
) engine InnoDB;

/*table: user*/
create table ec_user (
	id bigint not null primary key AUTO_INCREMENT,
	name varchar(75) not null unique, /*user name*/
	password varchar(75) not null, 
	reallyName varchar(75) not null, 
	identity varchar(75) not null, /*Identity Card Number*/
	postcode varchar(75) not null,
	email varchar(75) not null,
	address varchar(75) not null,
	phone varchar(75) not null,
	question varchar(75) null,
	answer varchar(75) null,
	registTime datetime not null
) engine InnoDB;

/*table: admin*/
create table ec_admin (
	id bigint not null primary key AUTO_INCREMENT,
	name varchar(75) not null unique, /*admin's name*/
	password varchar(75) not null,
	email varchar(75) not null
) engine InnoDB;

/*table: goods*/
create table ec_goods (
	id bigint not null primary key AUTO_INCREMENT,
	name varchar(75) not null unique, /*goods' name*/
	mainclass varchar(75) not null, /*the primary class*/
	subclass varchar(75) not null, /*the sub class*/
	price double not null,
	remian int not null, /*the remain number*/
	image varchar(75) not null, /*the image path*/
	unit varchar(75) not null, /*the unit of the good*/
	isRecommend tinyint not null
) engine InnoDB;

/*table: cart*/
create table ec_cart (
	id bigint not null primary key AUTO_INCREMENT,
	sessionId varchar(75) not null,
	goodId bigint not null, /*good's ID*/
	goodNum int null,
	userId bigint null
) engine InnoDB;

/*table: main class*/
create table ec_main_class (
	id bigint not null primary key AUTO_INCREMENT,
	name varchar(75) not null unique
) engine InnoDB;

/*table: sub class*/
create table ec_sub_class (
	id bigint not null primary key AUTO_INCREMENT,
	name varchar(75) not null unique,
	parentClass bigint not null
) engine InnoDB;

/*table: comment*/
create table ec_comment (
	id bigint not null primary key AUTO_INCREMENT,
	userId bigint not null,
	commentDate datetime not null,
	commentCotent varchar(75) null,
	goodId bigint not null
) engine InnoDB;

/*table: info*/
create table ec_info (
	id bigint not null primary key AUTO_INCREMENT,
	title varchar(75) not null unique,
	content varchar(75) not null,
	status int not null, /*0-draft, 1-published*/
	infoDate datetime not null,
	infoType int not null /*0-notice, 1-information*/
) engine InnoDB;

/*table: sale statics*/
create table ec_saleStatics (
	id bigint not null primary key AUTO_INCREMENT,
	saleDate datetime not null,
	goodId  bigint not null,
	subClass varchar(75) not null,
	mainClass varchar(75) not null,
	saleNum int not null, /*sale number*/
	saleAmount int not null /*amount*/
) engine InnoDB;

/*table: order history*/
create table ec_order_history (
	id bigint not null primary key AUTO_INCREMENT,
	orderId bigint not null, /*order ID*/
	modifiedDate  datetime not null,
	modifiedReason bigint not null, /*the reason why modify it*/
	adminId bigint not null /*the admin who modify it*/
) engine InnoDB;

/*table: admin_authority*/
create table ec_admin_authority (
	id bigint not null primary key AUTO_INCREMENT,
	adminId bigint not null,
	authorityId int not null
) engine InnoDB;

create table ec_counter (
	name varchar(75) not null primary key,
	currentId bigint(20)
) engine InnoDB;

/*insert statements*/
insert into ec_admin values(1, 'test', 'test', 'test@desmond.com');
