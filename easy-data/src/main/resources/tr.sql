DROP TABLE IF EXISTS tr_car;

DROP TABLE IF EXISTS tr_car_brand;

DROP TABLE IF EXISTS tr_driver;

DROP TABLE IF EXISTS tr_place;

DROP TABLE IF EXISTS tr_reply;

DROP TABLE IF EXISTS tr_resource;

DROP TABLE IF EXISTS tr_user;

/*==============================================================*/
/* Table: tr_car                                                */
/*==============================================================*/
CREATE TABLE tr_car
(
   id                   BIGINT NOT NULL AUTO_INCREMENT,
   user_id              BIGINT NOT NULL,
   driver_id            BIGINT NOT NULL,
   car_brand_id         BIGINT NOT NULL COMMENT 'Ʒ��ID',
   color                BIGINT COMMENT '��ɫ',
   number               VARCHAR(50) COMMENT '���ƺ�',
   seat_number          INT COMMENT '��λ����',
   PRIMARY KEY (id)
);

/*==============================================================*/
/* Table: tr_car_brand                                          */
/*==============================================================*/
CREATE TABLE tr_car_brand
(
   id                   BIGINT NOT NULL AUTO_INCREMENT,
   brand_name           VARCHAR(50) NOT NULL,
   parent_id            BIGINT COMMENT '���ڵ�',
   root_id              BIGINT NOT NULL COMMENT '���ڵ�',
   PRIMARY KEY (id)
);

/*==============================================================*/
/* Table: tr_driver                                             */
/*==============================================================*/
CREATE TABLE tr_driver
(
   id                   BIGINT NOT NULL AUTO_INCREMENT,
   user_id              BIGINT NOT NULL,
   driving_age          TINYINT NOT NULL,
   driver_license_icon  VARCHAR(500),
   PRIMARY KEY (id)
);

/*==============================================================*/
/* Table: tr_place                                              */
/*==============================================================*/
CREATE TABLE tr_place
(
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT '����',
   place_name           VARCHAR(500) NOT NULL COMMENT '�ص�����',
   X                    DOUBLE NOT NULL COMMENT 'x����',
   Y                    DOUBLE NOT NULL COMMENT 'y����',
   sort_index           BIGINT NOT NULL COMMENT '�����ֶ�',
   source_id            BIGINT NOT NULL COMMENT '��Դid',
   place_type           TINYINT NOT NULL COMMENT '�ص��������� 1=����driver��Դ  2=���ڳ˿���Դ',
   estimate_time        DATETIME NOT NULL COMMENT 'Ԥ�Ʒ���ʱ��',
   description          VARCHAR(200) COMMENT '��ע',
   state                TINYINT NOT NULL COMMENT '1=������ 3=���� 5=�ѹ���',
   PRIMARY KEY (id)
);

/*==============================================================*/
/* Table: tr_reply                                              */
/*==============================================================*/
CREATE TABLE tr_reply
(
   id                   BIGINT NOT NULL AUTO_INCREMENT,
   user_id              BIGINT NOT NULL,
   place_id             BIGINT NOT NULL,
   description          VARCHAR(200),
   PRIMARY KEY (id)
);

/*==============================================================*/
/* Table: tr_resource                                           */
/*==============================================================*/
CREATE TABLE tr_resource
(
   id                   BIGINT NOT NULL AUTO_INCREMENT,
   user_id              BIGINT NOT NULL,
   car_id               BIGINT NOT NULL,
   create_time          DATETIME NOT NULL COMMENT '����ʱ��',
   publish_time         DATETIME COMMENT '����ʱ��',
   state                TINYINT NOT NULL COMMENT '1=δ���� 5=�ѷ��� 9=�ѹ���',
   description          VARCHAR(200),
   resource_type        TINYINT NOT NULL,
   PRIMARY KEY (id)
);

/*==============================================================*/
/* Table: tr_user                                               */
/*==============================================================*/
CREATE TABLE tr_user
(
   id                   BIGINT NOT NULL AUTO_INCREMENT,
   nick_name            VARCHAR(50) NOT NULL,
   phone_number         CHAR NOT NULL,
   email                VARCHAR(100) NOT NULL,
   gender               TINYINT NOT NULL,
   age                  TINYINT,
   head_icon            VARCHAR(500),
   identifier_number    VARCHAR(20),
   identifier_icon      VARCHAR(500),
   create_time          DATETIME NOT NULL COMMENT '����ʱ��',
   update_time          DATETIME NOT NULL COMMENT '����ʱ��',
   score                DOUBLE,
   state                TINYINT NOT NULL COMMENT '0 =���� 1 ����',
   user_type            TINYINT NOT NULL COMMENT '�û�����',
   PRIMARY KEY (id)
);
