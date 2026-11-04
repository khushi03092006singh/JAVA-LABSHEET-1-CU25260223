import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        boolean powerOf4 = false;

        if (temp > 0) {
            while (temp % 4 == 0) {
                temp >>= 2;   
            }
            if (temp == 1) {
                powerOf4 = true;
            }
        }
        System.out.println("Is " + num + " a power of 4? " + powerOf4);
        int toggled = num ^ (1 << 2);
        System.out.println("After toggling 3rd bit = " + toggled);
        System.out.println("\nMultiplication Table:");
        for (int i = 1; i <= 20; i++) {
            int result = num * i;
            if (result % 6 == 0) {
                continue;
            }
            if (result % 48 == 0) {
                break;
            }

            System.out.println(num + " x " + i + " = " + result);
        }

        sc.close();
    }
}
