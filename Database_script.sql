CREATE SCHEMA `student_portal` ;

USE student_portal;

CREATE TABLE `student_portal`.`student` (
  `student_id` INT NOT NULL AUTO_INCREMENT,
  `student_name` VARCHAR(45) NULL,
  `student_address` VARCHAR(100) NULL,
  `student_email` VARCHAR(45) NULL,
  `student_password` VARCHAR(45) NULL,
  PRIMARY KEY (`student_id`),
  UNIQUE INDEX `student_id_UNIQUE` (`student_id` ASC));
  
  CREATE TABLE `student_portal`.`register` (
  `register_id` INT NOT NULL AUTO_INCREMENT,
  `student_id` INT NOT NULL,
  `student_name` VARCHAR(45) NULL,
  `student_address` VARCHAR(100) NULL,
  `student_email` VARCHAR(45) NULL,
  `student_password` VARCHAR(45) NULL,
  `course_name` VARCHAR(45) NULL,
  PRIMARY KEY (`register_id`),
  UNIQUE INDEX `register_id_UNIQUE` (`register_id` ASC));
  
  CREATE TABLE `student_portal`.`administrator` (
  `Admin_id` int NOT NULL AUTO_INCREMENT,
  `Admin_name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Admin_id`),
  UNIQUE KEY `Admin_id_UNIQUE` (`Admin_id` ASC));
  
  INSERT INTO `student_portal`.`administrator` (`Admin_name`, `password`, `contact`) VALUES ('Admin', 'Admin12345', '0459042876');
  
  INSERT INTO `student_portal`.`student` (`student_name`, `student_address`, `student_email`, `student_password`) VALUES ('Pedro Germano', '14 James Street', 'pedro@student.ac.za', 'Pedro123');
  INSERT INTO `student_portal`.`student` (`student_name`, `student_address`, `student_email`, `student_password`) VALUES ('Francois Cornelius', '23 Board Road', 'francois@student.ac.za', 'Francois123');
  INSERT INTO `student_portal`.`student` (`student_name`, `student_address`, `student_email`, `student_password`) VALUES ('Gideon Rossouw', '8 Bedford Drive', 'gideon@student.ac.za', 'Gideon123');
  INSERT INTO `student_portal`.`student` (`student_name`, `student_address`, `student_email`, `student_password`) VALUES ('Michael Peter FALK', '45 Short Street', 'michael@student.ac.za', 'Michael123');
  INSERT INTO `student_portal`.`student` (`student_name`, `student_address`, `student_email`, `student_password`) VALUES ('Hanno Kruger', '12 Peace Road', 'hanno@student.ac.za', 'Hanno123');
  INSERT INTO `student_portal`.`student` (`student_name`, `student_address`, `student_email`, `student_password`) VALUES ('Boikanyo Nkoane', '5 Danie Street', 'boikanyo@student.ac.za', 'Boikanyo123');
  INSERT INTO `student_portal`.`student` (`student_name`, `student_address`, `student_email`, `student_password`) VALUES ('Emile Bouwer', '13 Ave', 'emile@student.ac.za', 'Emile123');
  INSERT INTO `student_portal`.`student` (`student_name`, `student_address`, `student_email`, `student_password`) VALUES ('Dylan Ellis', '25 Ruben Lane', 'dylan@student.ac.za', 'Dylan123');
  INSERT INTO `student_portal`.`student` (`student_name`, `student_address`, `student_email`, `student_password`) VALUES ('Jarryd Lyle Dass', '19 Ludorf Road', 'jarryd@student.ac.za', 'Jarryd123');

  INSERT INTO `student_portal`.`register` (`student_id`, `student_name`, `student_address`, `student_email`, `student_password`, `course_name`) VALUES ('5', 'Hanno Kruger', '12 Peace Road', 'hanno@student.ac.za', 'Hanno123', 'LPR 381');
  INSERT INTO `student_portal`.`register` (`student_id`, `student_name`, `student_address`, `student_email`, `student_password`, `course_name`) VALUES ('3', 'Gideon Rossouw', '8 Bedford Drive', 'gideon@student.ac.za', 'Gideon123', 'SAD 382');
  INSERT INTO `student_portal`.`register` (`student_id`, `student_name`, `student_address`, `student_email`, `student_password`, `course_name`) VALUES ('8', 'Dylan Ellis', '25 Ruben Lane', 'dylan@student.ac.za', 'Dylan123', 'DBD 381');
  INSERT INTO `student_portal`.`register` (`student_id`, `student_name`, `student_address`, `student_email`, `student_password`, `course_name`) VALUES ('6', 'Boikanyo Nkoane', '5 Danie Street', 'boikanyo@student.ac.za', 'Boikanyo123', 'LPR 381');
  INSERT INTO `student_portal`.`register` (`student_id`, `student_name`, `student_address`, `student_email`, `student_password`, `course_name`) VALUES ('7', 'Emile Bouwer', '13 Ave', 'emile@student.ac.za', 'Emile123', 'PRG 381');

  ALTER TABLE `student_portal`.`register` 
  ADD CONSTRAINT `student_id`
  FOREIGN KEY (`student_id`)
  REFERENCES `student_portal`.`student` (`student_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

  SHOW Tables;
  
  SELECT * FROM student_portal.administrator;
  SELECT * FROM student_portal.student;
  SELECT * FROM student_portal.register;