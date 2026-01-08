package Assignment5;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class Machine implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Machine m = new Machine();
        m.print();
        m.scan();
    }
}
