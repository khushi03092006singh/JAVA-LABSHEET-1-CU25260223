import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[3][];
        marks[0] = new int[3];  // Student 1: 3 subjects
        marks[1] = new int[4];  // Student 2: 4 subjects
        marks[2] = new int[2];  // Student 3: 2 subjects
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nStudent Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}
