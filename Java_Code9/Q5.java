
import java.io.*;

public class Q5 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("source.txt");
        FileWriter fw = new FileWriter("backup.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();

        System.out.println("File copied successfully.");
    }
}
