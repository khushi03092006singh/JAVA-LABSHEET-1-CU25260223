import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        // For-each loop
        for (int num : arr) {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
        sc.close();
    }
}
