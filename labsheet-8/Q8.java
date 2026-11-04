class ThreeValues8 {

    static <T> void display(T a, T b, T c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println("Integer Values:");
        display(10, 20, 30);

        System.out.println("String Values:");
        display("Java", "Python", "C++");

        System.out.println("Double Values:");
        display(10.5, 20.5, 30.5);
    }
}
