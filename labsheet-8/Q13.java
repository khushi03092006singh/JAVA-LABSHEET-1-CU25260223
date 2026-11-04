class StudentThree13<T, U, V> {
    T id;
    U name;
    V marks;

    StudentThree13(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------");
    }

    public static void main(String[] args) {

        StudentThree13<Integer, String, Double> s1 =
            new StudentThree13<>(101, "Rahul", 85.5);

        StudentThree13<Integer, String, Double> s2 =
            new StudentThree13<>(102, "Priya", 90.5);

        StudentThree13<Integer, String, Double> s3 =
            new StudentThree13<>(103, "Amit", 78.5);

        s1.display();
        s2.display();
        s3.display();
    }
}