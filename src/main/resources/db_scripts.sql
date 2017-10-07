CREATE DATABASE ${db_name} DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE ${db_name};

CREATE TABLE `t_customer` (
  `custom_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `custom_name` varchar(128) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `asdf` varchar(255) DEFAULT NULL,
  `asdf1` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`custom_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


CREATE TABLE `t_customer2` (
  `custom_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `custom_name` varchar(128) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `asdf` varchar(255) DEFAULT NULL,
  `asdf1` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`custom_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;



use tenant;
