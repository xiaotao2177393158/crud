/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : ssm_demo_db

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 23/02/2023 10:20:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ssm_user
-- ----------------------------
DROP TABLE IF EXISTS `ssm_user`;
CREATE TABLE `ssm_user`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '登录名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '加密后的密码字段',
  `role_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '普通管理员' COMMENT '用户角色',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 88 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ssm_user
-- ----------------------------
INSERT INTO `ssm_user` VALUES (2, 'admin', 'e10adc3949ba59abbe56e057f20f883e', '系统管理员');
INSERT INTO `ssm_user` VALUES (3, 'xiaotao', 'cc83733cb0af8b884ff6577086b87909', '普通管理员');
INSERT INTO `ssm_user` VALUES (4, 'root', '36b74e397832402c57934da8c172fd83', '普通管理员');

SET FOREIGN_KEY_CHECKS = 1;
