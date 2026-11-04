import java.util.Scanner;

public class Arthmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a five-digit number: ");
        int num = sc.nextInt();

        int firstDigit = num / 10000;
        int lastDigit = num % 10;

        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);

        if (firstDigit == lastDigit) {
            System.out.println("First and last digits are the same.");
        } else {
            System.out.println("First and last digits are not the same.");
        }

        sc.close();
    }
}