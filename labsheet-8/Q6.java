class Employee6<T, U> {
    T employeeId;
    U employeeName;

    Employee6(T employeeId, U employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }

    public static void main(String[] args) {
        Employee6<Integer, String> e1 =
            new Employee6<>(101, "Amit");

        e1.display();
    }
}