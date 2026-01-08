package Assignment5;

abstract class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(int id, String name) {
        super(id, name);
    }

    void calculateSalary() {
        System.out.println("Full Time Salary: 50000");
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(int id, String name) {
        super(id, name);
    }

    void calculateSalary() {
        System.out.println("Part Time Salary: 20000");
    }
}

public class EmployeeFTPT {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Ravi");
        Employee e2 = new PartTimeEmployee(2, "Anu");

        e1.calculateSalary();
        e2.calculateSalary();
    }
}
