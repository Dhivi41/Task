package Assignment5;

abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    double balance = 5000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

public class BankAccountDWS {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();

        sa.deposit(2000);
        sa.withdraw(1000);
        System.out.println("Balance: " + sa.balance);
    }
}

