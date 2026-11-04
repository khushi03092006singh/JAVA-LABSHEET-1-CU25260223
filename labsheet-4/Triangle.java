class Triangle {
    double a, b, c;
    static String type = "Scalene/Isosceles/Equilateral";

    void checkTriangle() {
        
        boolean valid = (a + b > c) && (a + c > b) && (b + c > a);

        if (!valid) {
            System.out.println("Invalid Triangle");
        } else if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();

        t.a = 5;
        t.b = 5;
        t.c = 8;

        t.checkTriangle();
    }
}