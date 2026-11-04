import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        int roundedFahrenheit = (int) fahrenheit;

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println("Fahrenheit after type casting: " + roundedFahrenheit);

        sc.close();
    }
}
