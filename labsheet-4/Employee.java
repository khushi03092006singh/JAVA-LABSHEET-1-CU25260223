class Employee {
    int empId;
    double salary;
    static String companyName = "ABC Ltd.";

    void display() {
        int id = empId;         
        double sal = salary;     
        String company = companyName;

        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + sal);
        System.out.println("Company: " + company);
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.empId = 101;
        e.salary = 50000;

        e.display();
    }
}