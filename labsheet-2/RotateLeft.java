import java.util.Scanner;

public class RotateLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int rotated = (num << 2) | (num >>> 30);
        System.out.println("After cyclic left rotation by 2 bits: " + rotated);
        sc.close();
    }
}
