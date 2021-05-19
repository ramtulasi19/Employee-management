create table employee_1429518(
empId number,
name varchar2(15),
age number,
salary number(10,2)

);
select * from EMPLOYEE_1429518;
insert into EMPLOYEE_1429518 values(1,'Maru',20,3000)
insert into EMPLOYEE_1429518 values(2,'Aneesh',19,2000);
insert into EMPLOYEE_1429518 values(3,'Mahi',21,1500);
insert into EMPLOYEE_1429518 values(4,'Nikki',20,3000)
select * from EMPLOYEE_1429518 order by salary 
alter table employee_1429518 add primary key(empId)

update EMPLOYEE_1429518 set salary=10000 where empid=1
select count(empId) from EMPLOYEE_1429518 where salary>1500

update EMPLOYEE_1429518 set name='Kalyani',age=21,salary=25000 where empid=1

select * from EMPLOYEE_1429518