import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first angle: ");
        int angle1 = sc.nextInt();

        System.out.println("Enter second angle: ");
        int angle2 = sc.nextInt();

        System.out.println("Enter third angle: ");
        int angle3 = sc.nextInt();

        if (angle1 > 0 && angle2 > 0 && angle3 > 0
                && angle1 + angle2 + angle3 == 180) {
            System.out.println("The angles can form a valid triangle.");
        } else {
            System.out.println("The angles cannot form a valid triangle.");
        }

        sc.close();
    }
}
