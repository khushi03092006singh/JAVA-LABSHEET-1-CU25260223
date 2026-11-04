import java.util.Scanner;

public class LeapYearRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = sc.nextInt();

        System.out.println("Enter lower range: ");
        int lower = sc.nextInt();

        System.out.println("Enter upper range: ");
        int upper = sc.nextInt();

        boolean leapYear = (year % 400 == 0) ||
                           (year % 4 == 0 && year % 100 != 0);

        if (leapYear && year >= lower && year <= upper) {
            System.out.println("The year is a leap year and lies within the given range.");
        } else {
            System.out.println("The year does not satisfy both conditions.");
        }

        sc.close();
    }
}
