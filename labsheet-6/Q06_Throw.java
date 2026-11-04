import java.util.Scanner;
public class Q06_Throw {
    static void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        System.out.println("Valid marks: " + marks);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's marks: ");
        int marks = sc.nextInt();
        try {
            validateMarks(marks);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
