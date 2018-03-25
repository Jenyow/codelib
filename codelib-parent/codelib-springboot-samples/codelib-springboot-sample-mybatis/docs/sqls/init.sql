-- ----------------------------
-- Table structure for grades
-- ----------------------------
DROP TABLE IF EXISTS `grades`;
CREATE TABLE `grades` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '年级ID',
  `name` varchar(255) NOT NULL COMMENT '年级名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生ID',
  `name` varchar(255) NOT NULL COMMENT '学生名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for textbooks
-- ----------------------------
DROP TABLE IF EXISTS `textbooks`;
CREATE TABLE `textbooks` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '教科书ID',
  `name` varchar(255) NOT NULL COMMENT '教科书名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for courses
-- ----------------------------
DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程ID',
  `name` varchar(255) NOT NULL COMMENT '课程名',
  `textbook_id` int(11) NOT NULL COMMENT '教科书ID',
  `grade_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `textbook_id` (`textbook_id`),
  KEY `grade_id` (`grade_id`),
  CONSTRAINT `courses_ibfk_3` FOREIGN KEY (`textbook_id`) REFERENCES `textbooks` (`id`),
  CONSTRAINT `courses_ibfk_4` FOREIGN KEY (`grade_id`) REFERENCES `grades` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student_courses
-- ----------------------------
DROP TABLE IF EXISTS `student_courses`;
CREATE TABLE `student_courses` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `course_id` int(11) NOT NULL COMMENT '课程ID',
  `student_id` int(11) NOT NULL COMMENT '学生ID',
  PRIMARY KEY (`id`),
  KEY `student_id` (`student_id`),
  KEY `course_id` (`course_id`),
  CONSTRAINT `student_courses_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`),
  CONSTRAINT `student_courses_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `courses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;