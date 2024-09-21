create database CSE_3A_240

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


-----------------------------------------------------LAB-8--------------------------------------------------------------------------------
use CSE_3A_240

create table SALES_DATA(
	Region varchar(20),
	Product varchar(20),
	Sales_Amount int,
	Year int
);

insert into SALES_DATA values('North America', 'Watch' ,1500 ,2023),
('Europe' ,'Mobile' ,1200 ,2023),
('Asia' ,'Watch', 1800 ,2023),
('North America', 'TV', 900, 2024),
('Europe', 'Watch', 2000, 2024),
('Asia' ,'Mobile', 1000, 2024),
('North America' ,'Mobile' ,1600, 2023),
('Europe' ,'TV' ,1500, 2023),
('Asia', 'TV', 1100 ,2024),
('North America', 'Watch', 1700, 2024);

select * from SALES_DATA;


------------PART-A

--1. Display Total Sales Amount by Region.
select sum(Sales_Amount),Region
from SALES_DATA
group by Region; 

--2. Display Average Sales Amount by Product
select avg(Sales_Amount),Product
from SALES_DATA
group by Product;

--3. Display Maximum Sales Amount by Year
select max(Sales_Amount),Year 
from SALES_DATA
group by Year;

--4. Display Minimum Sales Amount by Region and Year
select min(Sales_Amount),Region,Year
from SALES_DATA
group by Region,Year;

--5. Count of Products Sold by Region
select count(Product) 
from SALES_DATA
group by Region;

--6. Display Sales Amount by Year and Product
select Sales_Amount,Product,Year
from SALES_DATA
group by Sales_Amount,Product,Year;

--7. Display Regions with Total Sales Greater Than 5000
select Region,sum(Sales_Amount)
from SALES_DATA
group by Region
having sum(Sales_Amount) > 5000;

--8. Display Products with Average Sales Less Than 10000
select Product,avg(Sales_Amount)
from SALES_DATA
group by Product
having avg(Sales_Amount) < 10000;

--9. Display Years with Maximum Sales Exceeding 500
select Year,max(Sales_Amount)
from SALES_DATA
group by Year
having max(Sales_Amount) > 500;

--10. Display Regions with at Least 3 Distinct Products Sold.
select Region,count(DISTINCT Product)
from SALES_DATA
group by Region
having count(DISTINCT Product) >= 3;

--11. Display Years with Minimum Sales Less Than 1000
select Year,min(Sales_Amount)
from SALES_DATA
group by Year
having min(Sales_Amount) < 1000;

--12. Display Total Sales Amount by Region for Year 2023, Sorted by Total Amountselect sum(Sales_Amount),Region from SALES_DATAwhere Year = 2023group by Regionorder by sum(Sales_Amount);--------------PART-B--1. Display Count of Orders by Year and Region, Sorted by Year and Region
select count(Product),Year,Region
from SALES_DATA
group by Year,Region
order by Year,Region;

--2. Display Regions with Maximum Sales Amount Exceeding 1000 in Any Year, Sorted by Region
select Region,max(Sales_Amount),Year
from SALES_DATA
group by Region,Year
having max(Sales_Amount) > 1000
order by Region;

--3. Display Years with Total Sales Amount Less Than 1000, Sorted by Year Descending
select sum(Sales_Amount),Year
from SALES_DATA
group by Year
having sum(Sales_Amount) < 1000
order by Year Desc;

--4. Display Top 3 Regions by Total Sales Amount in Year 2024

select Top 3 Region,sum(Sales_Amount),Year
from SALES_DATA
where Year = 2024
group by Region,Year
order by sum(Sales_Amount) desc;

--------------PART-C

--1. Display Products with Average Sales Amount Between 1000 and 2000, Ordered by Product Name
select Product,avg(Sales_Amount)
from SALES_DATA
group by Product
having avg(Sales_Amount) between 1000 and 2000
order by Product;

--2. Display Years with More Than 5 Orders from Each Region
select Year,Region
from SALES_DATA
group by Region,Year
having COUNT(Product) > 5;

--3. Display Regions with Average Sales Amount Above 1500 in Year 2023 sort by amount in descending.
select Region,avg(Sales_Amount) as avgamount
from SALES_DATA
where Year = 2023
group by Region
having avg(Sales_Amount) > 1500
order by avgamount desc;

--4. Find out region wise duplicate product.
select count(Product),Region,Product
from SALES_DATA
group by Region,Product
having COUNT(Product) > 1;

--5. Find out region wise highest sales amount.
select Region,max(Sales_Amount) as Maxvalue
from SALES_DATA
group by Region;


---------------------------------------------------LAB-6---------------------------------------------------------------------
use CSE_3A_240;
----MATH FUNCTION

----Part-A
--1. Display the result of 5 multiply by 30.
select 5 * 30 as Result;

--2. Find out the absolute value of -25, 25, -50 and 50.
select abs(-25),abs(25),abs(-50),abs(50) as Absolute;

--3. Find smallest integer value that is greater than or equal to 25.2, 25.7 and -25.2.
select FLOOR(25.2),FLOOR(25.7),FLOOR(-25.2) as small_integer;

--4. Find largest integer value that is smaller than or equal to 25.2, 25.7 and -25.2.
select Ceiling(25.2),ceiling(25.7),ceiling(-25.2) as small_integer;

--5. Find out remainder of 5 divided 2 and 5 divided by 3.
select 5 % 2 as remainder, 5 % 3 as remainder1;

--6. Find out value of 3 raised to 2nd power and 4 raised 3rd power.
select power(3,2) as power1, power(4,3) as power2;

--7. Find out the square root of 25, 30 and 50.
select sqrt(25),sqrt(30),sqrt(50);

--8. Find out the square of 5, 15, and 25.
select SQUARE(5),SQUARE(15),SQUARE(25);

--9. Find out the value of PI.
select PI();

--10. Find out round value of 157.732 for 2, 0 and -2 decimal points.
select ROUND(157.732,2),ROUND(157.732,0),ROUND(157.732,-2);

--11. Find out exponential value of 2 and 3.
select exp(2),exp(3);

--12. Find out logarithm having base e of 10 and 2.
select log(10),log(2);

--13. Find out logarithm having base b having value 10 of 5 and 100.
select LOG10(5),log10(100);

--14. Find sine, cosine and tangent of 3.1415.
select sin(3.1415),cos(3.1415),tan(3.1415);

--15. Find sign of -25, 0 and 25.
select sign(-25),sign(0),sign(25);

--16. Generate random number using function.
select RAND();
--------PART-B

create table EMP_MASTER(
	Empno int,
	EmpName varchar(20),
	JoiningDate date,
	Salary decimal(8,2),
	Commission int,
	City varchar(15),
	Dept_Code varchar(10)
);

insert into EMP_MASTER values
(101, 'Keyur', '2002-1-5', 12000.00, 4500, 'Rajkot', '3@g'),
(102, 'Hardik', '2004-2-15' ,14000.00, 2500 ,'Ahmedabad','3@'),
(103, 'Kajal' ,'2006-3-14', 15000.00, 3000 ,'Baroda', '3-GD'),
(104, 'Bhoomi', '2005-6-23' ,12500.00, 1000 ,'Ahmedabad', '1A3D'),
(105, 'Harmit', '2004-2-15', 14000.00 ,2000 ,'Rajkot', '312A');

select * from EMP_MASTER;

--1. Display the result of Salary plus Commission.
select (Salary+Commission) as Result from EMP_MASTER;

--2. Find smallest integer value that is greater than or equal to 55.2, 35.7 and -55.2.
select FLOOR(55.2),floor(35.7),floor(-55.2);

--3. Find largest integer value that is smaller than or equal to 55.2, 35.7 and -55.2.
select ceiling(55.2),ceiling(35.7),ceiling(-55.2);

--4. Find out remainder of 55 divided 2 and 55 divided by 3.
select 55 % 2 as remainder1, 55 % 3 as remainder2;

--5. Find out value of 23 raised to 2nd power and 14 raised 3rd power.select power(23,2) as power1, power(14,3) as power2;-----PART-C--1. Find out the square root of 36, 49 and 81.
select sqrt(36),sqrt(49),sqrt(81)

--2. Find out the square of 3, 9, and 12.
select SQUARE(3),square(9),SQUARE(12)

--3. Find out round value of 280.8952 for 2, 0 and -2 decimal points.
select round(280.8952,2),round(280.8952,0),round(280.8952,-2)

--4. Find sine, cosine and tangent of 4.2014.
select sin(4.2014), cos(4.2014), tan(4.2014)

--5. Find sign of -55, 0 and 95
select sign(-55),sign(0),sign(95)
--STRING FUNCTION

-----PART-A

--1. Find the length of following. (I) NULL (II) ‘ hello ’ (III) Blank
select len(null),len('hello'),len('Blank')

--2. Display your name in lower & upper case.
select LOWER('OBIto'),UPPER('uchiha');

--3. Display first three characters of your name.
select left('Kalp',3);

--4. Display 3rd to 10th character of your name.
select SUBSTRING('darshan university',3,10);

--5. Write a query to convert ‘abc123efg’ to ‘abcXYZefg’ & ‘abcabcabc’ to ‘ab5ab5ab5’ using REPLACE.
select REPLACE('abc123efg',123,'XYZ'),replace('abcabcabc','c',5);

--6. Write a query to display ASCII code for ‘a’,’A’,’z’,’Z’, 0, 9.
select ASCII('a'),ASCII('A'),ASCII('z'),ASCII('Z'),ASCII(0),ASCII(9)

--7. Write a query to display character based on number 97, 65,122,90,48,57.
select char(97),char(65),char(122),char(90),char(48),Char(57)

--8. Write a query to remove spaces from left of a given string ‘hello world ‘.
select LTRIM('hello world ');

--9. Write a query to remove spaces from right of a given string ‘ hello world ‘.
select rtrim(' hello world ');

--10. Write a query to display first 4 & Last 5 characters of ‘SQL Server’.
select left('SQL Server',4),right('SQL Server',5)

--11. Write a query to convert a string ‘1234.56’ to number (Use cast and convert function).
select CAST('1234.56' as decimal(7,2))

--12. Write a query to convert a float 10.58 to integer (Use cast and convert function).
select CONVERT(int,10.58);

--13. Put 10 space before your name using function.
select SPACE(10)+'Dhairya';

--14. Combine two strings using + sign as well as CONCAT ().
select CONCAT('Dhairya','Dudkiya'),('DHairya'+'dud')

--15. Find reverse of “Darshan”.
select REVERSE('Darshan')

--16. Repeat your name 3 times.
select REPLICATE('Dhairya',3);
--PART-B

--1. Find the length of FirstName and LastName columns.
select len(Firstname),len(LastName) from STUDENT;

--2. Display FirstName and LastName columns in lower & upper case.
select lower(Firstname),upper(Lastname) from Student

--3. Display first three characters of FirstName column.
select left(Firstname,3) from STUDENT

--4. Display 3rd to 10th character of Website column.
select substring(Website,3,10) from STUDENT;

--5. Write a query to display first 4 & Last 5 characters of Website column
select left(Website,4),right(Website,5) from student;

--PART-C

select * from student

--1. Put 10 space before FirstName using function.
select SPACE(10)+Firstname from STUDENT;

--2. Combine FirstName and LastName columns using + sign as well as CONCAT ().
select CONCAT(Firstname,Lastname),(Firstname+Lastname) from STUDENT

--3. Combine all columns using + sign as well as CONCAT ().
-- select StuID+FirstName+LastName+Website+City+Address  from student

--4. Find reverse of FirstName column.
select REVERSE(Firstname) from STUDENT;

--5. Repeat FirstName column 3 times
select replicate(Firstname,3) from student

--6. Give the Names which contains 5 characters.
select FirstName from STUDENT where FirstName like '_____'

--7. Combine the result as <FirstName> Lives in <City>.


--8. Combine the result as Student_ID of < FirstName > is <StuID> .

--Date Function

------PART-A

--1. Write a query to display the current date & time. Label the column Today_Date.
select GETDATE() as Today_date;

--2. Write a query to find new date after 365 day with reference to today.
select dateadd(d,365,getdate());

--3. Display the current date in a format that appears as may 5 1994 12:00AM.
select FORMAT(getdate(),'MMM dd yyyy hh:mm tt')

--4. Display the current date in a format that appears as 03 Jan 1995.
select FORMAT(getdate(),'dd MMM yyyy')

--5. Display the current date in a format that appears as Jan 04, 96.
select FORMAT(getdate(),'MMM dd yy')

--6. Write a query to find out total number of months between 31-Dec-08 and 31-Mar-09.
select DATEDIFF(m,'31-Dec-08','31-Mar-09')

--7. Write a query to find out total number of years between 25-Jan-12 and 14-Sep-10.
select DATEDIFF(y,'31-Dec-08','31-Mar-09')

--8. Write a query to find out total number of hours between 25-Jan-12 7:00 and 26-Jan-12 10:30.
select DATEDIFF(hour,'25-Jan-12 7:00','26-Jan-12 10:30')

--9. Write a query to extract Day, Month, Year from given date 12-May-16.
select DATENAME(day,getdate()),DATENAME(month,getdate()),DATENAME(year,getdate())

--10. Write a query that adds 5 years to current date.
select DATEadd(year,5,getdate())

--11. Write a query to subtract 2 months from current date.
select dateadd(month,-2,getdate())

--12. Extract month from current date using datename () and datepart () function.
select datename(month,getdate()),datepart(MONTH,GETDATE())

--13. Write a query to find out last date of current month.
select EOMONTH(getdate())

--14. Calculate your age in years and months.
select DATEDIFF(month,'27 Jan 2006',getdate())/12,datediff(month,'27 Jan 2006',GETDATE())%12


-----PART-B

create table EMP_DETAIL(
	Empno int,
	EmpName varchar(15),
	JoiningDate date,
	Salary decimal(7,2),
	City varchar(15)
)

insert into EMP_DETAIL values
(101, 'Keyur', '2002-1-15', 12000.00, 'Rajkot'),
(102, 'Hardik', '2004-2-15' ,14000.00,'Ahmedabad'),
(103, 'Kajal' ,'2006-3-14', 15000.00,'Baroda'),
(104, 'Bhoomi', '2005-6-23' ,12500.00,'Ahmedabad'),
(105, 'Harmit', '2004-2-15', 14000.00,'Rajkot'),
(106, 'Jay', '2007-3-12', 12000.00,'Surat');

select * from EMP_DETAIL

--1. Write a query to find new date after 365 day with reference to JoiningDate.
select dateadd(d,365,JoiningDate) from EMP_DETAIL

--2. Display the JoiningDate in a format that appears as may 5 1994 12:00AM.
select format(Joiningdate,'MMM dd yyyy') as date from EMP_DETAIL

--3. Display the JoiningDate in a format that appears as 03 Jan 1995.
select format(Joiningdate,'MMM dd yyyy') as date from EMP_DETAIL

--4. Display the JoiningDate in a format that appears as Jan 04, 96.
select format(Joiningdate,'MMM dd, yy') as date from EMP_DETAIL

--5. Write a query to find out total number of months between JoiningDate and 31-Mar-09.
select datediff(month,Joiningdate,'2009-03-31') from EMP_DETAIL

--6. Write a query to find out total number of years between JoiningDate and 14-Sep-10.
select datediff(year,Joiningdate,'2010-09-14') from EMP_DETAIL

----PART-C

--1. Write a query to extract Day, Month, Year from JoiningDate.
select MONTH(JoiningDate),day(JoiningDate),year(JoiningDate) from EMP_DETAIL

--2. Write a query that adds 5 years to JoiningDate.
select dateadd(year,5,JoiningDate) from EMP_DETAIL	

--3. Write a query to subtract 2 months from JoiningDate.
select dateadd(month,-2,Joiningdate) from EMP_DETAIL

--4. Extract month from JoiningDate using datename () and datepart () function.
select datename(month,Joiningdate),datepart(month,JoiningDate) from EMP_DETAIL

--5. Calculate your age in years and monthsselect DATEDIFF(month,'27 Jan 2006',getdate())/12,datediff(month,'27 Jan 2006',GETDATE())%12--------------------------------------------------------- LAB-10 ----------------------------------------------------------------------------------------------PART-ACREATE TABLE Student_INFO (
    RNo INT,
    Name VARCHAR(50),
    Branch VARCHAR(50),
    SPI DECIMAL(5, 2),
    Bklog INT
);

INSERT INTO Student_INFO (RNo, Name, Branch, SPI, Bklog) VALUES
(101, 'Raju', 'CE', 8.80, 0),
(102, 'Amit', 'CE', 2.20, 3),
(103, 'Sanjay', 'ME', 1.50, 6),
(104, 'Neha', 'EC', 7.65, 1),
(105, 'Meera', 'EE', 5.52, 2),
(106, 'Mahesh', 'EC', 4.50, 3);--1. Create a view Personal with all columns.
create view Personal 
as 
select * from Student_INFO;

--2. Create a view Student_Details having columns Name, Branch & SPI.
create view Student_Details
as
select Name,Branch,SPI from Student_info;

--3. Create a view AcademicData having columns RNo, Name, Branch.
create view AcademicData
as
select RNo,Name,Branch from Student_INFO;

--4. Create a view Student_ bklog having all columns but students whose bklog more than 2.
create view Student_bklog 
as
select * from Student_INFO 
where Bklog > 2;

--5. Create a view Student_Pattern having RNo, Name & Branch columns in which Name consists of four letters.
create view Student_Pattern
as 
select RNo,Name,Branch from Student_INFO
where Name like '____';

--6. Insert a new record to AcademicData view. (107, Meet, ME)
insert into AcademicData 
values(107,'Meet','ME')

--7. Update the branch of Amit from CE to ME in Student_Details view.
Update Student_Details
set Branch = 'ME'
where Name = 'Amit'

--8. Delete a student whose roll number is 104 from AcademicData view.
delete from AcademicData where RNo = 104;

--------PART-B

--1. Create a view that displays information of all students whose SPI is above 8.5
create view Student_spi 
as 
select * from Student_INFO
where SPI > 8.5;

--2. Create a view that displays 0 backlog students.
create view back
as
select * from Student_INFO
where Bklog = 0;

--3. Create a view Computerview that displays CE branch data only.create view Computerview asselect * from Student_INFOwhere Branch = 'CE';--------PART-C
--1. Create a view Result_EC that displays the name and SPI of students with SPI less than 5 of branch EC.
create view Result_EC 
as
select Name,SPI from Student_INFO
where SPI < 5 AND Branch = 'EC';

--2. Update the result of student MAHESH to 4.90 in Result_EC view.
update Result_EC 
set SPI = 4.9 
where Name = 'Mahesh';

--3. Create a view Stu_Bklog with RNo, Name and Bklog columns in which name starts with ‘M’ and having bklogs more than 5.
create view Stu_Bklog
as
select RNo,Name,Bklog from Student_INFO
where Name like 'M%' AND Bklog > 5;

--4. Drop Computerview form the database.delete Computerview from Student_INFO;------------------------------------------------------ LAB-11 -----------------------------------------------------------------------------------------CREATE TABLE Stu_Info (
    Rno INT ,
    Name VARCHAR(50),
    Branch VARCHAR(50)
);

INSERT INTO Stu_Info (Rno, Name, Branch)
VALUES 
    (101, 'Raju', 'CE'),
    (102, 'Amit', 'CE'),
    (103, 'Sanjay', 'ME'),
    (104, 'Neha', 'EC'),
    (105, 'Meera', 'EE'),
    (106, 'Mahesh', 'ME');

CREATE TABLE Result (
	RNO INT,
    SPI DECIMAL(4, 2),
	);

INSERT INTO Result (Rno, SPI)
VALUES 
    (101, 8.8),
    (102, 9.2),
    (103, 7.6),
    (104, 8.2),
    (105, 7.0),
    (107, 8.9);  

CREATE TABLE EMPLOYEE_MASTER1 (
    EmployeeNo VARCHAR(50) ,
    Name VARCHAR(50),
    ManagerNo VARCHAR(50)
);

INSERT INTO EMPLOYEE_MASTER1(EmployeeNo, Name, ManagerNo)
VALUES 
    ('E01', 'Tarun', NULL),
    ('E02', 'Rohan', 'E02'),
    ('E03', 'Priya', 'E01'),
    ('E04', 'Milan', 'E03'),
    ('E05', 'Jay', 'E01'),
    ('E06', 'Anjana', 'E04');

select * from Stu_Info
select * from Result
select * from EMPLOYEE_MASTER1

----------------- PART-A

--1. Combine information from student and result table using cross join or Cartesian product.
select * from Stu_Info,result;

--2. Perform inner join on Student and Result tables.
select * from Stu_Info 
join Result 
on Stu_Info.Rno = Result.Rno

--3. Perform the left outer join on Student and Result tables.
select * from Stu_Info 
left outer join Result 
on Stu_Info.Rno = Result.RNO

--4. Perform the right outer join on Student and Result tables.
select * from Stu_Info 
right outer join Result 
on Stu_Info.Rno = Result.RNO

--5. Perform the full outer join on Student and Result tables.
select * from Stu_Info 
full outer join Result
on Stu_Info.Rno = Result.RNO

--6. Display Rno, Name, Branch and SPI of all students.
select stu_Info.Rno,Name,Branch,SPI 
from Stu_Info join Result 
on Stu_Info.Rno = Result.RNO

--7. Display Rno, Name, Branch and SPI of CE branch’s student only.
select stu_Info.Rno,Name,Branch,SPI 
from Stu_Info join Result 
on Stu_Info.Rno = Result.RNO 
where Stu_Info.Branch = 'CE'

--8. Display Rno, Name, Branch and SPI of other than EC branch’s student only.
select stu_Info.Rno,Name,Branch,SPI 
from Stu_Info join Result 
on Stu_Info.Rno = Result.RNO 
where Stu_Info.Branch = 'EC'

--9. Display average result of each branch.
select AVG(Result.SPI) 
from Stu_Info join Result 
on Stu_Info.Rno = Result.RNO

--10. Display average result of CE and ME branch
select AVG(Result.SPI) 
from Stu_Info join Result 
on Stu_Info.Rno = Result.RNO 
where Stu_Info.Branch in ('CE','ME')

--------------Part – B:

--1. Display average result of each branch and sort them in ascending order by SPI.
select Stu_Info.Branch,AVG(Result.spi) 
as average_spi from Stu_Info join Result 
on Stu_Info.Rno = Result.RNO 
group by Stu_Info.Branch 
order by average_spi

--2. Display highest SPI from each branch and sort them in descending order.
select Stu_Info.Branch,MAX(Result.spi) 
as Max_spi from Stu_Info join Result 
on Stu_Info.Rno = Result.RNO 
group by Stu_Info.Branch 
order by Max_spi desc

--------------Part – C:

--1. Retrieve the names of employee along with their manager’s name from the Employee table.select e.Name as employeename,m.Name as employeemanager from EMPLOYEE_MASTER1 as e join EMPLOYEE_MASTER1 as mon e.ManagerNo = m.EmployeeNo;------------------------------------------------------------- LAB-12 ----------------------------------------------------------------------------------CREATE TABLE Dept (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(100) NOT NULL UNIQUE,
    DepartmentCode VARCHAR(50) NOT NULL UNIQUE,
    Location VARCHAR(50) NOT NULL
);

CREATE TABLE Person (
    PersonID INT PRIMARY KEY,
    PersonName VARCHAR(100) NOT NULL,
    DepartmentID INT NULL,
    Salary DECIMAL(8, 2) NOT NULL,
    JoiningDate DATETIME NOT NULL,
    City VARCHAR(100) NOT NULL,
    FOREIGN KEY (DepartmentID) REFERENCES Dept(DepartmentID)
);

INSERT INTO Dept (DepartmentID, DepartmentName, DepartmentCode, Location) VALUES
(1, 'Admin', 'Adm', 'A-Block'),
(2, 'Computer', 'CE', 'C-Block'),
(3, 'Civil', 'CI', 'G-Block'),
(4, 'Electrical', 'EE', 'E-Block'),
(5, 'Mechanical', 'ME', 'B-Block');

INSERT INTO Person (PersonID, PersonName, DepartmentID, Salary, JoiningDate, City) VALUES
(101, 'Rahul Tripathi', 2, 56000, '2000-01-01', 'Rajkot'),
(102, 'Hardik Pandya', 3, 18000, '2001-09-25', 'Ahmedabad'),
(103, 'Bhavin Kanani', 4, 25000, '2000-05-14', 'Baroda'),
(104, 'Bhoomi Vaishnav', 1, 39000, '2005-02-08', 'Rajkot'),
(105, 'Rohit Topiya', 2, 17000, '2001-07-23', 'Jamnagar'),
(106, 'Priya Menpara', NULL, 9000, '2000-10-18', 'Ahmedabad'),
(107, 'Neha Sharma', 2, 34000, '2002-12-25', 'Rajkot'),
(108, 'Nayan Goswami', 3, 25000, '2001-07-01', 'Rajkot'),
(109, 'Mehul Bhundiya', 4, 13500, '2005-01-09', 'Baroda'),
(110, 'Mohit Maru', 5, 14000, '2000-05-25', 'Jamnagar');

---------Part – A:

select * from Person

--1. Find all persons with their department name & code.
select person.PersonName,dept.DepartmentName,Dept.DepartmentCode from person join dept on person.DepartmentID = dept.DepartmentID

--2. Find the person's name whose department is in C-Block.
select person.PersonName,dept.Location from person join dept on person.DepartmentID = dept.DepartmentID where dept.Location = 'C-Block'

--3. Retrieve person name, salary & department name who belongs to Jamnagar city.
select person.PersonName,Person.Salary,dept.DepartmentName from Person join Dept on person.DepartmentID = dept.DepartmentID

--4. Retrieve person name, salary & department name who does not belong to Rajkot city.
select person.PersonName,Person.Salary,dept.DepartmentName from Person join Dept on person.DepartmentID = dept.DepartmentID where person.City != 'Rajkot'

--5. Retrieve person’s name of the person who joined the Civil department after 1-Aug-2001.
select person.PersonName from Person join dept on person.DepartmentID = dept.DepartmentID where dept.DepartmentName = 'Civil' AND person.JoiningDate > '2001-8-1'

--6. Find details of all persons who belong to the computer department.
select Person.* from Person join dept on person.DepartmentID = dept.DepartmentID where dept.DepartmentName = 'Computer';

--7. Display all the person's name with the department whose joining date difference with the current date is more than 365 days.
SELECT P.PersonName, D.DepartmentName
FROM PERSON P
JOIN DEPT D ON P.DepartmentID = D.DepartmentID
WHERE DATEDIFF(DAY, P.JoiningDate, GETDATE()) > 365;

-- 8. Find department wise person counts.
SELECT D.DepartmentName, COUNT(P.PersonID) AS PersonCount
FROM PERSON P
JOIN DEPT D ON P.DepartmentID = D.DepartmentID
GROUP BY D.DepartmentName;

-- 9. Give department wise maximum & minimum salary with department name.
SELECT D.DepartmentName, 
       MAX(P.Salary) AS MaxSalary, 
       MIN(P.Salary) AS MinSalary
FROM PERSON P
JOIN DEPT D ON P.DepartmentID = D.DepartmentID
GROUP BY D.DepartmentName;

-- 10. Find city wise total, average, maximum and minimum salary.
SELECT P.City, 
       SUM(P.Salary) AS TotalSalary, 
       AVG(P.Salary) AS AverageSalary, 
       MAX(P.Salary) AS MaxSalary, 
       MIN(P.Salary) AS MinSalary
FROM PERSON P
GROUP BY P.City;

-- 11. Find the average salary of a person who belongs to Ahmedabad city.
SELECT AVG(P.Salary) AS AverageSalary
FROM PERSON P
WHERE P.City = 'Ahmedabad';

-- 12. Produce Output Like: <PersonName> lives in <City> and works in <DepartmentName> Department.
SELECT CONCAT(P.PersonName, ' lives in ', P.City, ' and works in ', D.DepartmentName, ' Department.') AS PersonDetails
FROM PERSON P
JOIN DEPT D ON P.DepartmentID = D.DepartmentID;

-- Part B 

--1. Produce Output Like: <PersonName> earns <Salary> from <DepartmentName> department monthly. (Insingle column)
Select concat(Person.PersonName,' earns ',Person.Salary,' from ',dept.DepartmentName,' department monthly ')
from Person 
join dept 
on Person.DepartmentID = dept.DepartmentID;

--2. Find city & department wise total, average & maximum salaries.
select sum(Person.Salary) as total,AVG(Person.Salary) as average,Max(Person.Salary) as maximum 
from Person join dept 
on Person.DepartmentID = dept.DepartmentID
group by Person.City,dept.DepartmentName;

--3. Find all persons who do not belong to any department.
select Person.* from Person left join dept on Person.DepartmentID = dept.DepartmentID where Person.DepartmentID is null;

--4. Find all departments whose total salary is exceeding 100000.
select sum(Person.Salary) 
from Person join dept 
on Person.DepartmentID = dept.DepartmentID 
where Person.Salary > 100000 
group by dept.DepartmentName

------Part – C:

--1. List all departments who have no person.
--2. List out department names in which more than two persons are working.
--3. Give a 10% increment in the computer department employee’s salary. (Use Update)


-------------------------------------------------------- LAB-13 -------------------------------------------------------------------------

CREATE TABLE City (
    CityID INT PRIMARY KEY,
    Name VARCHAR(100) UNIQUE,
    Pincode INT NOT NULL,
    Remarks VARCHAR(255)
);

CREATE TABLE Village (
    VID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    CityID INT,
    FOREIGN KEY (CityID) REFERENCES City(CityID)
);

INSERT INTO City (CityID, Name, Pincode, Remarks) VALUES
(1, 'Rajkot', 360005, 'Good'),
(2, 'Surat', 335009, 'Very Good'),
(3, 'Baroda', 390001, 'Awesome'),
(4, 'Jamnagar', 361003, 'Smart'),
(5, 'Junagadh', 362229, 'Historic'),
(6, 'Morvi', 363641, 'Ceramic');

INSERT INTO Village (VID, Name, CityID) VALUES
(101, 'Raiya', 1),
(102, 'Madhapar', 1),
(103, 'Dodka', 3),
(104, 'Falla', 4),
(105, 'Bhesan', 5),
(106, 'Dhoraji', 5);

------Part-A

--1. Display all the villages of Rajkot city.
select Village.* 
from Village join City
on Village.CityID = City.CityID
where City.Name = 'Rajkot';

--2. Display city along with their villages & pin code.
select Village.Name,City.Pincode
from City join Village on Village.CityID = City.CityID;

--3. Display the city having more than one village.
select City.Name 
from City left join Village
on Village.CityID = City.CityID
group by City.Name
having count(Village.CityID) > 1;

--4. Display the city having no village.
select City.*
from City left join Village
on Village.CityID = City.CityID
where Village.VID is null;

--5. Count the total number of villages in each city.
select City.Name, count(Village.CityID) 
from City join Village 
on Village.CityID = City.CityID 
group by City.Name;

--6. Count the number of cities having more than one village.
select count(City.Name) 
from City 
where CityID 
in (select CityID from Village 
			where Village.CityID = City.CityID 
			group by Village.CityID 
			having count(Village.CityID)>1
			)