
import java.io.FileWriter;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("student.txt");

            fw.write("Student Name: Khushi\n");
            fw.write("Roll Number: 101\n");
            fw.write("Course: BCA\n");
            fw.write("Semester: 2");

            fw.close();
            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
