class Q8Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Q8Employee extends Q8Person {
    int employeeId;

    void displayEmployee() {
        displayName();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Q8Manager extends Q8Employee {
    String department;

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class Q8Main {
    public static void main(String[] args) {
        Q8Manager m = new Q8Manager();

        m.name = "Priya";
        m.employeeId = 501;
        m.department = "Finance";

        m.displayManager();
    }
}