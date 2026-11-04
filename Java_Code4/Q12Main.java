class Q12Employee {
    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Name: " + employeeName);
        System.out.println("ID: " + employeeId);
    }
}

class Q12Developer extends Q12Employee {
    String programmingLanguage;

    void writeCode() {
        System.out.println("Writing code in " + programmingLanguage);
    }
}

class Q12Manager extends Q12Employee {
    String department;

    void conductMeeting() {
        System.out.println("Managing " + department + " department.");
    }
}

public class Q12Main {
    public static void main(String[] args) {
        Q12Developer d = new Q12Developer();

        d.employeeName = "Rohit";
        d.employeeId = 11;
        d.programmingLanguage = "Java";

        d.displayEmployee();
        d.writeCode();

        Q12Manager m = new Q12Manager();

        m.employeeName = "Simran";
        m.employeeId = 12;
        m.department = "HR";

        m.displayEmployee();
        m.conductMeeting();
    }
}