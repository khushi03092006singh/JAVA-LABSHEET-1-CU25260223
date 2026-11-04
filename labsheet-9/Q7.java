
import java.util.*;

class Q7 {
    public static void main(String[] args) {
        ArrayList<Integer> list =
            new ArrayList<>(Arrays.asList(10, 20, 30, 20, 40));

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        System.out.println("Maximum: " + Collections.max(list));
        System.out.println("Minimum: " + Collections.min(list));
        System.out.println("Frequency of 20: " +
                           Collections.frequency(list, 20));
    }
}

