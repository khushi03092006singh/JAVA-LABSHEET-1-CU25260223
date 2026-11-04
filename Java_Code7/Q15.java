import java.util.ArrayList;
import java.util.Scanner;

class StudentManagement15<T, U, V> {

    T id;
    U name;
    V marks;

    StudentManagement15(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<StudentManagement15<Integer, String, Double>>
            students = new ArrayList<>();

        ArrayList<Integer> ids = new ArrayList<>();

        students.add(new StudentManagement15<>(101, "Rahul", 85.5));
        students.add(new StudentManagement15<>(102, "Priya", 90.5));
        students.add(new StudentManagement15<>(103, "Amit", 78.5));
        students.add(new StudentManagement15<>(104, "Neha", 88.0));
        students.add(new StudentManagement15<>(105, "Riya", 92.5));

        // Store student IDs
        for (StudentManagement15<Integer, String, Double> s : students) {
            ids.add(s.id);
        }

        // Display all students
        System.out.println("All Student Details:");

        for (int i = 0; i < students.size(); i++) {
            students.get(i).display();
        }

        // Search student
        System.out.print("Enter Student ID to search: ");
        int searchId = sc.nextInt();

        if (ids.contains(searchId)) {

            System.out.println("Student Found:");

            for (StudentManagement15<Integer, String, Double> s : students) {
                if (s.id.equals(searchId)) {
                    s.display();
                    break;
                }
            }

        } else {
            System.out.println("Student Not Found.");
        }

        // Total students
        System.out.println("Total Students: " + students.size());

        // Demonstrate type safety
        System.out.println("Type Safety Demonstration:");
        Integer studentId = 101;
        String studentName = "Rahul";
        Double studentMarks = 85.5;

        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + studentMarks);

        sc.close();
    }
}