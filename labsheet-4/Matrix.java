class Matrix {
    int[][] matrix = new int[2][2];
    static String matrixType = "2x2";

    void addAndSubtract(Matrix m) {
       
        int[][] sum = new int[2][2];
        int[][] difference = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix[i][j] + m.matrix[i][j];
                difference[i][j] = matrix[i][j] - m.matrix[i][j];
            }
        }

        System.out.println("Matrix Type: " + matrixType);

        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            System.out.println(sum[i][0] + " " + sum[i][1]);
        }

        System.out.println("Subtraction:");
        for (int i = 0; i < 2; i++) {
            System.out.println(difference[i][0] + " " + difference[i][1]);
        }
    }

    public static void main(String[] args) {
        Matrix a = new Matrix();
        Matrix b = new Matrix();

        a.matrix = new int[][]{{1, 2}, {3, 4}};
        b.matrix = new int[][]{{5, 6}, {7, 8}};

        a.addAndSubtract(b);
    }
}