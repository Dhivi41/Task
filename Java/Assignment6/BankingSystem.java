package Assignment6;

class Account {
    void accountDetails() {
        System.out.println("Account details displayed");
    }
}

interface Savings {
    void calculateInterest();
}

interface Current {
    void overdraftLimit();
}

class PremiumAccount extends Account implements Savings, Current {

    public void calculateInterest() {
        System.out.println("Savings interest calculated");
    }

    public void overdraftLimit() {
        System.out.println("Overdraft limit is 50,000");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        PremiumAccount pa = new PremiumAccount();

        pa.accountDetails();
        pa.calculateInterest();
        pa.overdraftLimit();
    }
}
