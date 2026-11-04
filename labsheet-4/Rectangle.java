class Rectangle {
    int length, breadth;
    static String shapeName = "Rectangle";

    void area() {
        int a = length * breadth;  
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + a);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.length = 10;
        r.breadth = 5;

        r.area();
    }
}