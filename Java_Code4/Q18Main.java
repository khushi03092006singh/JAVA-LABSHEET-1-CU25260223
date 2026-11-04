class Q18Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

class Q18Car extends Q18Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

interface Q18Electric {
    void chargeBattery();
}

class Q18ElectricCar extends Q18Car implements Q18Electric {
    public void chargeBattery() {
        System.out.println("Battery is charging.");
    }
}

public class Q18Main {
    public static void main(String[] args) {
        Q18ElectricCar e = new Q18ElectricCar();

        e.start();
        e.drive();
        e.chargeBattery();
    }
}