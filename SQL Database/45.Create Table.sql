create database sla;
use sla;
CREATE TABLE student (
  id INT,
  name VARCHAR(26),
  age INT,
  grade VARCHAR(26)
);
INSERT INTO student (id, name, age, grade)
VALUES 
(1, 'Dhivi', 20, 'A'),
(2, 'Raj', 19, 'B+'),
(3, 'Harish', 21, 'A+'),
(4, 'Babu', 18, 'B');
DESC student;
select*from student;