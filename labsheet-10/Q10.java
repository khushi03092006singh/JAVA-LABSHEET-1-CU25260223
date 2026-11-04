
import java.io.*;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter("employees.txt");

        System.out.print("Enter ID, Name, Department, Salary: ");
        int id = sc.nextInt();
        String name = sc.next();
        String dept = sc.next();
        double salary = sc.nextDouble();

        fw.write(id + " " + name + " " +
                 dept + " " + salary);
        fw.close();

        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();

        try {
            BufferedReader br = new BufferedReader(
                new FileReader("employees.txt"));

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");

                if (Integer.parseInt(data[0]) == searchId) {
                    System.out.println("Employee Record: " + line);
                    found = true;
                    break;
                }
            }

            if (!found)
                System.out.println("Employee record not found.");

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Employee file does not exist.");
        }

        sc.close();
    }
}
