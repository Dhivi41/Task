package com.index;

import java.sql.*;
import java.util.Scanner;

// Student POJO Class
class Student {

    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}


// DAO Interface
interface StudentDAO {
    void addStudent(Student s);
}


// DAO Implementation
class StudentDAOImpl implements StudentDAO {

    static final String DB_URL = "jdbc:mysql://localhost:3306/NewDB";
    static final String USER = "root";
    static final String PASS = "root";

    public void addStudent(Student s) {

        try {

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "INSERT INTO student VALUES(?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getMarks());

            ps.executeUpdate();

            System.out.println("Student Record Inserted Successfully");

            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


// Main Class
public class DAOMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        Student s = new Student(id, name, marks);

        StudentDAO dao = new StudentDAOImpl();

        dao.addStudent(s);

        sc.close();
    }
}