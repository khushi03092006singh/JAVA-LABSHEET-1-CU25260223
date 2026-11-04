class Employeee {
    String name;
    double salary;
    static String organization = "TCS";

    void compareSalary(Employeee e) {
        // Local variables
        double salary1 = salary;
        double salary2 = e.salary;

        System.out.println("Organization: " + organization);

        if (salary1 > salary2)
            System.out.println(name + " has higher salary");
        else if (salary1 < salary2)
            System.out.println(e.name + " has higher salary");
        else
            System.out.println("Both have equal salary");
    }

    public static void main(String[] args) {
        Employeee e1 = new Employeee();
        Employeee e2 = new Employeee();

        e1.name = "Rahul";
        e1.salary = 50000;

        e2.name = "Amit";
        e2.salary = 45000;

        e1.compareSalary(e2);
    }
}