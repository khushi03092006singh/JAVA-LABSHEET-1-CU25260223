import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        double length = sc.nextDouble();

        System.out.println("Enter breadth: ");
        double breadth = sc.nextDouble();

        if (length == breadth) {
            System.out.println("The rectangle is a square.");
        } else {
            System.out.println("The rectangle is not a square.");
        }

        sc.close();
    }
}