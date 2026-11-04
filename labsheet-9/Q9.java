
import java.util.*;

class Q9 {
    public static void main(String[] args) {
        ArrayList<String> list =
            new ArrayList<>(Arrays.asList(
                "Java", "Python", "C", "C++"
            ));

        ListIterator<String> it = list.listIterator();

        it.next();
        it.set("JavaScript");
        it.add("HTML");

        System.out.println(list);
    }
}
