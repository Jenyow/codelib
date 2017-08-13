-- ----------------------------
-- Table structure for groups
-- ----------------------------
DROP TABLE IF EXISTS `groups`;
CREATE TABLE `groups` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(255) NOT NULL,
  `enabled` smallint(6) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for group_members
-- ----------------------------
DROP TABLE IF EXISTS `group_members`;
CREATE TABLE `group_members` (
  `username` varchar(255) NOT NULL,
  `group_id` int(11) NOT NULL,
  PRIMARY KEY (`group_id`,`username`),
  KEY `FK_g6f8sgprm2iucgjog0kudawli` (`username`),
  CONSTRAINT `FK_g6f8sgprm2iucgjog0kudawli` FOREIGN KEY (`username`) REFERENCES `users` (`username`),
  CONSTRAINT `FK_pi01d3030xd2sww1fag358x0x` FOREIGN KEY (`group_id`) REFERENCES `groups` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for authorities
-- ----------------------------
DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities` (
  `authority` varchar(255) NOT NULL,
  `level` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `parent_authority` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`authority`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for group_authorities
-- ----------------------------
DROP TABLE IF EXISTS `group_authorities`;
CREATE TABLE `group_authorities` (
  `group_id` int(11) NOT NULL,
  `authority` varchar(255) NOT NULL,
  PRIMARY KEY (`group_id`,`authority`),
  KEY `FK_gus94d95waks29iuvqxctn06d` (`authority`),
  CONSTRAINT `FK_8spt6a9lq900joiclwr9jdban` FOREIGN KEY (`group_id`) REFERENCES `groups` (`id`),
  CONSTRAINT `FK_gus94d95waks29iuvqxctn06d` FOREIGN KEY (`authority`) REFERENCES `authorities` (`authority`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of groups
-- ----------------------------
INSERT INTO `groups` (id,group_name) VALUES (1, 'groupA');
INSERT INTO `groups` (id,group_name) VALUES (2, 'groupB');
-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` (username,enabled,password) VALUES ('zhangsan', 1, '123456');
INSERT INTO `users` (username,enabled,password) VALUES ('lisi', 1, '123456');
INSERT INTO `users` (username,enabled,password) VALUES ('wangwu', 1, '123456');
INSERT INTO `users` (username,enabled,password) VALUES ('liuliu', 1, '123456');
-- ----------------------------
-- Records of group_members
-- ----------------------------
INSERT INTO `group_members` (username,group_id) VALUES ('zhangsan', 1);
INSERT INTO `group_members` (username,group_id) VALUES ('lisi', 2);
INSERT INTO `group_members` (username,group_id) VALUES ('wangwu', 1);
INSERT INTO `group_members` (username,group_id) VALUES ('liuliu', 2);
-- ----------------------------
-- Records of authorities
-- ----------------------------
INSERT INTO `authorities` (authority,level,name,parent_authority) VALUES ('ROLE_USER1', 1, '用户权限1','');
INSERT INTO `authorities` (authority,level,name,parent_authority) VALUES ('ROLE_USER2', 1, '用户权限2','');
INSERT INTO `authorities` (authority,level,name,parent_authority) VALUES ('ROLE_ADMIN1', 1, '管理员权限1','');
INSERT INTO `authorities` (authority,level,name,parent_authority) VALUES ('ROLE_ADMIN2', 1, '管理员权限2','');
-- ----------------------------
-- Records of group_authorities
-- ----------------------------
INSERT INTO `group_authorities` (group_id,authority) VALUES (1, 'ROLE_USER1');
INSERT INTO `group_authorities` (group_id,authority) VALUES (2, 'ROLE_USER2');
INSERT INTO `group_authorities` (group_id,authority) VALUES (1, 'ROLE_ADMIN1');
INSERT INTO `group_authorities` (group_id,authority) VALUES (2, 'ROLE_ADMIN2');
