import java.util.Scanner;
class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}
class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String message) {
        super(message);
    }
}
public class Q15_PharmacyInventory {
    static void checkInventory(int available, int required)
            throws InvalidQuantityException,
                   InsufficientMedicineStockException {
        if (available < 0 || required < 0) {
            throw new InvalidQuantityException(
                    "Quantity cannot be negative.");
        }
        if (required > available) {
            throw new InsufficientMedicineStockException(
                    "Required quantity is greater than available stock.");
        }
        System.out.println("Medicine issued successfully.");
        System.out.println("Remaining quantity: "
                + (available - required));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter medicine name: ");
            String medicineName = sc.nextLine();
            System.out.print("Enter available quantity: ");
            int available = Integer.parseInt(sc.nextLine());
            System.out.print("Enter required quantity: ");
            int required = Integer.parseInt(sc.nextLine());
            System.out.println("Medicine: " + medicineName);
            checkInventory(available, required);
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(
                    "Error: Please enter valid numeric quantities.");
        } finally {
            System.out.println(
                    "Inventory transaction is completed.");
        }
        sc.close();
    }
}