class Box1<T> {
    T value;

    Box1(T value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        Box1<Integer> b1 = new Box1<>(100);
        Box1<String> b2 = new Box1<>("Hello Java");
        Box1<Double> b3 = new Box1<>(25.5);

        b1.display();
        b2.display();
        b3.display();
    }
}