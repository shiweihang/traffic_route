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
   car_brand_id         BIGINT NOT NULL COMMENT '品牌ID',
   color                BIGINT COMMENT '颜色',
   number               VARCHAR(50) COMMENT '车牌号',
   seat_number          INT COMMENT '座位数量',
   PRIMARY KEY (id)
);

/*==============================================================*/
/* Table: tr_car_brand                                          */
/*==============================================================*/
CREATE TABLE tr_car_brand
(
   id                   BIGINT NOT NULL AUTO_INCREMENT,
   brand_name           VARCHAR(50) NOT NULL,
   parent_id            BIGINT COMMENT '父节点',
   root_id              BIGINT NOT NULL COMMENT '根节点',
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
   id                   BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
   place_name           VARCHAR(500) NOT NULL COMMENT '地点名称',
   X                    DOUBLE NOT NULL COMMENT 'x坐标',
   Y                    DOUBLE NOT NULL COMMENT 'y坐标',
   sort_index           BIGINT NOT NULL COMMENT '排序字段',
   source_id            BIGINT NOT NULL COMMENT '资源id',
   place_type           TINYINT NOT NULL COMMENT '地点所属类型 1=属于driver资源  2=属于乘客资源',
   estimate_time        DATETIME NOT NULL COMMENT '预计发车时间',
   description          VARCHAR(200) COMMENT '备注',
   state                TINYINT NOT NULL COMMENT '1=进行中 3=人满 5=已过期',
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
   create_time          DATETIME NOT NULL COMMENT '创建时间',
   publish_time         DATETIME COMMENT '发布时间',
   state                TINYINT NOT NULL COMMENT '1=未发布 5=已发布 9=已过期',
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
   create_time          DATETIME NOT NULL COMMENT '创建时间',
   update_time          DATETIME NOT NULL COMMENT '更新时间',
   score                DOUBLE,
   state                TINYINT NOT NULL COMMENT '0 =禁用 1 正常',
   user_type            TINYINT NOT NULL COMMENT '用户类型',
   PRIMARY KEY (id)
);
