import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a floating-point number: ");
        double num = sc.nextDouble();

        int convertedNum = (int) num;

        System.out.println("Original value: " + num);
        System.out.println("Converted integer value: " + convertedNum);

        sc.close();
    }
}
