select * from Deposit

insert into Deposit values(109,'MINU','POWAI',7000,'1995-8-10')

create table Branch(
	BNAME varchar(50),
	CITY varchar(50)
	);

select * from Branch

insert into Branch values('POWAI','BOMBAY')

create table Customers(
	CNAME varchar(50),
	CITY varchar(50)
);

select * from Customers

insert into Customers values('NAREN','BOMBAY')

use CSE_3A_240

create table Borrow(
	LOANNO int,
	CNAME varchar(50),
	BNAME varchar(50),
	AMOUNT decimal(8,2)
);

insert into Borrow values(375,'KRANTI','NEHRU PLACE',3000)

Select * from Borrow

---------------------------------------------  LAB 4 ---------------------------------------------------------
Select * from Deposit
Select * from DEPOSIT_DETAIL;_

-- 1. Add two more columns City VARCHAR (20) and Pincode INT.
Alter table Deposit add City varchar(20), Pincode int;

-- 2. Change the size of CNAME column from VARCHAR (50) to VARCHAR (35).
Alter table Deposit Alter column CNAME varchar(35);

-- 3. Change the data type DECIMAL to INT in amount Column.
Alter table Deposit Alter column AMOUNT int;

-- 4. Rename Column ActNo to ANO.
EXEC sp_rename 'Deposit.ACTNO','ANO';

-- 5. Delete Column City from the DEPOSIT table.
Alter table Deposit drop column City;

-- 6. Change name of table DEPOSIT to DEPOSIT_DETAIL.
Exec sp_rename Deposit, DEPOSIT_DETAIL;

---------------------------------------------------------- PART - B ------------------------------------------------------------------------------------
Select * from Deposit;
Select * from DEPOSIT_DETAIL;

-- 1. Rename Column ADATE to AOPENDATE OF DEPOSIT_DETAIL table.
Exec sp_rename 'DEPOSIT_DETAIL.ADATE','AOPENDATE';

-- 2. Delete Column AOPENDATE from the DEPOSIT_DETAIL table.
Alter table DEPOSIT_DETAIL drop column AOPENDATE;

-- 3. Rename Column CNAME to CustomerName.
Exec sp_rename 'DEPOSIT_DETAIL.CNAME','CustomerName';

-- make pincode to some value (other than null)
Alter table DEPOSIT_DETAIL drop column pincode;
Alter table DEPOSIT_DETAIL add Pincode int not null identity(361142,5);

-- DELETE, Truncate, Drop Operation
----------------------------------------------------------- PART-A -------------------------------------------------------------------------------------
Select * from DEPOSIT_DETAIL;

-- 1. Delete all the records of DEPOSIT_DETAIL table having amount greater than and equals to 4000.
Delete from DEPOSIT_DETAIL where AMOUNT > = 4000;

-- 2. Delete all the accounts CHANDI BRANCH.
Delete from DEPOSIT_DETAIL where BNAME = 'CHANDI';

-- 3. Delete all the accounts having account number (ANO) is greater than 105.
Delete from DEpOSIT_DETAIL where ANO > 105;

-- 4. Delete all the records of Deposit_Detail table. (Use Truncate)
Truncate table DEPOSIT_DETAIL;

-- 5. Remove Deposit_Detail table. (Use Drop)
Drop table DEPOSIT_DETAIL;


--------------------------------------------- PART-B ---------------------------------------------------------------------------------------------------

Create table EMPLOYEE_MASTER(
EmpNo INT,
EmpName VARCHAR(25),
JoiningDate DATETIME,
Salary DECIMAL (8,2),
City VARCHAR(20)
);

INSERT INTO EMPLOYEE_MASTER VALUES 
(101,'Keyur','2002-1-5',12000.00 ,'Rajkot'),
(102,'Hardik','2004-2-15',14000.00,'Ahmedabad'),
(103,'Kajal','2006-3-14',15000.00,'Baroda'),
(104,'Bhoomi','2005-6-23',12500.00,'Ahmedabad'),
(105,'Harmit','2004-2-15',14000.00,'Rajkot'),
(106,'Mitesh','2001-9-25',5000.00,'Jamnagar'),
(107,'Meera',Null,7000.00,'Morbi'),
(108,'Kishan','2003-2-6',10000.00,NULL);

Select * from EMPLOYEE_MASTER

-- 1. Delete all the records of Employee_MASTER table having salary greater than and equals to 14000.
Delete from EMPLOYEE_MASTER where Salary > = 14000;

-- 2. Delete all the Employees who belongs to ‘RAJKOT’ city.
Delete from EMPLOYEE_MASTER where City = 'Rajkot';

-- 3. Delete all the Employees who joined after 1-1-2007.
Delete from EMPLOYEE_MASTER where JoiningDate > '2007-1-1';

-- 4. Delete the records of Employees whose joining date is null and Name is not null.
Delete from EMPLOYEE_MASTER where JoiningDate is null And EmpName is not null ; 

-- 5. Delete the records of Employees whose salary is 50% of 20000.
Delete from EMPLOYEE_MASTER where Salary = (0.5*20000);

-- 6. Delete the records of Employees whose City Name is not empty.
Delete from EMPLOYEE_MASTER where City is not null;

-- 7. Delete all the records of Employee_MASTER table. (Use Truncate)
Truncate table EMPLOYEE_MASTER;

-- 8. Remove Employee_MASTER table. (Use Drop)
DROP table EMPLOYEE_MASTER;

-------------------------------------------------------------LAB-5--------------------------------------------------------------------------------------

Create table STUDENT(
StuID INT,
FirstName VARCHAR(25),
LastName VARCHAR(25),
Website VARCHAR(50),
City VARCHAR(25),
Address VARCHAR(100)
);

Insert into STUDENT values 
(1011,'Keyur','Patel','techonthenet.com','Rajkot','A-303 ''Vasant Kunj'', Rajkot'),
(1022,'Hardik','Shah','digminecraft.com','Ahmedabad','"Ram Krupa", Raiya Road'),
(1033,'Kajal','Trivedi','bigactivities.com','Baroda','Raj bhavan plot, near garden'),
(1044,'Bhoomi','Gajera','checkyourmath.com','Ahmedabad','"Jig’s Home", Narol'),
(1055,'Harmit','Mitel','@me.darshan.com','Rajkot','B-55, Raj Residency'),
(1066,'Ashok','Jani',null,'Baroda','A502, Club House Building');

-------------------------------------------------------------PART-A-------------------------------------------------------------------------------------

Select * from STUDENT;

--1. Display the name of students whose name starts with ‘k’.
select FirstName from STUDENT where Firstname like 'k%';

--2. Display the name of students whose name consists of five characters.
select FirstName from STUDENT where FirstName like '_____';

--3. Retrieve the first name & last name of students whose city name ends with a & contains six characters.
select FirstName,LastName from STUDENT where City like '_____a';

--4. Display all the students whose last name ends with ‘tel’.
select * from STUDENT where LastName like '%tel';

--5. Display all the students whose first name starts with ‘ha’ & ends with‘t’.
select * from STUDENT where FirstName like 'ha%t';

--6. Display all the students whose first name starts with ‘k’ and third character is ‘y’.
select * from STUDENT where FirstName like 'k_y%';

--7. Display the name of students having no website and name consists of five characters.
select FirstName from STUDENT where Website is null AND Firstname like '_____';

--8. Display all the students whose last name consist of ‘jer’.
select * from STUDENT where LastName like '%jer%';

--9. Display all the students whose city name starts with either ‘r’ or ‘b’.
select * from STUDENT where City like '[r,b]%';

--10. Display all the name students having websites.
select * from STUDENT where Website is not null;

--11. Display all the students whose name starts from alphabet A to H.
select * from STUDENT where FirstName like '[A-H]%';

--12. Display all the students whose name’s second character is vowel.
select * from STUDENT where FirstName like '_[aeiou]%';

--13. Display the name of students having no website and name consists of minimum five characters.
select * from STUDENT where Website is null AND FirstName like '_____%';

--14. Display all the students whose last name starts with ‘Pat’.
select * from STUDENT where LastName like 'Pat%';

--15. Display all the students whose city name does not starts with ‘b’.
select * from STUDENT where City not like 'b%';

---------------PART-B

-- 1. Display all the students whose name starts from alphabet A or H.
select * from STUDENT where FirstName like '[AH]%';

-- 2. Display all the students whose name’s second character is vowel and of and start with H.
select * from STUDENT where FirstName like 'H[aeiou]%';

-- 3. Display all the students whose last name does not ends with ‘a’.
select * from STUDENT where LastName not like '%a';

-- 4. Display all the students whose first name starts with consonant.
select * from STUDENT where FirstName not like '[aeiou]%';

-- 5. Display all the students whose website contains .net
select * from STUDENT where Website like '%.net';

--------Part–C:
-- 1. Display all the students whose address consist of -.
select * from STUDENT where Address like '%-%';

-- 2. Display all the students whose address contains single quote or double quote.
select * from STUDENT where Address like '[''"]%';

-- 3. Display all the students whose website contains @.
select * from STUDENT where Website like '%@%';

-- 4. Display all the names those are either four or five characters.
select * from STUDENT where FirstName like '____' OR FirstName like '_____';

----------------------------------------------------------- LAB-7 ------------------------------------------------------------------------
drop table EMP;

create table EMP(
	EID int,
	ENAME varchar(50),
	Department varchar(50),
	Salary int,
	JoiningDate date,
	City varchar(50)
);

insert into EMP values
	(101 ,'Rahul', 'Admin' ,56000, '1-Jan-90' ,'Rajkot'),
	(102 ,'Hardik', 'IT', 18000 ,'25-Sep-90' ,'Ahmedabad'),
	(103 ,'Bhavin' ,'HR' ,25000 ,'14-May-91' ,'Baroda'),
	(104 ,'Bhoomi' ,'Admin' ,39000 ,'8-Feb-91' ,'Rajkot'),
	(105, 'Rohit', 'IT' ,17000, '23-Jul-90' ,'Jamnagar'),
	(106 ,'Priya', 'IT' ,9000 ,'18-Oct-90' ,'Ahmedabad'),
	(107 ,'Bhoomi' ,'HR' ,34000 ,'25-Dec-91' ,'Rajkot');

Select * from EMP;

----------------- PART-A

-- 1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.
Select Max(Salary)as Maximum,MIN(Salary) as Minimum from EMP;

-- 2. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal, respectively.
select SUM(Salary) as Total_sal, AVG(Salary) as Average_sal from EMP;

-- 3. Find total number of employees of EMPLOYEE table.
Select COUNT(EID) from EMP;

-- 4. Find highest salary from Rajkot city.
Select MAX(Salary) from EMP where City = 'Rajkot';

-- 5. Give maximum salary from IT department.
Select MAX(Salary) from EMP where Department = 'IT';

-- 6. Count employee whose joining date is after 8-feb-91.
select Count(EID) from EMP where JoiningDate = '8-feb-91';

-- 7. Display average salary of Admin department.
select AVG(Salary) from EMP where Department = 'Admin';

-- 8. Display total salary of HR department.
select SUM(Salary) from EMP where Department = 'HR';

-- 9. Count total number of cities of employee without duplication.
Select Count(DISTINCT City) from EMP;

-- 10. Count unique departments.
select Count(Distinct Department) from EMP;

-- 11. Give minimum salary of employee who belongs to Ahmedabad.
select MIN(Salary) from EMP where City = 'Ahmedabad';

-- 12. Find city wise highest salary.
select MAX(Salary) from EMP Group by City;

-- 13. Find department wise lowest salary.
select MIN(Salary) from EMP Group by Department;

-- 14. Display city with the total number of employees belonging to each city.
select COUNT(EID) from EMP Group by City;

-- 15. Give total salary of each department of EMP table.
select SUM(Salary) from EMP Group by Department;

-- 16. Give average salary of each department of EMP table without displaying the respective department name.
Select AVG(Salary) from EMP Group by Department;

------------------- Part-B

-- 1. Count the number of employees living in Rajkot.
select COUNT(EID) from EMP where City = 'rajkot';

-- 2. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.
select (Max(Salary)-MIN(Salary)) as DIFFERENCE from EMP; 

-- 3. Display the total number of employees hired before 1st January, 1991.
Select Count(EID) from EMP where JoiningDate < '1991-1-1';

--------------- PART- C

-- 1. Count the number of employees living in Rajkot or Baroda.
Select Count(EID) from EMP where City = 'Rajkot' OR City = 'Baroda';

-- 2. Display the total number of employees hired before 1st January, 1991 in IT department.
Select Count(EID) from EMP where JoiningDate < '1991-1-1' AND Department = 'IT' Group by Department;

-- 3. Find the Joining Date wise Total Salaries.
Select SUM(Salary),JoiningDate from EMP Group by JoiningDate order by JoiningDate;

-- 4. Find the Maximum salary department & city wise in which city name starts with ‘R’.
Select MAX(Salary),Department,City from EMP where City like 'R%' Group by Department,City;