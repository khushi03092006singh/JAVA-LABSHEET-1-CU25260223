import java.util.ArrayList;

class StringList10 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");
        names.add("Neha");
        names.add("Riya");

        System.out.println("Original List: " + names);

        names.add("Karan");
        System.out.println("After add(): " + names);

        System.out.println("get(2): " + names.get(2));

        names.set(1, "Rohan");
        System.out.println("After set(): " + names);

        names.remove(3);
        System.out.println("After remove(): " + names);

        System.out.println("Size: " + names.size());
    }
}