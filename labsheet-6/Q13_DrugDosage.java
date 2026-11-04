import java.util.Scanner;
class InvalidDosageException extends Exception {
    InvalidDosageException(String message) {
        super(message);
    }
}
public class Q13_DrugDosage {
    static void validateDosage(double dosage)
            throws InvalidDosageException {
        if (dosage <= 0 || dosage > 1000) {
            throw new InvalidDosageException(
                    "Dosage must be between 1 mg and 1000 mg.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter patient name: ");
            String patientName = sc.nextLine();
            System.out.print("Enter drug name: ");
            String drugName = sc.nextLine();
            System.out.print("Enter dosage in mg: ");
            double dosage = Double.parseDouble(sc.nextLine());
            validateDosage(dosage);
            System.out.println("Dosage is valid.");
            System.out.println("Patient Name: " + patientName);
            System.out.println("Drug Name: " + drugName);
            System.out.println("Dosage: " + dosage + " mg");
        } catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid numeric dosage.");
        } finally {
            System.out.println("Dosage validation is completed.");
        }
        sc.close();
    }
}