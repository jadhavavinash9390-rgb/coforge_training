CREATE DATABASE CollegeDB;
USE CollegeDB;

CREATE TABLE employee
( eid int,
  ename varchar(50),
  esalary int
  );
  desc employee;
  select * from employee;
 INSERT INTO employee
VALUES (101, 'ram', 10000);

INSERT INTO employee
VALUES (102, 'raj', 20000);

insert into employee values (
103, null, 13000 );

insert into employee (eid, esalary) values (104, 12000);

select eid, esalary from employee;

select eid, ename from employee where ename is  null;

select eid, ename from employee where ename is not null;

select * from employee where eid in (101, 103);

select * from employee where eid not in (101, 103);


select * from employee where esalary between 10000 and 13000 ;

select * from employee where esalary between 13000 and 10000 ;

select * from employee where esalary not between 10000 and 13000 ;

select * from employee where ename like 'r%';

select * from employee where ename like '_a%';

select * from employee where ename like '%r%';

set sql_safe_updates = 0;

update employee set esalary = 0 where eid = 101;

select * from employee;

delete from employee where ename is null;
rollback;

select eid, 'avi', 100+200 from employee;

select eid, sysdate(), 'avi', 100+200 from employee;

select eid as "Employee ID", sysdate() as "current date", 'avi', 100+200 as "sum" from employee;

alter table employee add column deptno int;

alter table employee add column depts int;

update employee set depts = 140000 ;
alter table employee drop column deptno;

alter table employee rename column eid to empid;
truncate table employee;

rename table employee to tbl_employee;

drop table tbl_employee;