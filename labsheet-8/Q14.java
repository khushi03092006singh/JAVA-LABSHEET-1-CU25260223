import java.util.ArrayList;

class GenericListDisplay14 {

    static <T> void display(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Integer List:");
        display(numbers);

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");

        System.out.println("String List:");
        display(names);
    }
}