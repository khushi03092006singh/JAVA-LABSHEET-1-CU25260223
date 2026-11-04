import java.util.Scanner;
public class LexicographicCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        int minLength = Math.min(str1.length(), str2.length());
        int result = 0;
        for (int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 < c2) {
                result = -1;
                break;
            } else if (c1 > c2) {
                result = 1;
                break;
            }
        }
        if (result == 0) {
            if (str1.length() < str2.length()) {
                result = -1;
            } else if (str1.length() > str2.length()) {
                result = 1;
            }
        }
        if (result < 0) {
            System.out.println("First string comes before second string.");
        } else if (result > 0) {
            System.out.println("First string comes after second string.");
        } else {
            System.out.println("Both strings are equal.");
        }
        sc.close();
    }
}
