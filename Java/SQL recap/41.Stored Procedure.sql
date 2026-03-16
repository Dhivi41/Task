create database StoredProcedure;
use StoredProcedure;

CREATE TABLE student(
rollno INT PRIMARY KEY,
name VARCHAR(50),
marks INT
);

INSERT INTO student VALUES
(1,'Arun',80),
(2,'Divya',90),
(3,'Ravi',65),
(4,'Meena',78);

DELIMITER $$
CREATE PROCEDURE display_all_students()
BEGIN
SELECT * FROM student;
END $$
DELIMITER ;

CALL display_all_students();

DELIMITER $$
CREATE PROCEDURE find_student(IN rno INT)
BEGIN
SELECT * FROM student WHERE rollno = rno;
END $$
DELIMITER ;

CALL find_student(1);

DELIMITER $$
CREATE PROCEDURE students_above_75()
BEGIN
SELECT * FROM student WHERE marks > 75;
END $$
DELIMITER ;

CALL students_above_75();

DELIMITER $$
CREATE PROCEDURE count_students()
BEGIN
SELECT COUNT(*) AS total_students FROM student;
END $$
DELIMITER ;

CALL count_students();

DELIMITER $$
CREATE PROCEDURE average_marks()
BEGIN
SELECT AVG(marks) AS average_marks FROM student;
END $$
DELIMITER ;

CALL average_marks();