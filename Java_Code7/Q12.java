class Container12<T> {
    T value;

    void add(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

    public static void main(String[] args) {

        Container12<Integer> c1 = new Container12<>();
        c1.add(100);
        System.out.println("Integer: " + c1.get());

        Container12<String> c2 = new Container12<>();
        c2.add("Java");
        System.out.println("String: " + c2.get());

        Container12<Double> c3 = new Container12<>();
        c3.add(25.5);
        System.out.println("Double: " + c3.get());
    }
}