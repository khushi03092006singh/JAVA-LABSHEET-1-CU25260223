public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int num = 1; num <= 1000; num++) {
            int temp = num;
            int sum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
