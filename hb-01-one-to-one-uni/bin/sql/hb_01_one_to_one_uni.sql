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
    -> id int(11) not null auto_increment,
    -> youtube_channel varchar(128) default null,
    -> hobby varchar(45) default null,
    -> primary key (id)
    -> )
    -> auto_increment=1;
