package Assignment6;

class User {
    void login() {
        System.out.println("User logged in");
    }
}

class Admin extends User {
    void manageUsers() {
        System.out.println("Admin managing users");
    }
}

class Manager extends User {
    void manageTeam() {
        System.out.println("Manager managing team");
    }
}

class Customer extends User {
    void placeOrder() {
        System.out.println("Customer placing order");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Admin a = new Admin();
        Manager m = new Manager();
        Customer c = new Customer();

        a.login();
        a.manageUsers();

        m.login();
        m.manageTeam();

        c.login();
        c.placeOrder();
    }
}
