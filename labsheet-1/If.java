import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of Subject 1: ");
        double marks1 = sc.nextDouble();

        System.out.println("Enter marks of Subject 2: ");
        double marks2 = sc.nextDouble();

        System.out.println("Enter marks of Subject 3: ");
        double marks3 = sc.nextDouble();

        double total = marks1 + marks2 + marks3;
        double percentage = total / 3;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (marks1 >= 40 && marks2 >= 40 && marks3 >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}
