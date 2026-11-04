class Q7Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Q7Dog extends Q7Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Q7Puppy extends Q7Dog {
    void play() {
        System.out.println("Puppy plays.");
    }
}

public class Q7Main {
    public static void main(String[] args) {
        Q7Puppy p = new Q7Puppy();

        p.eat();
        p.bark();
        p.play();
    }
}