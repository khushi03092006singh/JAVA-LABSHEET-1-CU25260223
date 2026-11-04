import java.util.Scanner;

class MaximumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element = " + max);
        sc.close();
    }
}



