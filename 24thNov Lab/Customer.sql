use DeepDB;
create table CUSTOMER(Cust_id varchar(5),
Fname varchar(15),
Lname varchar(15),
Area char(2),
Phone numeric(10),
DOB date,
Payment numeric(6,2));
insert into CUSTOMER(Cust_id, Fname, Lname, Area, Phone,DOB,Payment)
values("A01","Ivan","Ross","SA",6125467,"1986-01-15",800.50),("A02","Vandana","Ray","MU",5560379,"1987-12-20",1000.75),
("A03","Pramada","Jauguste","DA",4560389,"1967-07-25",500.00),("A04","Basu","Navindi","BA",6125401,"1956-02-28",860.00),
("A05","Ravi","Shridhar","NA",null,"1989-02-15",500.50),("A06","Rukmini","Aiyer","GH",5125274,"1987-07-23",1500.50);
describe CUSTOMER;
select * from CUSTOMER;
alter table CUSTOMER add SystemDate date;
insert into CUSTOMER(SystemDate) value(curdate());
select SystemDate from CUSTOMER;
update CUSTOMER set Phone=91237 where Cust_id="A02";
update CUSTOMER set Phone=21390 where Cust_id="A04";
update CUSTOMER set DOB="2000-09-19" where Cust_id="A03";
update CUSTOMER set DOB="2003-07-22" where Cust_id="A05";
select * from CUSTOMER;
delete from CUSTOMER where Cust_id="A01";
delete from CUSTOMER where Cust_id="A05";
delete from CUSTOMER;
insert into CUSTOMER(Cust_id, Fname, Lname, Area, Phone,DOB,Payment)
values ("1","Deep","Raj","Asia",6125467,"1999-05-15",4500.56),("2","Priya","Sarkar","China",68714589,"1998-04-25",560.75),
("3","Akash","Dey","Asia",8814537,"1987-05-15",500.25),("4","Komol","Williams","Europe",6345367,"1956-06-18",400.75),
("5","Debu","Ray","Asia",9687477,"1999-08-11",4599.5);
update CUSTOMER set Area="Africa" where Fname="Debu";
delete from CUSTOMER where Fname="Priya";


