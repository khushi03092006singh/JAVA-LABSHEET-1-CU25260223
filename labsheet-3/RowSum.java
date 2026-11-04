import java.util.Scanner;

class RowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter 9 elements of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum = sum + matrix[i][j];
            }

            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }
        sc.close();
    }
}

