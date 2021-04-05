create table instructor (
id int(11) not null auto_increment,
first_name varchar(45) default null,
last_name varchar(45) default null,
email varchar(45) default null,
instructor_detail_id int(11) default null,
primary key (id),
key FK_DETAIL_idx (instructor_detail_id),
constraint FK_DETAIL foreign key (instructor_detail_id) 
references instructor_detail (id)
on delete no action on update no action
)
auto_increment=1;

CREATE TABLE instructor_detail (
id int(11) not null auto_increment,
youtube_channel varchar(128) default null,
hobby varchar(45) default null,
primary key (id)
)
auto_increment=1;


create table course(
id int(11) not null auto increment,
title varchar(128) default null,
instructor_id int(11) default null,

primary key (id),

unique key TITLE_UNIQUE (title),

key FK_INSTRUCTOR_idx (instructor_id),

constraint FK_INSTRUCTOR foreign key (instructor_id) references instructor (id)

on delete no action no update no action
)
auto_increment=10;


CREATE TABLE `review` (
  `id` int NOT NULL AUTO_INCREMENT,
  `comment` varchar(256) DEFAULT NULL,
  `course_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_COURSE_ID_idx` (`course_id`),
  CONSTRAINT `FK_COURSE` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


create table student(
	id int not null auto_increment,
	first_name varchar(45) default null,
	last_name varchar(45) default null,
	email varchar(45) default null,
	primary key (id)
) auto_increment=1;


create table course_student(
		
	course_id int(11) not null,
	student_id int(11)	not null,
	
	primary key (course_id,student_id),
	
	key FK_STUDENT_idx (student_id),
	
	constraint FK_COURSE_05 FOREIGN KEY (course_id) references course (id)
	on delete no action on update no action,
	
	constraint FK_STUDENT FOREIGN KEY (student_id) references student (id)
	on delete no action on update no action
)
	



