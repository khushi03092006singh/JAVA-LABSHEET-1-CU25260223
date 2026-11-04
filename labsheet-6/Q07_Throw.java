import java.util.Scanner;
public class Q07_Throw {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }
        System.out.println("You are eligible.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}