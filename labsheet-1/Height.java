import java.util.Scanner;

public class Height {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height in cm: ");
        double height = sc.nextDouble();

        if (height < 150) {
            System.out.println("Classification: Short");
        } else if (height <= 170) {
            System.out.println("Classification: Average");
        } else {
            System.out.println("Classification: Tall");
        }

        sc.close();
    }
}