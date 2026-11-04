import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your gender (male/female): ");
        String gender = sc.next();

        if (gender.equalsIgnoreCase("male")) {

            if (age >= 21) {
                System.out.println("Eligible according to the given criteria.");
            } else {
                System.out.println("Not eligible according to the given criteria.");
            }

        } else if (gender.equalsIgnoreCase("female")) {

            if (age >= 18) {
                System.out.println("Eligible according to the given criteria.");
            } else {
                System.out.println("Not eligible according to the given criteria.");
            }

        } else {
            System.out.println("Invalid gender entered.");
        }

        sc.close();
    }
}