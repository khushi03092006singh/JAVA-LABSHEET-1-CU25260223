class Q6Employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println("Salary cannot be negative.");
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class Q6Manager extends Q6Employee {
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    void displayManager() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
    }
}

public class Q6Main {
    public static void main(String[] args) {
        Q6Manager m = new Q6Manager();

        m.setName("Karan");
        m.setSalary(60000);
        m.setDepartment("IT");

        m.displayManager();
    }
}
