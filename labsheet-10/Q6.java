
import java.io.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("notes.txt");
        fw.write("Java is easy. Java is powerful.");
        fw.close();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.next();

        BufferedReader br = new BufferedReader(
            new FileReader("notes.txt"));

        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String w : words) {
                if (w.replaceAll("[^a-zA-Z]", "")
                     .equalsIgnoreCase(word)) {
                    count++;
                }
            }
        }

        br.close();

        if (count > 0)
            System.out.println("Word found " + count + " times.");
        else
            System.out.println("Word not found.");

        sc.close();
    }
}

