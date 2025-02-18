use bmdb;
CREATE TABLE students (
    stuid INT primary key,
    stuname VARCHAR(50),
    stuclass varchar(5),
    sturollno INT,
    stugen varchar(10),
    studob varchar(15)
);
select * from students;
insert into students(stuid,stuname,stuclass,sturollno,stugen,studob) 
values
(1,"Ali","5-A",111,"male","22-2-2004"),
(2,"Bali","5-A",112,"female","12-4-2004"),
(3,"Cat","5-A",113,"male","21-6-2004");
