import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int a = sc.nextInt();

        System.out.println("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("Enter logical operator (& or |): ");
        char operator = sc.next().charAt(0);

        boolean result;

        if (operator == '&') {
            result = (a != 0) && (b != 0);
            System.out.println("Result of AND operation: " + result);
        } else if (operator == '|') {
            result = (a != 0) || (b != 0);
            System.out.println("Result of OR operation: " + result);
        } else {
            System.out.println("Invalid logical operator.");
        }

        sc.close();
    }
}
