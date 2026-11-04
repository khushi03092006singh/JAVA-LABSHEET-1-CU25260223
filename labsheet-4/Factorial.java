class Factorial {
    static int totalCalls = 0;

    void computeFactorial(int n) {
        // Local variables
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        totalCalls++;

        System.out.println("Number: " + n);
        System.out.println("Factorial: " + factorial);
        System.out.println("Total Calls: " + totalCalls);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.computeFactorial(5);
    }
}