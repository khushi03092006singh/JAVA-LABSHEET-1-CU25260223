import java.util.Scanner;

public class Integer{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int a = sc.nextInt();

        System.out.println("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        sc.close();
    }
}