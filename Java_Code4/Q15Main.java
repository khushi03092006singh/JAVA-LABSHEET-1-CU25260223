class Q15Shape {
    double calculateArea() {
        return 0;
    }
}

class Q15Circle extends Q15Shape {
    double radius;

    Q15Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Q15Rectangle extends Q15Shape {
    double length, width;

    Q15Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class Q15Main {
    public static void main(String[] args) {
        Q15Shape c = new Q15Circle(5);
        Q15Shape r = new Q15Rectangle(4, 6);

        System.out.printf("Circle area: %.2f%n", c.calculateArea());
        System.out.println("Rectangle area: " + r.calculateArea());
    }
}