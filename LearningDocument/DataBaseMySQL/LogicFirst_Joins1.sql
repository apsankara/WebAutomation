DROP TABLE employee;

drop table branch;

alter table branch
drop foreign key fk_branchID;

CREATE TABLE branchs (
branch_id INT PRIMARY KEY AUTO_INCREMENT,
br_name VARCHAR(30) NOT NULL,
addr VARCHAR(200) );

CREATE TABLE employee (
emp_id INT PRIMARY KEY AUTO_INCREMENT,
ename VARCHAR(30) NOT NULL,
job_desc VARCHAR(20),
salary INT,
branch_id INT,
CONSTRAINT FK1_branchId FOREIGN KEY(branch_id) REFERENCES branchs(branch_id)
);

INSERT INTO branchs VALUES(1,"Chennai","16 ABC Road");
INSERT INTO branchs VALUES(2,"Coimbatore","120 15th Block");
INSERT INTO branchs VALUES(3,"Mumbai","25 XYZ Road");
INSERT INTO branchs VALUES(4,"Hydrabad","32 10th Street");

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

SELECT * FROM employee;
SELECT * FROM branchs;

-- inner join: only matching rows

SELECT employee.emp_id,employee.ename,employee.Job_Desc,branchs.br_name
from employee
INNER JOIN branchs
ON employee.branch_id=branchs.branch_id
ORDER BY emp_id;

SELECT employee.emp_id,employee.ename,employee.Job_Desc,branchs.br_name
from employee, branchs
where employee.branch_id=branchs.branch_id
ORDER BY emp_id;


SELECT employee.emp_id,employee.ename,employee.Job_Desc,branchs.br_name
from employee
LEFT JOIN branchs
ON employee.branch_id=branchs.branch_id
ORDER BY emp_id;