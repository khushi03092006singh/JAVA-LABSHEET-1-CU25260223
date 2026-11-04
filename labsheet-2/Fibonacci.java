public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println("First 20 terms of Fibonacci sequence:");
        for (int i = 1; i <= 20; i++) {
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
