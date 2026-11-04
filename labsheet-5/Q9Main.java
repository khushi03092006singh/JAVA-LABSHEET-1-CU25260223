class Q9Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }

    void stop() {
        System.out.println("Vehicle stops.");
    }
}

class Q9Car extends Q9Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Q9ElectricCar extends Q9Car {
    void chargeBattery() {
        System.out.println("Battery is charging.");
    }
}

public class Q9Main {
    public static void main(String[] args) {
        Q9ElectricCar e = new Q9ElectricCar();

        e.start();
        e.stop();
        e.drive();
        e.chargeBattery();
    }
}