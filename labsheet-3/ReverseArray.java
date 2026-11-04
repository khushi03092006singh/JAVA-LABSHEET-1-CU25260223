import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        // Input 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // Display in reverse order
        System.out.println("Integers in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}