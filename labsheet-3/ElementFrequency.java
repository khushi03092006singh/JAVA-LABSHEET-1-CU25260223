import java.util.Scanner;
public class ElementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        boolean[] visited = new boolean[5];
        System.out.println("Enter 5 elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nFrequency of each element:");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " appears " + count + " time(s)");
        }
        sc.close();
    }
}