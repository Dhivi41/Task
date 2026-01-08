package Assignment6;

class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

interface Developer {
    void develop();
}

interface Tester {
    void test();
}

class TeamLead extends Employee implements Developer, Tester {

    public void develop() {
        System.out.println("TeamLead is developing software");
    }

    public void test() {
        System.out.println("TeamLead is testing software");
    }
}

public class EmployeeWDT {
    public static void main(String[] args) {
        TeamLead tl = new TeamLead();

        tl.work();
        tl.develop();
        tl.test();
    }
}
