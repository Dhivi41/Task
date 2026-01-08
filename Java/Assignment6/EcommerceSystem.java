package Assignment6;

class User {
    void accessLevel() {
        System.out.println("General user access");
    }
}

class Admin extends User {
    void accessLevel() {
        System.out.println("Admin full access");
    }
}

class Seller extends User {
    void accessLevel() {
        System.out.println("Seller product management access");
    }
}

class Customer extends User {
    void accessLevel() {
        System.out.println("Customer shopping access");
    }
}

public class EcommerceSystem {
    public static void main(String[] args) {
        User u1 = new Admin();
        User u2 = new Seller();
        User u3 = new Customer();

        u1.accessLevel();
        u2.accessLevel();
        u3.accessLevel();
    }
}
