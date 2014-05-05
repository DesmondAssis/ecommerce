drop database if exists ecommerce;
create database ecommerce character set utf8;
use ecommerce;

/**
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	visible tinyint,
*/
create table ec_order (
	id bigint not null primary key,
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


-- Create table
create table ORDERS
(
  ORDERS_ID        NUMBER not null,
  ORDERS_STATUS    CHAR(6) not null,
  ORDERS_TIME      DATE not null,
  ORDERS_USER_ID   NUMBER,
  ORDERS_NAME      VARCHAR2(32) not null,
  ORDERS_ADDRESS   VARCHAR2(64) not null,
  ORDERS_POSTCODE  VARCHAR2(16) not null,
  ORDERS_TELEPHONE VARCHAR2(16) not null,
  ORDERS_PHONE     VARCHAR2(16),
  ORDERS_POST      CHAR(4) not null,
  ORDERS_PAY       VARCHAR2(12) not null,
  ORDERS_NOTES     VARCHAR2(64)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Add comments to the columns 
comment on column ORDERS.ORDERS_ID
  is '订单号，主键';
comment on column ORDERS.ORDERS_STATUS
  is '订单状态 -新订单 已支付 已发货 作废';
comment on column ORDERS.ORDERS_TIME
  is '下单时间';
comment on column ORDERS.ORDERS_USER_ID
  is '会员编号';
comment on column ORDERS.ORDERS_NAME
  is '收件人姓名';
comment on column ORDERS.ORDERS_ADDRESS
  is '邮寄地址';
comment on column ORDERS.ORDERS_POSTCODE
  is '邮政编码';
comment on column ORDERS.ORDERS_TELEPHONE
  is '移动电话';
comment on column ORDERS.ORDERS_PHONE
  is '固定电话';
comment on column ORDERS.ORDERS_POST
  is '邮寄方式 平邮 快递';
comment on column ORDERS.ORDERS_PAY
  is '支付方式 邮局汇款 .网上银行转账.';
comment on column ORDERS.ORDERS_NOTES
  is '备注';
-- Create/Recreate primary, unique and foreign key constraints 
alter table ORDERS
  add constraint PK_ORDERS_ID primary key (ORDERS_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create table
create table INFO
(
  INFO_ID      NUMBER not null,
  INFO_TITLE   VARCHAR2(32) not null,
  INFO_CONTENT VARCHAR2(128) not null,
  INFO_STATUS  NUMBER not null,
  INFO_DATE    DATE not null,
  INFO_TYPE    NUMBER not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Add comments to the columns 
comment on column INFO.INFO_ID
  is '公告或资讯编号，主键';
comment on column INFO.INFO_TITLE
  is '标题';
comment on column INFO.INFO_CONTENT
  is '内容';
comment on column INFO.INFO_STATUS
  is '状态 0-未发布 1-发布';
comment on column INFO.INFO_DATE
  is '发布时间';
comment on column INFO.INFO_TYPE
  is '类型 0-公告 1-资讯';
-- Create/Recreate primary, unique and foreign key constraints 
alter table INFO
  add constraint PK_INFO primary key (INFO_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table INFO
  add constraint UK_INFO unique (INFO_TITLE)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create table
create table COMMENTS
(
  COMMENTS_ID      NUMBER not null,
  COMMENTS_USER    VARCHAR2(32) not null,
  COMMENTS_TIME    DATE,
  COMMENTS_CONTENT VARCHAR2(128) not null,
  COMMENTS_GOOD    NUMBER not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Add comments to the columns 
comment on column COMMENTS.COMMENTS_ID
  is '评论编号，主键';
comment on column COMMENTS.COMMENTS_USER
  is '评论的用户名，外建';
comment on column COMMENTS.COMMENTS_TIME
  is '评论日期';
comment on column COMMENTS.COMMENTS_CONTENT
  is '评论内容';
comment on column COMMENTS.COMMENTS_GOOD
  is '评论的商品编号，外键';
-- Create/Recreate primary, unique and foreign key constraints 
alter table COMMENTS
  add constraint PK_COMMENTS primary key (COMMENTS_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table COMMENTS
  add constraint FK_COMMENTS foreign key (COMMENTS_USER)
  references USERS (USER_USERNAME);
alter table COMMENTS
  add constraint FK_COMMENTS1 foreign key (COMMENTS_GOOD)
  references GOODS (GOODS_ID);
