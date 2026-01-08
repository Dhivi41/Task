package Assignment5;

abstract class Vehicle {

    abstract void calculateMileage();

    void startEngine() {
        System.out.println("Engine started");
    }
}

class Car extends Vehicle {
    void calculateMileage() {
        System.out.println("Car mileage: 15 km/l");
    }
}

class Bike extends Vehicle {
    void calculateMileage() {
        System.out.println("Bike mileage: 40 km/l");
    }
}

public class VehicleMileage {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.startEngine();
        v1.calculateMileage();

        v2.startEngine();
        v2.calculateMileage();
    }
}
