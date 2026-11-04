class Q10Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Q10Dog extends Q10Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Q10Cat extends Q10Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class Q10Main {
    public static void main(String[] args) {
        Q10Dog d = new Q10Dog();
        Q10Cat c = new Q10Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}