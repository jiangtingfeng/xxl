/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : xxl_job

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-09-24 13:36:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for xxl_job_group
-- ----------------------------
DROP TABLE IF EXISTS `xxl_job_group`;
CREATE TABLE `xxl_job_group` (
  `id` int(11) NOT NULL auto_increment,
  `app_name` varchar(64) NOT NULL COMMENT '执行器AppName',
  `title` varchar(12) NOT NULL COMMENT '执行器名称',
  `order` int(11) NOT NULL default '0' COMMENT '排序',
  `address_type` tinyint(4) NOT NULL default '0' COMMENT '执行器地址类型：0=自动注册、1=手动录入',
  `address_list` varchar(512) default NULL COMMENT '执行器地址列表，多地址逗号分隔',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xxl_job_group
-- ----------------------------
INSERT INTO `xxl_job_group` VALUES ('2', 'xxl-job-executor-sample', '执行器实例', '1', '0', null);

-- ----------------------------
-- Table structure for xxl_job_info
-- ----------------------------
DROP TABLE IF EXISTS `xxl_job_info`;
CREATE TABLE `xxl_job_info` (
  `id` int(11) NOT NULL auto_increment,
  `job_group` int(11) NOT NULL COMMENT '执行器主键ID',
  `job_cron` varchar(128) NOT NULL COMMENT '任务执行CRON',
  `job_desc` varchar(255) NOT NULL,
  `add_time` datetime default NULL,
  `update_time` datetime default NULL,
  `author` varchar(64) default NULL COMMENT '作者',
  `alarm_email` varchar(255) default NULL COMMENT '报警邮件',
  `executor_route_strategy` varchar(50) default NULL COMMENT '执行器路由策略',
  `executor_handler` varchar(255) default NULL COMMENT '执行器任务handler',
  `executor_param` varchar(512) default NULL COMMENT '执行器任务参数',
  `executor_block_strategy` varchar(50) default NULL COMMENT '阻塞处理策略',
  `executor_timeout` int(11) NOT NULL default '0' COMMENT '任务执行超时时间，单位秒',
  `executor_fail_retry_count` int(11) NOT NULL default '0' COMMENT '失败重试次数',
  `glue_type` varchar(50) NOT NULL COMMENT 'GLUE类型',
  `glue_source` mediumtext COMMENT 'GLUE源代码',
  `glue_remark` varchar(128) default NULL COMMENT 'GLUE备注',
  `glue_updatetime` datetime default NULL COMMENT 'GLUE更新时间',
  `child_jobid` varchar(255) default NULL COMMENT '子任务ID，多个逗号分隔',
  `trigger_status` tinyint(4) NOT NULL default '0' COMMENT '调度状态：0-停止，1-运行',
  `trigger_last_time` bigint(13) NOT NULL default '0' COMMENT '上次调度时间',
  `trigger_next_time` bigint(13) NOT NULL default '0' COMMENT '下次调度时间',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xxl_job_info
-- ----------------------------
INSERT INTO `xxl_job_info` VALUES ('8', '2', '1 1 1 * * ? *', '测试任务1', '2019-09-24 09:38:41', '2019-09-24 10:28:26', 'jiangtingfeng', '', 'FIRST', '', '1 1 1 * * ? *', 'SERIAL_EXECUTION', '0', '0', 'GLUE_GROOVY', 'package com.xxl.job.service.handler;\r\n\r\nimport com.xxl.job.core.log.XxlJobLogger;\r\nimport com.xxl.job.core.biz.model.ReturnT;\r\nimport com.xxl.job.core.handler.IJobHandler;\r\n\r\npublic class DemoGlueJobHandler extends IJobHandler {\r\n\r\n	@Override\r\n	public ReturnT<String> execute(String param) throws Exception {\r\n		XxlJobLogger.log(\"XXL-JOB, Hello World.\");\r\n		return ReturnT.SUCCESS;\r\n	}\r\n\r\n}\r\n', 'GLUE代码初始化', '2019-09-24 09:38:41', '', '0', '0', '0');
INSERT INTO `xxl_job_info` VALUES ('9', '2', '1 1 1 * * ? *', '测试任务2', '2019-09-24 09:59:23', '2019-09-24 10:10:21', 'jiangtingfeng', '', 'FIRST', 'commandJobHandler', '1 1 1 * * ? *', 'SERIAL_EXECUTION', '0', '0', 'BEAN', '', 'GLUE代码初始化', '2019-09-24 09:59:23', '', '0', '0', '0');
INSERT INTO `xxl_job_info` VALUES ('10', '2', '1 1 1 * * ? *', '测试任务3', '2019-09-24 10:03:58', '2019-09-24 10:10:18', 'jiangtingfeng', '', 'FIRST', 'httpJobHandler', '1 1 1 * * ? *', 'SERIAL_EXECUTION', '0', '0', 'BEAN', '', 'GLUE代码初始化', '2019-09-24 10:03:58', '', '0', '0', '0');
INSERT INTO `xxl_job_info` VALUES ('11', '2', '1 1 1 * * ? *', '测试任务4', '2019-09-24 10:07:11', '2019-09-24 10:10:09', 'jiangtingfeng', '', 'FIRST', '', '1 1 1 * * ? *', 'SERIAL_EXECUTION', '0', '0', 'GLUE_SHELL', '#!/bin/bash\necho \"xxl-job: hello shell\"\n\necho \"脚本位置：$0\"\necho \"任务参数：$1\"\necho \"分片序号 = $2\"\necho \"分片总数 = $3\"\n\necho \"Good bye!\"\nexit 0\n', 'GLUE代码初始化', '2019-09-24 10:07:11', '', '0', '0', '0');

-- ----------------------------
-- Table structure for xxl_job_lock
-- ----------------------------
DROP TABLE IF EXISTS `xxl_job_lock`;
CREATE TABLE `xxl_job_lock` (
  `lock_name` varchar(50) NOT NULL COMMENT '锁名称',
  PRIMARY KEY  (`lock_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xxl_job_lock
-- ----------------------------
INSERT INTO `xxl_job_lock` VALUES ('schedule_lock');

-- ----------------------------
-- Table structure for xxl_job_log
-- ----------------------------
DROP TABLE IF EXISTS `xxl_job_log`;
CREATE TABLE `xxl_job_log` (
  `id` bigint(20) NOT NULL auto_increment,
  `job_group` int(11) NOT NULL COMMENT '执行器主键ID',
  `job_id` int(11) NOT NULL COMMENT '任务，主键ID',
  `executor_address` varchar(255) default NULL COMMENT '执行器地址，本次执行的地址',
  `executor_handler` varchar(255) default NULL COMMENT '执行器任务handler',
  `executor_param` varchar(512) default NULL COMMENT '执行器任务参数',
  `executor_sharding_param` varchar(20) default NULL COMMENT '执行器任务分片参数，格式如 1/2',
  `executor_fail_retry_count` int(11) NOT NULL default '0' COMMENT '失败重试次数',
  `trigger_time` datetime default NULL COMMENT '调度-时间',
  `trigger_code` int(11) NOT NULL COMMENT '调度-结果',
  `trigger_msg` text COMMENT '调度-日志',
  `handle_time` datetime default NULL COMMENT '执行-时间',
  `handle_code` int(11) NOT NULL COMMENT '执行-状态',
  `handle_msg` text COMMENT '执行-日志',
  `alarm_status` tinyint(4) NOT NULL default '0' COMMENT '告警状态：0-默认、1-无需告警、2-告警成功、3-告警失败',
  PRIMARY KEY  (`id`),
  KEY `I_trigger_time` (`trigger_time`),
  KEY `I_handle_code` (`handle_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xxl_job_log
-- ----------------------------

-- ----------------------------
-- Table structure for xxl_job_logglue
-- ----------------------------
DROP TABLE IF EXISTS `xxl_job_logglue`;
CREATE TABLE `xxl_job_logglue` (
  `id` int(11) NOT NULL auto_increment,
  `job_id` int(11) NOT NULL COMMENT '任务，主键ID',
  `glue_type` varchar(50) default NULL COMMENT 'GLUE类型',
  `glue_source` mediumtext COMMENT 'GLUE源代码',
  `glue_remark` varchar(128) NOT NULL COMMENT 'GLUE备注',
  `add_time` timestamp NULL default NULL,
  `update_time` timestamp NULL default NULL on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xxl_job_logglue
-- ----------------------------

-- ----------------------------
-- Table structure for xxl_job_registry
-- ----------------------------
DROP TABLE IF EXISTS `xxl_job_registry`;
CREATE TABLE `xxl_job_registry` (
  `id` int(11) NOT NULL auto_increment,
  `registry_group` varchar(255) NOT NULL,
  `registry_key` varchar(255) NOT NULL,
  `registry_value` varchar(255) NOT NULL,
  `update_time` timestamp NOT NULL default CURRENT_TIMESTAMP,
  PRIMARY KEY  (`id`),
  KEY `i_g_k_v` (`registry_group`,`registry_key`,`registry_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xxl_job_registry
-- ----------------------------

-- ----------------------------
-- Table structure for xxl_job_user
-- ----------------------------
DROP TABLE IF EXISTS `xxl_job_user`;
CREATE TABLE `xxl_job_user` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(50) NOT NULL COMMENT '账号',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `role` tinyint(4) NOT NULL COMMENT '角色：0-普通用户、1-管理员',
  `permission` varchar(255) default NULL COMMENT '权限：执行器ID列表，多个逗号分割',
  PRIMARY KEY  (`id`),
  UNIQUE KEY `i_username` USING BTREE (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xxl_job_user
-- ----------------------------
INSERT INTO `xxl_job_user` VALUES ('1', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '1', null);
INSERT INTO `xxl_job_user` VALUES ('2', 'user', 'e10adc3949ba59abbe56e057f20f883e', '0', '');
