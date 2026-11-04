class Student {
    String name;
    int age;
    static int count = 0;

    Student(String n, int a) {
        String studentName = n; // local variable
        int studentAge = a;     // local variable

        name = studentName;
        age = studentAge;
        count++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20);
        Student s2 = new Student("Priya", 19);

        s1.display();
        s2.display();

        System.out.println("Total Students: " + count);
    }
}
