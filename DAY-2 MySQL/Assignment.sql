CREATE DATABASE EmployeeManagement;
use EmployeeManagement;

-- department table

CREATE TABLE Department
(
    DeptID INT PRIMARY KEY,
    DeptName VARCHAR(50),
    Location VARCHAR(50)
);
desc Department;

INSERT INTO Department
VALUES
(101,'HR','Hyderabad'),
(102,'Finance','Mumbai'),
(103,'IT','Bangalore'),
(104,'Sales','Chennai');
SELECT * FROM Department;

-- employee table

CREATE TABLE Employee
(
    EmpID INT PRIMARY KEY,
    EmpName VARCHAR(50),
    Gender VARCHAR(10),
    Age INT,
    Salary DECIMAL(10,2),
    Designation VARCHAR(50),
    DeptID INT,
    HireDate DATE,

    FOREIGN KEY (DeptID)
    REFERENCES Department(DeptID)
);

INSERT INTO Employee VALUES
(1,'Amit','Male',28,45000,'Software Engineer',103,'2022-05-10'),
(2,'Priya','Female',30,55000,'HR Manager',101,'2021-03-15'),
(3,'Rahul','Male',27,50000,'Accountant',102,'2023-01-20'),
(4,'Sneha','Female',25,42000,'Sales Executive',104,'2022-09-12'),
(5,'Kiran','Male',31,60000,'Team Lead',103,'2020-11-18');
select * from Employee;

-- attentance table 

CREATE TABLE Attendance (
   AttendanceID INT PRIMARY KEY,
   EmpID INT,
   AttendanceDate DATE,
   Status VARCHAR(10),
   FOREIGN KEY (EmpID) REFERENCES Employee(EmpID)
);
desc Attendance;

INSERT INTO Attendance VALUES
(1,1,'2026-07-01','Present'),
(2,2,'2026-07-01','Present'),
(3,3,'2026-07-01','Absent'),
(4,4,'2026-07-01','Present'),
(5,5,'2026-07-01','Present');
select * from Attendance;

-- project tasks
-- basic queries 
-- 1. Display all employees

select * from Employee;

-- 2.Employee names and salary

select EmpName, Salary from Employee;

-- 3. Salary greater than 50000

select * from Employee where Salary > 50000;

-- 4. Employees older than 30

select * from employee where age > 30;

-- WHERE Clause
-- 5. Display employees from the IT department

select * from employee where DeptID = 103;

-- 6. Display female employees.

SELECT * FROM Employee where Gender = 'Female';

-- 7. Display employees hired after 2022-01-01

select * from Employee where HireDate > '2022-01-01';

-- ORDER BY
-- 8.

select * from Employee order by Salary desc;

-- 9

SELECT * FROM Employee ORDER BY EmpName;

-- Aggregate Functions
-- 10
select count(*) from Employee;
-- 11
select max(Salary) from Employee;
-- 12
select min(Salary) from Employee;
-- 13
select avg(salary) from Employee;
-- 14
select sum(salary) from Employee;

-- GROUP BY

-- 15
SELECT DeptID, 
COUNT(*) AS TotalEmployees FROM Employee
GROUP BY DeptID;

-- 16
select DeptID, 
avg(salary) as AverageSalary from Employee
group by DeptID;

-- 17
select DeptID,
max(salary) as HighestSalary from Employee
group by DeptID;

-- JOIN Queries
-- 18 

SELECT e.EmpName, d.DeptName
FROM Employee e
INNER JOIN Department d
ON e.DeptID = d.DeptID;

-- 19 

SELECT e.EmpName, d.DeptName, d.Location from Employee e
inner join Department d on e.DeptID = d.DeptID;

-- 20

SELECT e.EmpName, a.AttendanceDate, a.Status FROM Employee e
INNER JOIN Attendance a ON e.EmpID = a.EmpID;

-- UPDATE

UPDATE Employee SET Salary = Salary * 1.10 WHERE DeptID = 103;
SELECT * FROM Employee;

-- 21

UPDATE Employee SET Designation = 'Senior Software Engineer' WHERE EmpID = 1;
SELECT * FROM Employee; 

-- 22

UPDATE Employee SET DeptID = 101 WHERE EmpID = 4;
SELECT * FROM Employee; 

-- DELETE

-- 23

DELETE FROM Employee WHERE Salary < 40000;
SELECT * FROM Employee;

-- 24

SET SQL_SAFE_UPDATES = 0;
DELETE FROM Attendance
WHERE AttendanceDate = '2026-07-01';
SELECT * FROM Employee;

-- Views
-- 25
CREATE VIEW EmployeeDetails AS
SELECT
e.EmpID,
e.EmpName,
d.DeptName,
e.Salary
FROM Employee e

JOIN Department d

ON e.DeptID = d.DeptID;

SELECT * FROM EmployeeDetails;
SHOW FULL TABLES
WHERE Table_type='VIEW';

-- 26

DELIMITER //

CREATE PROCEDURE GetEmployees()

BEGIN

SELECT *
FROM Employee;

END //

DELIMITER ;

CALL GetEmployees();

select * from Employee;