
import java.util.*;

class Q8 {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.addFirst("Aman");
        students.addLast("Riya");
        students.addLast("Rahul");

        System.out.println("List: " + students);

        students.removeFirst();
        students.removeLast();

        System.out.println("After Removal: " + students);
    }
}

