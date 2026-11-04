class Q1Student {
    private String name;
    private int rollNo;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Q1Main {
    public static void main(String[] args) {
        Q1Student s = new Q1Student();

        s.setName("Aman");
        s.setRollNo(101);
        s.setMarks(87.5);

        s.displayDetails();
    }
}