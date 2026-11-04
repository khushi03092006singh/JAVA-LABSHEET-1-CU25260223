class Q4Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Q4Dog extends Q4Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class Q4Main {
    public static void main(String[] args) {
        Q4Dog d = new Q4Dog();

        d.eat();
        d.sleep();
        d.bark();
    }
}
