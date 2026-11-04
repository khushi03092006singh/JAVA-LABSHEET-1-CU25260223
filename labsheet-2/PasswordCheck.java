import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "java123";
        String password;
        do {
            System.out.println("Enter password: ");
            password = sc.nextLine();
            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.");
            }
        } while (!password.equals(correctPassword));
        System.out.println("Password correct. Access granted!");
        sc.close();
    }
}
