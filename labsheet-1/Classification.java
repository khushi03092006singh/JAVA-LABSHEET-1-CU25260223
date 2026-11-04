import java.util.Scanner;

public class Classification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit.");
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an Uppercase Letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a Lowercase Letter.");
        } else {
            System.out.println(ch + " is a Special Character.");
        }

        sc.close();
    }
}
