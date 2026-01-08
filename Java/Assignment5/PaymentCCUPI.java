package Assignment5;

interface Payment {
    void pay();
}

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}

public class PaymentCCUPI{
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.pay();
        p2.pay();
    }
}

