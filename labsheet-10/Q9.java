
import java.io.*;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter("student_records.txt");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter Roll, Name, Course, Marks:");

            int roll = sc.nextInt();
            String name = sc.next();
            String course = sc.next();
            int marks = sc.nextInt();

            fw.write(roll + " " + name + " " +
                     course + " " + marks + "\n");
        }

        fw.close();

        BufferedReader br = new BufferedReader(
            new FileReader("student_records.txt"));

        String line;
        System.out.println("\nStudent Records:");

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        sc.close();
    }
}

