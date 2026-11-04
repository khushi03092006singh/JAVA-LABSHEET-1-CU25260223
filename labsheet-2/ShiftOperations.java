import java.util.Scanner;

public class ShiftOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter power of 2: ");
        int power = sc.nextInt();
        int multiplied = num << power;
        int divided = num >> power;
        System.out.println("After multiplication by 2^" + power + ": " + multiplied);
        System.out.println("After division by 2^" + power + ": " + divided);
        sc.close();
    }
}
