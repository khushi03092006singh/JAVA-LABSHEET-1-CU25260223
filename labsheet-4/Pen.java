class Pen {
    String color, type;
    static String manufacturer = "Cello";

    void display() {
        String c = color;   
        String t = type;

        System.out.println("Color: " + c);
        System.out.println("Type: " + t);
        System.out.println("Manufacturer: " + manufacturer);
    }

    public static void main(String[] args) {
        Pen p = new Pen();

        p.color = "Blue";
        p.type = "Ball Pen";

        p.display();
    }
}
