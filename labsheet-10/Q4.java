
import java.io.FileWriter;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        FileWriter fw = new FileWriter("students.txt", true);

        fw.write("\n" + name + " " + roll + " " + marks);
        fw.close();

        System.out.println("Student record added successfully.");
        sc.close();
    }
}

