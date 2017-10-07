

USE cloudnote;

CREATE TABLE `t_user` (
  `id` INT UNSIGNED NOT NULL,
  `email` VARCHAR(255) NULL,
  `isActive` INT NULL,
  `pwd` CHAR(255) NULL,
  `username` VARCHAR(45) NULL,
  `usernameRaw` VARCHAR(45) NULL,
  `time` DATE NULL,
  PRIMARY KEY (`id`));
