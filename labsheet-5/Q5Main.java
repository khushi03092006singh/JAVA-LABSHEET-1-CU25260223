class Q5Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Q5Student extends Q5Person {
    int rollNo;
    String course;

    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Q5Main {
    public static void main(String[] args) {
        Q5Student s = new Q5Student();

        s.name = "Aman";
        s.age = 20;
        s.rollNo = 25;
        s.course = "BCA";

        s.displayStudent();
    }
}