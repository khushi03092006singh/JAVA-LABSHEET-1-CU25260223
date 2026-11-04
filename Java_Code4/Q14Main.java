class Q14Employee {
    double calculateSalary() {
        return 30000;
    }
}

class Q14Manager extends Q14Employee {
    @Override
    double calculateSalary() {
        return 50000 + 10000;
    }
}

public class Q14Main {
    public static void main(String[] args) {
        Q14Employee e = new Q14Employee();
        Q14Employee m = new Q14Manager();

        System.out.println("Employee salary: " + e.calculateSalary());
        System.out.println("Manager salary: " + m.calculateSalary());
    }
}
