class Q11Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Q11Student extends Q11Person {
    String course;

    void study() {
        System.out.println(name + " studies " + course);
    }
}

class Q11Teacher extends Q11Person {
    String subject;

    void teach() {
        System.out.println(name + " teaches " + subject);
    }
}

public class Q11Main {
    public static void main(String[] args) {
        Q11Student s = new Q11Student();

        s.name = "Asha";
        s.course = "BCA";
        s.displayName();
        s.study();

        Q11Teacher t = new Q11Teacher();

        t.name = "Mr. Verma";
        t.subject = "Java";
        t.displayName();
        t.teach();
    }
}