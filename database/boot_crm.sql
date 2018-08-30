# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: localhost (MySQL 5.7.12)
# Database: boot_crm
# Generation Time: 2018-08-27 13:49:53 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table base_dict
# ------------------------------------------------------------

DROP TABLE IF EXISTS `base_dict`;

CREATE TABLE `base_dict` (
  `dict_id` varchar(32) NOT NULL DEFAULT '',
  `dict_type_code` varchar(10) NOT NULL DEFAULT '',
  `dict_type_name` varchar(50) NOT NULL DEFAULT '',
  `dict_item_name` varchar(50) NOT NULL DEFAULT '',
  `dict_item_code` varchar(10) NOT NULL DEFAULT '',
  `dict_sort` int(10) NOT NULL,
  `dict_enable` char(1) NOT NULL DEFAULT '',
  `dict_memo` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`dict_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `base_dict` WRITE;
/*!40000 ALTER TABLE `base_dict` DISABLE KEYS */;

INSERT INTO `base_dict` (`dict_id`, `dict_type_code`, `dict_type_name`, `dict_item_name`, `dict_item_code`, `dict_sort`, `dict_enable`, `dict_memo`)
VALUES
	('1','002','客户来源','网络营销','',1,'1',''),
	('2','002','客户来源','电话营销','',1,'1',''),
	('3','001','客户所属行业','教育培训','',1,'1',''),
	('4','001','客户所属行业','对外贸易','',1,'1',''),
	('5','001','客户所属行业','电子商务','',1,'1',''),
	('6','001','客户所属行业','酒店旅游','',1,'1',''),
	('7','001','客户所属行业','房地产','',1,'1',''),
	('8','006','客户级别','VIP客户','',1,'1',''),
	('9','006','客户级别','普通客户','',1,'1','');

/*!40000 ALTER TABLE `base_dict` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table customer
# ------------------------------------------------------------

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `cust_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `cust_name` varchar(50) NOT NULL DEFAULT '',
  `cust_user_id` int(11) unsigned NOT NULL,
  `cust_create_id` int(10) unsigned NOT NULL,
  `cust_source` varchar(50) NOT NULL DEFAULT '',
  `cust_industry` varchar(50) NOT NULL DEFAULT '',
  `cust_level` varchar(32) NOT NULL DEFAULT '',
  `cust_linkman` varchar(50) NOT NULL DEFAULT '',
  `cust_phone` varchar(64) NOT NULL DEFAULT '',
  `cust_mobile` varchar(16) NOT NULL DEFAULT '',
  `cust_zipcode` varchar(10) NOT NULL DEFAULT '',
  `cust_address` varchar(100) NOT NULL DEFAULT '',
  `cust_createtime` datetime NOT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table sys_user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `user_id` int(32) unsigned NOT NULL AUTO_INCREMENT,
  `user_code` varchar(32) NOT NULL DEFAULT '',
  `user_name` varchar(50) NOT NULL DEFAULT '',
  `user_password` varchar(32) NOT NULL DEFAULT '',
  `user_state` varchar(1) NOT NULL DEFAULT '',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `sys_user` WRITE;
/*!40000 ALTER TABLE `sys_user` DISABLE KEYS */;

INSERT INTO `sys_user` (`user_id`, `user_code`, `user_name`, `user_password`, `user_state`)
VALUES
	(1,'admin','管理员','123456','1');

/*!40000 ALTER TABLE `sys_user` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
