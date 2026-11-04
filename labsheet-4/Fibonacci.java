class Fibonacci {
    static int seriesCount = 0;

    void displaySeries(int n) {
        // Local variables
        int first = 0, second = 1, next;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }

        seriesCount++;
        System.out.println("\nSeries Count: " + seriesCount);
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.displaySeries(7);
    }
}