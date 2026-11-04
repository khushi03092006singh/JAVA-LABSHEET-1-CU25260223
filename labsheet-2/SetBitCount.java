import java.util.Scanner;

public class SetBitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        int n = num;
        while (n != 0) {
            count += n & 1;  
            n = n >> 1;     
        }
        System.out.println("Number of set bits: " + count);
        sc.close();
    }
}