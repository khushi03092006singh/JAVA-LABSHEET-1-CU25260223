
import java.util.*;

class Q3 {
    public static void main(String[] args) {
        ArrayList<String> students =
            new ArrayList<>(Arrays.asList(
                "Aman", "Riya", "Rahul", "Priya", "Neha"
            ));

        students.set(1, "Khushi");
        students.remove(3);

        System.out.println(students);
    }
}

