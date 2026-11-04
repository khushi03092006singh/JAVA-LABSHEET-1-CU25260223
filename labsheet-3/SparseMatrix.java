import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        int zeroCount = 0;
        int nonZeroCount = 0;

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] == 0) {
                    zeroCount++;
                } else {
                    nonZeroCount++;
                }
            }
        }

        if (zeroCount > nonZeroCount) {
            System.out.println("The matrix is a sparse matrix.");
        } else {
            System.out.println("The matrix is not a sparse matrix.");
        }

        System.out.println("Number of zero elements = " + zeroCount);
        System.out.println("Number of non-zero elements = " + nonZeroCount);

        sc.close();
    }
}