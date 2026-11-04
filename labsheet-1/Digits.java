import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int digits;

        if (num >= -9 && num <= 9) {
            digits = 1;
        } else if (num >= -99 && num <= 99) {
            digits = 2;
        } else if (num >= -999 && num <= 999) {
            digits = 3;
        } else if (num >= -9999 && num <= 9999) {
            digits = 4;
        } else {
            digits = 5;
        }

        System.out.println("Number of digits: " + digits);

        sc.close();
    }
}