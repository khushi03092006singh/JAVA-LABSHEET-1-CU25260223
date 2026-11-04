
import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                new FileReader("student.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
