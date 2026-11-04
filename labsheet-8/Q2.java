class Result2<T> {
    T marks;

    Result2(T marks) {
        this.marks = marks;
    }

    void display() {
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Result2<Integer> r1 = new Result2<>(85);
        Result2<Double> r2 = new Result2<>(92.5);

        r1.display();
        r2.display();
    }
}
