class Q13Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Q13Dog extends Q13Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

class Q13Cat extends Q13Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

public class Q13Main {
    public static void main(String[] args) {
        Q13Animal a = new Q13Animal();
        Q13Animal d = new Q13Dog();
        Q13Animal c = new Q13Cat();

        a.makeSound();
        d.makeSound();
        c.makeSound();
    }
}