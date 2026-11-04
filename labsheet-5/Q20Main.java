class Q20Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int id) {
        employeeId = id;
    }

    public void setEmployeeName(String name) {
        employeeName = name;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    double calculateSalary() {
        return salary;
    }
}

interface Q20Researcher {
    void conductResearch();
}

class Q20Teacher extends Q20Employee implements Q20Researcher {
    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    void teach() {
        System.out.println("Teaching " + subject);
    }

    public void conductResearch() {
        System.out.println("Teacher is conducting research.");
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + 5000;
    }
}

class Q20VisitingTeacher extends Q20Teacher {
    private int hoursWorked;

    public void setHoursWorked(int hours) {
        hoursWorked = hours;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * 500;
    }
}

class Q20Admin extends Q20Employee {
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    void manageDepartment() {
        System.out.println("Managing " + department + " department.");
    }
}

public class Q20Main {
    public static void main(String[] args) {

        // Teacher Object
        Q20Teacher t = new Q20Teacher();

        t.setEmployeeId(1);
        t.setEmployeeName("Dr. Mehta");
        t.setSalary(40000);
        t.setSubject("Computer Science");

        t.displayDetails();
        t.teach();
        t.conductResearch();

        System.out.println("Teacher salary: " + t.calculateSalary());

        System.out.println();

        // Visiting Teacher Object
        Q20VisitingTeacher vt = new Q20VisitingTeacher();

        vt.setEmployeeId(2);
        vt.setEmployeeName("Ms. Rao");
        vt.setSalary(0);
        vt.setSubject("Java");
        vt.setHoursWorked(20);

        vt.displayDetails();
        vt.teach();

        System.out.println("Visiting teacher salary: "
                + vt.calculateSalary());

        System.out.println();

        // Admin Object
        Q20Admin a = new Q20Admin();

        a.setEmployeeId(3);
        a.setEmployeeName("Mr. Khan");
        a.setSalary(35000);
        a.setDepartment("Administration");

        a.displayDetails();
        a.manageDepartment();

        System.out.println("Admin salary: " + a.calculateSalary());
    }
}