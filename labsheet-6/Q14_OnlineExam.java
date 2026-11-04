import java.util.Scanner;
class InvalidExamMarksException extends Exception {
    InvalidExamMarksException(String message) {
        super(message);
    }
}
public class Q14_OnlineExam {
    static void validateMarks(int marks)
            throws InvalidExamMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidExamMarksException(
                    "Marks must be between 0 and 100.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter student's marks: ");
            int marks = Integer.parseInt(sc.nextLine());
            validateMarks(marks);
            if (marks >= 40) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        } catch (InvalidExamMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid numeric value.");
        } finally {
            System.out.println("Exam evaluation completed.");
        }
        sc.close();
    }
}