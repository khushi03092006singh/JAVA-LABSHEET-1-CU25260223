class Person {
    String name;
    int age;
    static String country = "India";

    void checkEligibility() {
        int personAge = age;  
        boolean eligible = personAge >= 18;

        System.out.println("Name: " + name);
        System.out.println("Country: " + country);

        if (eligible)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");
    }

    public static void main(String[] args) {
        Person p = new Person();

        p.name = "Rahul";
        p.age = 20;

        p.checkEligibility();
    }
}