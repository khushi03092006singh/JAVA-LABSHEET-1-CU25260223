class Pair4<T, U> {
    T employeeId;
    U employeeName;

    Pair4(T employeeId, U employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }

    public static void main(String[] args) {
        Pair4<Integer, String> p1 =
            new Pair4<>(101, "Rahul");

        p1.display();
    }
}