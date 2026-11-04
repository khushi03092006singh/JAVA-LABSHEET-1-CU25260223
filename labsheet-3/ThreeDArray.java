import java.util.Scanner;
class ThreeDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];
        System.out.println("Enter 8 elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Elements of the 3-D array:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + (i + 1) + ":");

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

