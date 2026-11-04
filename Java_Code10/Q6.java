
import java.util.*;

class Q6 {
    public static void main(String[] args) {
        ArrayList<String> courses =
            new ArrayList<>(Arrays.asList(
                "Java", "Python", "C", "HTML"
            ));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        if (courses.contains(course))
            System.out.println("Course Found");
        else
            System.out.println("Course Not Found");

        sc.close();
    }
}
