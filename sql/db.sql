show databases;
drop database if exists db_test;
drop table if exists db_test.student;
create table db_test.student(
  id int auto_increment primary key,#自动增长
  sno varchar(20),
  name varchar(20) unique,
  age int(2)not null,
  gender char(10),
  major varchar(20),
  city varchar(20),
  dob date,
  height double(2,1)
);
DESC db_test.student;#
select*
from db_test.student(son,name,age)

