class Q3Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int id) {
        employeeId = id;
    }

    public void setEmployeeName(String name) {
        employeeName = name;
    }

    public void setSalary(double s) {
        if (s >= 0 && s <= 1000000) {
            salary = s;
            System.out.println("Salary accepted.");
        } else {
            System.out.println("Invalid salary. Enter 0 to 1000000.");
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

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

public class Q3Main {
    public static void main(String[] args) {
        Q3Employee e = new Q3Employee();

        e.setEmployeeId(10);
        e.setEmployeeName("Neha");
        e.setSalary(45000);
        e.setSalary(-500);

        e.displayDetails();
    }
}