use mydatabase;
CREATE DATABASE mydatabase;
USE mydatabase;
CREATE TABLE employee1 (
    eid INT,
    ename VARCHAR(50),
    esalary INT,
    dno INT
);
select * from employee1;
insert into employee1 values
(101,'raju',15000,10),
(102,'ramesh',20000,20),
(103,'avi',25000,10),
(104,'bunny',26000,20);
select * from employee;

select dno, count(*) as "total no of employee"  from employee group by dno;

select dno, sum(esalary), avg(esalary), min(esalary), max(esalary) from employee1 group by dno;

select dno, sum(esalary), avg(esalary), min(esalary), max(esalary) from employee1 group by dno having min(esalary) > 10000;

select dno, sum(esalary), avg(esalary), min(esalary), max(esalary) from employee1 group by dno order by dno desc;
select * from employee1 order by eid;

create table dept (
dno int,
dname varchar(50)
);
insert into dept values
(10,'developing'),
(20,'testing');
select * from dept;
select dname from dept where dno = 
(select  dno from  employee1 where eid=101);

select * from employee1 where dno =
(select dno from dept where dname = 'testing');

select dname from dept where dno = 
(select dno from employee1 where ename = 'raju'); 

select dname from dept where dno in
(select dno from employee1 where eid = 101 or eid = 102); 

drop table employee1;

-- constraints 

CREATE TABLE employee1 (
    eid INT primary key,
    ename VARCHAR(50) not null,
    esalary INT check(esalary >0),
    email varchar(50) unique,
    dno INT
);

-- constraint violation

insert into employee1 values
(101,'ramesh',10000,'ramesgh123',10),
(101,'raju',20000,'raj1233',20);

drop table employee1;
drop table dept;

create table dept (
dno int primary key, 
dname varchar(50)
);
drop table employee1;
CREATE TABLE employee1 (
    eid INT primary key,
    ename VARCHAR(50) ,
    esalary INT ,
    dno INT 
);

insert into employee1 values
(101,'ramesh',10000,10);

-- procedure

delimiter //
create procedure insertEmployee(in eid int, in ename varchar(20), in esalary int, in dno int)
begin
   insert into employee1 (eid, ename, esalary, dno)
   values(eid, ename, esalary, dno);
end //

CALL insertEmployee(102,'bunny',12000,10);

select * from employee1;

DELIMITER //

CREATE PROCEDURE getEmployeeName(
    IN empid INT,
    OUT empname VARCHAR(50)
)
BEGIN
    SELECT ename
    INTO empname
    FROM employee1
    WHERE eid = empid;
END //

DELIMITER ;

call getEmployeeName(103, @empname);
select @empname;

call insertEmployee(104,'raj',1000,20);
call insertEmployee(103,'varshith',2000,10);

drop procedure insertEmployee;
drop table employee1;

-- FUNCTIONS

DELIMITER //
create function getEName(empid int ) returns varchar(30) deterministic
begin
    declare empname varchar(30);
    select ename into empname from employee1 where eid = empid;
    return empname;
end //
DELIMITER ;

select getEName(103);

CREATE TABLE Department
(
    dno INT PRIMARY KEY,
    dname VARCHAR(30)
);

INSERT INTO Department
VALUES
(10,'HR'),
(20,'IT'),
(30,'Finance'),
(40,'Sales');
select * from department;

CREATE TABLE Employee
(
    eid INT PRIMARY KEY,
    ename VARCHAR(30),
    salary INT,
    dno INT,
    FOREIGN KEY(dno)
    REFERENCES Department(dno)
);
drop table employee;

INSERT INTO Employee
VALUES
(101,'Ram',30000,10),
(102,'Raj',50000,20),
(103,'Ravi',45000,20),
(104,'Anu',35000,30),
(105,'Priya',40000,NULL);

select * from employee;

-- joins
-- equi join

SELECT
Employee.eid,
Employee.ename,
Department.dname
FROM Employee
JOIN Department
ON Employee.dno = Department.dno;

-- non equi join

SELECT e.eid,
       e.ename,
       e.salary,
       d.dname
FROM Employee e
INNER JOIN Department d
ON e.dno <> d.dno;

-- outer joins
-- left outer join
SELECT e.eid,
       e.ename,
       e.salary,
       d.dname
FROM Employee e
LEFT JOIN Department d
ON e.dno = d.dno;

select * from department d left outer join employee e on d.dno = e.dno;

-- right outer join

SELECT e.eid,
       e.ename,
       e.salary,
       d.dname
FROM Employee e
right JOIN Department d
ON e.dno = d.dno;

select * from department d right outer join employee e on d.dno = e.dno;
 

-- full join 

select * from department d left outer join employee e on d.dno = e.dno
union
select * from department d right outer join employee e on d.dno = e.dno;

-- cross join

SELECT
e.eid,
e.ename,
d.dno,
d.dname
FROM Employee e
CROSS JOIN Department d;

