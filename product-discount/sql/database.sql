-- MySQL Workbench Synchronization
-- Generated: 2021-04-09 15:04
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: Leonardo Lemes Bufalo

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `hash` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE IF NOT EXISTS `hash`.`products` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `price_in_cents` INT(11) NULL DEFAULT NULL,
  `title` VARCHAR(250) NULL DEFAULT NULL,
  `description` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `hash`.`users` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(200) NULL DEFAULT NULL,
  `last_name` VARCHAR(200) NULL DEFAULT NULL,
  `date_of_birth` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `hash`.`discounts` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `percentage` INT(11) NULL DEFAULT NULL,
  `name` VARCHAR(200) NULL DEFAULT NULL,
  `is_enable` BOOLEAN NULL DEFAULT NULL,
  `begin_date` DATE NULL DEFAULT NULL,
  `end_date` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

## INSERTS ##
INSERT INTO hash.products (price_in_cents, title, description)
	VALUES (3000, 'Helmet from Moria', 'This helm was created by dwarfs in Moria');
    
INSERT INTO hash.products (price_in_cents, title, description)
	VALUES (6000, 'Plate Armour from Lothlorien', 'It was created by elves in Lothlorien');
      
INSERT INTO hash.discounts (percentage, name, is_enable, begin_date, end_date)
	VALUES (10, 'birthday', true, NULL, NULL);

INSERT INTO hash.discounts (percentage, name, is_enable, begin_date, end_date)
	VALUES (5, 'black_friday', true, '2021-11-25', '2021-11-25');

INSERT INTO hash.discounts (percentage, name, is_enable, begin_date, end_date)
	VALUES (15, 'commum_discount_1', false, '2021-01-01', '2021-12-10');

INSERT INTO hash.discounts (percentage, name, is_enable, begin_date, end_date)
	VALUES (10, 'commum_discount_2', false, '2021-01-01', '2021-12-10');

INSERT INTO hash.discounts (percentage, name, is_enable, begin_date, end_date)
	VALUES (10, 'commum_discount_3', false, '2022-01-01', '2022-12-10');

INSERT INTO hash.users (first_name, last_name, date_of_birth) 
  VALUES ("Johnny", "Silverhad", "1988-11-16");

INSERT INTO hash.users (first_name, last_name, date_of_birth)
  VALUES ("John", "Kramer", "1942-08-07");

INSERT INTO hash.users (first_name, last_name, date_of_birth)
  VALUES ("Leo", "Bufalo", "1996-05-01");