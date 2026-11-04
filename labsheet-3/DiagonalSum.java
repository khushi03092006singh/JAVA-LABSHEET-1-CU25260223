import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int mainSum = 0;
        int secondarySum = 0;
        System.out.print("Enter the size of the square matrix: ");
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            mainSum += matrix[i][i];
            secondarySum += matrix[i][n - 1 - i];
        }

        System.out.println("Sum of main diagonal = " + mainSum);
        System.out.println("Sum of secondary diagonal = " + secondarySum);

        sc.close();
    }
}
