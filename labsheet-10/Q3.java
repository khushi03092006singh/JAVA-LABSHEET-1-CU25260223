
import java.io.*;

public class Q3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("data.txt");
        fw.write("Hello Java\nWelcome to BCA\nFile Handling");
        fw.close();

        BufferedReader br = new BufferedReader(
            new FileReader("data.txt"));

        String line;
        int lines = 0, words = 0, chars = 0;

        while ((line = br.readLine()) != null) {
            lines++;
            words += line.split("\\s+").length;
            chars += line.length();
        }

        br.close();

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);
    }
}

