class StudentGrade {
    String name;
    int marks;
    static int passingMarks = 40;

    void assignGrade() {
      
        char grade;

        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= passingMarks)
            grade = 'C';
        else
            grade = 'F';

        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentGrade s = new StudentGrade();

        s.name = "Rahul";
        s.marks = 82;

        s.assignGrade();
    }
}