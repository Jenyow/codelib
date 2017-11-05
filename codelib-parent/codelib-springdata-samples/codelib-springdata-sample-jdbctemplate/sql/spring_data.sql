/*
Navicat MySQL Data Transfer

Source Server         : mysql-localhost
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : spring_data

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-10-16 20:35:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', 'zhangsan', '20');
INSERT INTO `student` VALUES ('2', 'lisi', '21');
INSERT INTO `student` VALUES ('3', 'wangwu', '22');
INSERT INTO `student` VALUES ('4', 'test', '30');
