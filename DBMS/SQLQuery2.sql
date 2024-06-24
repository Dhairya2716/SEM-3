use CSE_3A_240

select * from Deposit
select * from Borrow
select * from Branch
select * from Customers

-- PART-A

-- Display Account No, Customer Name & Amount from DEPOSIT.
select ACTNO,CNAME,AMOUNT from Deposit;

-- Display Loan No, Amount from BORROW.
select LOANNO,AMOUNT from Borrow

--Display loan details of all customers who belongs to ‘ANDHERI’ branch from borrow table.
select * from Borrow where BNAME = 'ANDHERI';

-- Give account no and amount of depositor, whose account no is equals to 106 from deposit table.
select ACTNO,AMOUNT from Deposit where ACTNO <> 106;

-- Give name of borrowers having amount greater than 5000 from borrow table.
select CNAME from Borrow where AMOUNT > 5000;

-- Give name of customers who opened account after date '1-12-96' from deposit table.
select CNAME from Deposit where ADATE > '1996-12-1';

-- Display name of customers whose account no is less than 105 from deposit table.
select CNAME from Deposit where ACTNO < 105;

-- Display name of customer who belongs to either ‘NAGPUR’ or ‘DELHI’ from customer table. (OR & IN)
select CNAME from Customers where CITY in ('NAGPUR','DELHI');

-- Display name of customers with branch whose amount is greater than 4000 and account no is less than 105 from deposit table.
select CNAME from Deposit where AMOUNT > 4000 AND ACTNO < 105;

-- Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000 from borrow table. (AND & BETWEEN)
select * from Borrow where AMOUNT between 3000 AND 8000;

-- Find all depositors who do not belongs to ‘ANDHERI’ branch from deposit table.
select * from Deposit where BNAME <> 'ANDHERI';

-- Display Account No, Customer Name & Amount of such customers who belongs to ‘AJNI’, ‘KAROLBAGH’ Or ‘M.G.ROAD’ and Account No is less than 104 from deposit table.
select ACTNO,CNAME,AMOUNT from Deposit where BNAME in ('AJNI','KAROLBAGH','M.G.ROAD') AND ACTNO < 104;

-- PART-B

select * from Deposit
select * from Borrow
select * from Branch
select * from Customers


-- 1) Display all the details of first five customers from deposit table.
select TOP 5 CNAME from Deposit;

-- 2) Display all the details of first three depositors whose amount is greater than 1000.
select TOP 3 * from Deposit where AMOUNT > 1000;

-- 3) Display Loan No, Customer Name of first five borrowers whose branch name does not belongs to ‘ANDHERI’ from borrow table.
select TOP 5 LOANNO,CNAME from Borrow where BNAME <> 'ANDHERI';

-- 4) Retrieve all unique cities using DISTINCT. (Use Customers Table)
select DISTINCT CITY from Customers;

-- 5) Retrieve all unique branches using DISTINCT. (Use Branch Table)
select DISTINCT BNAME from Branch;

-- PART-C

select * from Deposit
select * from Borrow
select * from Branch
select * from Customers

-- 1) Retrieve top 50% record from table BORROW.
select TOP 50 PERCENT * from Borrow;

-- 2) Display top 10% amount from table DEPOSIT.
select TOP 10 PERCENT AMOUNT from Deposit;

-- 3) Display top 25% customer who deposited more than 5000.
select TOP 25 PERCENT CNAME from Deposit where AMOUNT > 5000;

-- 4) Retrieve first 10% Loan Amounts.
select TOP 10 PERCENT AMOUNT from Borrow;  

-- 5) Retrieve all unique customer names with city.
select DISTINCT CNAME,CITY from Customers;

-- 6) Retrieve all Loan records with one more column in Loan Amount as 10% extra amount.
select * , (AMOUNT+AMOUNT*0.1) AS 'EXTRA-AMOUNT' from Borrow;

-- 7) Retrieve all odd/even value loan number from Borrow table.
select * from Borrow where LOANNO % 2 = 1;
