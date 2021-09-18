create database gym_app;
use gym_app;

CREATE TABLE `membership` (
                              `membership_id` int PRIMARY KEY AUTO_INCREMENT,
                              `membership_type` varchar(255),
                              `price` int
);

CREATE TABLE `Trainers` (
                            `trainer_id` int PRIMARY KEY AUTO_INCREMENT,
                            `trainer_name` VARCHAR(50),
                            `trainer_surname` VARCHAR(50),
                            `trainer_email` VARCHAR(50),
                            `Role_ID` int
);

CREATE TABLE `Customer` (
                            `customer_id` INT PRIMARY KEY AUTO_INCREMENT,
                            `customer_name` VARCHAR(50),
                            `customer_surname` VARCHAR(50),
                            `customer_email` VARCHAR(50),
                            `trainer_id` int,
                            `membership_id` int
);

CREATE TABLE `Roles` (
                         `Role_ID` int PRIMARY KEY AUTO_INCREMENT,
                         `Role` VARCHAR(50)
);

CREATE TABLE `Administrators` (
                                  `ID` int PRIMARY KEY AUTO_INCREMENT,
                                  `name` VARCHAR(50),
                                  `Role_ID` int
);

ALTER TABLE `Customer` ADD FOREIGN KEY (`trainer_id`) REFERENCES `Trainers` (`trainer_id`);

ALTER TABLE `Customer` ADD FOREIGN KEY (`membership_id`) REFERENCES `membership` (`membership_id`);

ALTER TABLE `Administrators` ADD FOREIGN KEY (`Role_ID`) REFERENCES `Roles` (`Role_ID`);

ALTER TABLE `Trainers` ADD FOREIGN KEY (`Role_ID`) REFERENCES `Roles` (`Role_ID`);
