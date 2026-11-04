class StudentID3<T> {
    T id;

    StudentID3(T id) {
        this.id = id;
    }

    void display() {
        System.out.println("Student ID: " + id);
    }

    public static void main(String[] args) {
        StudentID3<Integer> s1 = new StudentID3<>(101);
        s1.display();
    }
}