class Car {
    String brand;
    double mileage;
    static int wheels = 4;

    void display() {
        String b = brand;       
        double m = mileage;

        System.out.println("Brand: " + b);
        System.out.println("Mileage: " + m);
        System.out.println("Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Car c = new Car();

        c.brand = "Toyota";
        c.mileage = 20.5;

        c.display();
    }
}
