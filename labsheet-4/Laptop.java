class Laptop {
    String brand;
    int RAM;
    static String os = "Windows";

    void display() {
        String b = brand;  
        int r = RAM;

        System.out.println("Brand: " + b);
        System.out.println("RAM: " + r + " GB");
        System.out.println("OS: " + os);
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();

        l.brand = "Dell";
        l.RAM = 8;

        l.display();
    }
}
