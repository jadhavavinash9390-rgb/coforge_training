/*Assignment 1 */

CREATE TABLE Students
(
    StudentID INT PRIMARY KEY,
    Name VARCHAR(50),
    Age INT,
    Gender VARCHAR(10),
    City VARCHAR(50)
);

/*Assignment -2 */

INSERT INTO Students
VALUES
(101,'Rahul',20,'Male','Hyderabad'),
(102,'Priya',19,'Female','Chennai'),
(103,'Arjun',21,'Male','Bengaluru'),
(104,'Sneha',20,'Female','Mumbai'),
(105,'Kiran',22,'Male','Pune');

select * from Students;
							
/*Assignment -3 */

select * from Students;

SELECT Name, City FROM Students;

SELECT * FROM Students WHERE Age > 20;

SELECT * FROM Students WHERE Gender = 'Female';


/* Assignment-4 */
SELECT * FROM Students order by Name ASC ;

SELECT * FROM Students order by age desc ;


SELECT * FROM Students order by city asc,  name asc;


/*Assignment - 5 */

SELECT * FROM Students where age between 19 and 21;

SELECT * FROM Students where Name like 'R%';

SELECT * FROM Students where Name like '%i';

SELECT * FROM Students where age = 19 or age = 21;
SELECT *FROM Students WHERE Age IN (20,22);

/* Assignment- 6 */
update Students set city = 'delhi' where Name = 'Rahul';

update Students set Age = Age+1 where Name = 'Arjun';

update Students set city = 'Kolkata' where Name = 'Sneha';
select * from Students;

/* Assignment - 7 */

delete from Students where StudentID = 105;

delete from Students where City = 'Chennai';

select * from Students;
