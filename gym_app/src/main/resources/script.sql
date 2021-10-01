CREATE DATABASE gym_app;
USE gym_app;


DROP TABLE IF EXISTS `Administrator`;
CREATE TABLE `Administrator`
(
    `ID`      int NOT NULL AUTO_INCREMENT,
    `name`    varchar(50) DEFAULT NULL,
    `Role_ID` int         DEFAULT NULL,
    PRIMARY KEY (`ID`),
    KEY `Role_ID` (`Role_ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

LOCK TABLES `Administrator` WRITE;
UNLOCK TABLES;

DROP TABLE IF EXISTS `Administrator_Role`;
CREATE TABLE `Administrator_Role`
(
    `ID`               int NOT NULL AUTO_INCREMENT,
    `administrator_id` int DEFAULT NULL,
    `role_id`          int DEFAULT NULL,
    PRIMARY KEY (`ID`),
    KEY `administrator_id` (`administrator_id`),
    KEY `role_id` (`role_id`),
    CONSTRAINT `administrator_role_ibfk_1` FOREIGN KEY (`administrator_id`) REFERENCES `Administrator` (`ID`),
    CONSTRAINT `administrator_role_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `Role` (`Role_ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;


LOCK TABLES `Administrator_Role` WRITE;
UNLOCK TABLES;


DROP TABLE IF EXISTS `C_type`;
CREATE TABLE `C_type`
(
    `c_type_id`   int NOT NULL AUTO_INCREMENT,
    `c_type_name` varchar(50) DEFAULT NULL,
    PRIMARY KEY (`c_type_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;


LOCK TABLES `C_type` WRITE;
UNLOCK TABLES;

DROP TABLE IF EXISTS `Customer`;
CREATE TABLE `Customer`
(
    `customer_id`      int NOT NULL AUTO_INCREMENT,
    `customer_name`    varchar(50) DEFAULT NULL,
    `customer_surname` varchar(50) DEFAULT NULL,
    `customer_email`   varchar(50) DEFAULT NULL,
    `trainer_id`       int         DEFAULT NULL,
    `customer_type_id` int         DEFAULT NULL,
    PRIMARY KEY (`customer_id`),
    KEY `customer_type_id` (`customer_type_id`),
    CONSTRAINT `customer_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `Customer_type` (`customer_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;


LOCK TABLES `Customer` WRITE;
UNLOCK TABLES;


DROP TABLE IF EXISTS `Customer_membership`;
CREATE TABLE `Customer_membership`
(
    `ID`                    int NOT NULL AUTO_INCREMENT,
    `membership_id`         int         DEFAULT NULL,
    `customer_id`           int         DEFAULT NULL,
    `membership_start_date` datetime    DEFAULT NULL,
    `membership_end_date`   datetime    DEFAULT NULL,
    `membership_expiration` int         DEFAULT NULL,
    `membership_type`       varchar(50) DEFAULT NULL,
    `membership_price`      float       DEFAULT NULL,
    PRIMARY KEY (`ID`),
    KEY `membership_id` (`membership_id`),
    KEY `customer_id` (`customer_id`),
    CONSTRAINT `customer_membership_ibfk_1` FOREIGN KEY (`membership_id`) REFERENCES `Membership` (`ID`),
    CONSTRAINT `customer_membership_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `Customer` (`customer_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

LOCK TABLES `Customer_membership` WRITE;
UNLOCK TABLES;


DROP TABLE IF EXISTS `Customer_trainer`;
CREATE TABLE `Customer_trainer`
(
    `ID`          int NOT NULL AUTO_INCREMENT,
    `customer_id` int DEFAULT NULL,
    `trainer_id`  int DEFAULT NULL,
    PRIMARY KEY (`ID`),
    KEY `customer_id` (`customer_id`),
    KEY `trainer_id` (`trainer_id`),
    CONSTRAINT `customer_trainer_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `Customer` (`customer_id`),
    CONSTRAINT `customer_trainer_ibfk_2` FOREIGN KEY (`trainer_id`) REFERENCES `Trainer` (`trainer_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

LOCK TABLES `Customer_trainer` WRITE;
ALTER TABLE `Customer_trainer`
    DISABLE KEYS;
ALTER TABLE `Customer_trainer`
    ENABLE KEYS;
UNLOCK TABLES;


DROP TABLE IF EXISTS `Customer_type`;
CREATE TABLE `Customer_type`
(
    `ID`          int NOT NULL AUTO_INCREMENT,
    `customer_id` int DEFAULT NULL,
    `c_type_id`   int DEFAULT NULL,
    PRIMARY KEY (`ID`),
    UNIQUE KEY `customer_id` (`customer_id`),
    UNIQUE KEY `customer_id_2` (`customer_id`),
    KEY `perk_id` (`c_type_id`),
    CONSTRAINT `customer_type_ibfk_1` FOREIGN KEY (`c_type_id`) REFERENCES `C_type` (`c_type_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

LOCK TABLES `Customer_type` WRITE;
UNLOCK TABLES;


DROP TABLE IF EXISTS `Membership`;
CREATE TABLE `Membership`
(
    `ID`              int NOT NULL AUTO_INCREMENT,
    `membership_type` varchar(50) DEFAULT NULL,
    `price`           int         DEFAULT NULL,
    PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;



LOCK TABLES `Membership` WRITE;
UNLOCK TABLES;

DROP TABLE IF EXISTS `Role`;
CREATE TABLE `Role`
(
    `Role_ID` int NOT NULL AUTO_INCREMENT,
    `Role`    varchar(50) DEFAULT NULL,
    PRIMARY KEY (`Role_ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;


LOCK TABLES `Role` WRITE;
UNLOCK TABLES;

DROP TABLE IF EXISTS `Trainer`;
CREATE TABLE `Trainer`
(
    `trainer_id`       int NOT NULL AUTO_INCREMENT,
    `trainer_name`     varchar(50) DEFAULT NULL,
    `trainer_surname`  varchar(50) DEFAULT NULL,
    `trainer_email`    varchar(50) DEFAULT NULL,
    `Activity_type_id` int         DEFAULT NULL,
    PRIMARY KEY (`trainer_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;


LOCK TABLES `Trainer` WRITE;
UNLOCK TABLES;

DROP TABLE IF EXISTS `Trainer_Role`;
CREATE TABLE `Trainer_Role`
(
    `ID`         int NOT NULL AUTO_INCREMENT,
    `trainer_id` int DEFAULT NULL,
    `role_id`    int DEFAULT NULL,
    PRIMARY KEY (`ID`),
    KEY `trainer_id` (`trainer_id`),
    KEY `role_id` (`role_id`),
    CONSTRAINT `trainer_role_ibfk_1` FOREIGN KEY (`trainer_id`) REFERENCES `Trainer` (`trainer_id`),
    CONSTRAINT `trainer_role_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `Role` (`Role_ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;


LOCK TABLES `Trainer_Role` WRITE;
UNLOCK TABLES;

alter table Customer
    modify COLUMN personal_code VARCHAR(11);
alter table customer
    drop foreign key customer_ibfk_2;
INSERT INTO customer(customer_name, customer_surname, customer_email)
VALUES ('Bobby', 'Dallas', 'aboballas@gmail.com');
INSERT INTO customer(customer_name, customer_surname, customer_email)
VALUES ('Tom', 'Dallas', 'llas@gmail.com');
INSERT INTO customer(customer_name, customer_surname, customer_email)
VALUES ('Rob', 'Dallas', 'bas@gmail.com');
INSERT INTO customer(customer_name, customer_surname, customer_email)
VALUES ('Hannah', 'Dallas', 'maodallas@gmail.com');
INSERT INTO customer(customer_name, customer_surname, customer_email)
VALUES ('Helena', 'Dallas', 'odallas@gmail.com');
INSERT INTO customer(customer_name, customer_surname, customer_email)
VALUES ('Adriana', 'Dallas', '87odallas@gmail.com');
INSERT INTO customer(customer_name, customer_surname, customer_email)
VALUES ('Vera', 'Dalloos', '76aodallas@gmail.com');
INSERT INTO customer(customer_name, customer_surname, customer_email)
VALUES ('Aza', 'Dallas', '65baodallas@gmail.com');
INSERT INTO customer(customer_name, customer_surname, customer_email)
VALUES ('Debra', 'Dallas', '56baodallas@gmail.com');
INSERT INTO customer(customer_name, customer_surname, customer_email)
VALUES ('Tifany', 'Dallas', '22baodallas@gmail.com');
INSERT INTO customer(customer_name, customer_surname, customer_email)
VALUES ('Martha', 'Dallas', '32baodallas@gmail.com');
INSERT INTO customer(customer_name, customer_surname, customer_email)
VALUES ('Kurama', 'Dallas', '11dallas@gmail.com');
INSERT INTO customer(customer_name, customer_surname, customer_email)
VALUES ('Maha', 'Dallas', '21baodallas@gmail.com');



SELECT *
from customer;
update customer
set personal_code = '23499080588'
where customer_id = 14;
update customer
set personal_code = '76567308053'
where customer_id = 13;
update customer
set personal_code = '15047620075'
where customer_id = 12;
update customer
set personal_code = '39735480985'
where customer_id = 11;
update customer
set personal_code = '41733868941'
where customer_id = 10;
update customer
set personal_code = '31790477655'
where customer_id = 9;
update customer
set personal_code = '11300311268'
where customer_id = 8;
update customer
set personal_code = '10831835876'
where customer_id = 7;
update customer
set personal_code = '63192057083'
where customer_id = 6;
update customer
set personal_code = '26830015849'
where customer_id = 5;
update customer
set personal_code = '47526216677'
where customer_id = 4;
update customer
set personal_code = '93547829754'
where customer_id = 3;
update customer
set personal_code = '98645931063'
where customer_id = 2;
update customer
set personal_code = '56133853684'
where customer_id = 1;


CREATE UNIQUE INDEX personal_code on customer (personal_code);
INSERT INTO hibernate_sequence (sequence_name, next_val)
VALUES ('', 0);
create table hibernate_sequence
(
    sequence_name VARCHAR(40) NOT NULL,
    next_val      INTEGER     NOT NULL
)