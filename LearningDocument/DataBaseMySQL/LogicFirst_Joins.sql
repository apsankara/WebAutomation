-- read the following link for same text
-- https://balanced-quince-db1.notion.site/SQL-7347f5956fe347f887b4132c716cd236
CREATE DATABASE LOGICFIRST; -- creates a new database
-- TO DELETE A DATABASE
DROP DATABASE LOGICFIRST;
DROP SCHEMA LOGICFIRST; -- same as above. u can use DATABASE Or SCHEMA
DROP SCHEMA IF EXISTS LOGICFIRST; -- prevents error if db not found

use LogicFirst;
show Databases;
SHOW TABLES;
SHOW CHARACTER SET;

CREATE TABLE branch(
branch_id INT PRIMARY KEY AUTO_INCREMENT,
br_name varchar(20) NOT NULL,
addr varchar(200)
);


CREATE TABLE employee(
emp_id INT PRIMARY KEY AUTO_INCREMENT,
ename VARCHAR(20) NOT NULL,
job_desc VARCHAR(30),
salary INT,
branch_id int,
constraint FK_branch_id Foreign key(branch_id) references branch(branch_id)
);


ALTER TABLE branch add column dept varchar(30);
ALTER TABLE branch drop dept;

INSERT INTO branch VALUES(1,"Chennai","16 ABC Road");
INSERT INTO branch VALUES(2,"Coimbatore","120 15th Block");
INSERT INTO branch VALUES(3,"Mumbai","25 XYZ Road");
INSERT INTO branch VALUES(4,"Hydrabad","32 10th Street");

INSERT INTO employee VALUES(1,'Ram','ADMIN',1000000,2);
INSERT INTO employee VALUES(2,'Harini','MANAGER',2500000,2);
INSERT INTO employee VALUES(3,'George','SALES',2000000,1);
INSERT INTO employee VALUES(4,'Ramya','SALES',1300000,2);
INSERT INTO employee VALUES(5,'Meena','HR',2000000,3);
INSERT INTO employee VALUES(6,'Ashok','MANAGER',3000000,1);
INSERT INTO employee VALUES(7,'Abdul','HR',2000000,1);
INSERT INTO employee VALUES(8,'Ramya','ENGINEER',1000000,2);
INSERT INTO employee VALUES(9,'Raghu','CEO',8000000,3);
INSERT INTO employee VALUES(10,'Arvind','MANAGER',2800000,3);
INSERT INTO employee VALUES(11,'Akshay','ENGINEER',1000000,1);
INSERT INTO employee VALUES(12,'John','ADMIN',2200000,1);
INSERT INTO employee VALUES(13,'Abinaya','ENGINEER',2100000,2);
INSERT INTO employee VALUES(14,'Vidya','ADMIN',2200000,NULL);
INSERT INTO employee VALUES(15,'Ranjani','ENGINEER',2100000,NULL);

SELECT * FROM branch;
SELECT * FROM employee;

select emp_id,ename,salary, job_desc from employee where salary>=2500000 order by ename desc;

SELECT emp_id,ename,salary FROM employee
WHERE salary<2600000 AND job_desc = 'MANAGER';

SELECT * FROM employee
WHERE job_desc='ADMIN' OR job_desc='HR';

SELECT * FROM employee
WHERE job_desc IN ('ADMIN','HR'); 

SELECT * FROM employee
WHERE job_desc NOT IN ('ADMIN','HR'); 

SELECT * FROM employee where salary between 2000000 and 3000000;

SELECT * from employee order by ename limit 5;

SELECT DISTINCT * from employee;

SELECT DISTINCT job_desc
FROM employee;

SELECT ename from employee order by ename asc;

select ename from employee order by ename desc;

select ename,salary from employee order by salary;


SELECT * FROM employee order by (case job_desc
when 'CEO' then  1
when 'MANAGER' then 2
when 'SALES' then 3
else 100 end
);

SELECT UCASE(ename),salary
FROM employee; -- uppercase

SELECT LCASE(ename),salary
FROM employee; -- lowercase

--  displays number of employees count in each job_desc category only when count is greater than 1.
Select *from employee;

SELECT job_desc,count(job_desc) job_count from employee GROUP BY job_desc having count(emp_id)>1;

Select * From employee;
select * from branch;
