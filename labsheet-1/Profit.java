import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost price: ");
        double costPrice = sc.nextDouble();

        System.out.println("Enter selling price: ");
        double sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("Profit: " + profit);
        } else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No profit, no loss.");
        }

        sc.close();
    }
}