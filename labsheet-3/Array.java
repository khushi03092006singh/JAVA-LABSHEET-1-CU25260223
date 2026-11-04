import java.util.Scanner;
class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("The integers are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}