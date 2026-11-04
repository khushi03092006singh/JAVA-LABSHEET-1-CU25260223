class Book {
    String title, author;
    double price;
    static String publisher = "ABC Publications";

    void display() {
        String t = title;       
        String a = author;
        double p = price;

        System.out.println("Title: " + t);
        System.out.println("Author: " + a);
        System.out.println("Price: " + p);
        System.out.println("Publisher: " + publisher);
    }

    public static void main(String[] args) {
        Book b = new Book();

        b.title = "Java Basics";
        b.author = "Rahul";
        b.price = 350;

        b.display();
    }
}