class Q19Employee {
    private String name;
    private int employeeId;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int id) {
        employeeId = id;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

interface Q19Programmer {
    void writeCode();
}

interface Q19Researcher {
    void conductResearch();
}

class Q19Developer extends Q19Employee
        implements Q19Programmer, Q19Researcher {

    public void writeCode() {
        System.out.println("Developer writes code.");
    }

    public void conductResearch() {
        System.out.println("Developer conducts research.");
    }
}

public class Q19Main {
    public static void main(String[] args) {
        Q19Developer d = new Q19Developer();

        d.setName("Arjun");
        d.setEmployeeId(202);

        d.displayEmployee();
        d.writeCode();
        d.conductResearch();
    }
}