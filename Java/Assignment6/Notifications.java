package Assignment6;

class Notification {
    void send() {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends Notification {
    void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends Notification {
    void send() {
        System.out.println("Sending SMS Notification");
    }
}

public class Notifications {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();

        n1.send();  // Email version
        n2.send();  // SMS version
    }
}
