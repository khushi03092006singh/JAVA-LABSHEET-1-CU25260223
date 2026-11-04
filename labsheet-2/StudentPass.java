import java.util.Scanner;

public class StudentPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter theory marks (%): ");
        double theory = sc.nextDouble();
        System.out.println("Enter practical marks (%): ");
        double practical = sc.nextDouble();
        System.out.println("Enter overall marks (%): ");
        double overall = sc.nextDouble();
        if ((theory >= 40 && practical >= 50) || overall >= 50) {
            System.out.println("Student passes the course.");
        } else {
            System.out.println("Student fails the course.");
        }

        sc.close();
    }
}
