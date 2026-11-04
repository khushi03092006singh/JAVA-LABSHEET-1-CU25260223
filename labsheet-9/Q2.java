
import java.util.*;

class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> marks =
            new ArrayList<>(Arrays.asList(75, 80, 85, 90, 95));

        System.out.println("First: " + marks.get(0));
        System.out.println("Last: " + marks.get(4));
        System.out.println("Middle: " + marks.get(2));
    }
}
