/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : mall

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2019-03-21 15:44:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ums_admin
-- ----------------------------
DROP TABLE IF EXISTS ums_admin;
CREATE TABLE ums_admin (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  username varchar(64) DEFAULT NULL,
  password varchar(64) DEFAULT NULL,
  icon varchar(500) DEFAULT NULL COMMENT '头像',
  email varchar(100) DEFAULT NULL COMMENT '邮箱',
  nick_name varchar(200) DEFAULT NULL COMMENT '昵称',
  note varchar(500) DEFAULT NULL COMMENT '备注信息',
  create_time datetime DEFAULT NULL COMMENT '创建时间',
  login_time datetime DEFAULT NULL COMMENT '最后登录时间',
  status int(1) DEFAULT '1' COMMENT '帐号启用状态：0->禁用；1->启用',
  PRIMARY KEY (id)
) COMMENT='后台用户表';

-- ----------------------------
-- Records of ums_admin
-- ----------------------------
INSERT INTO ums_admin VALUES ('1', 'test', '$2a$10$NZ5o7r2E.ayT2ZoxgjlI.eJ6OEYqjH7INR/F.mXDbjZJi9HF0YCVG', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/timg.jpg', null, '测试账号', null, '2018-09-29 13:55:30', '2018-09-29 13:55:39', '1');
INSERT INTO ums_admin VALUES ('3', 'admin', '$2a$10$NZ5o7r2E.ayT2ZoxgjlI.eJ6OEYqjH7INR/F.mXDbjZJi9HF0YCVG', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20190129/170157_yIl3_1767531.jpg', 'admin@163.com', '系统管理员', '系统管理员', '2018-10-08 13:32:47', '2019-03-20 15:38:50', '1');