import java.util.Scanner;
class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String message) {
        super(message);
    }
}
public class Q12_HospitalPatient {
    static void validateAge(int age) throws InvalidPatientAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidPatientAgeException(
                    "Patient age must be between 0 and 120.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();
            System.out.print("Enter patient age: ");
            int age = Integer.parseInt(sc.nextLine());
            validateAge(age);
            System.out.println("Patient registered successfully.");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid numeric age.");
        }
        sc.close();
    }
}