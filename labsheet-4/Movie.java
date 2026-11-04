class Movie {
    String name, genre;
    double rating;
    static String industry = "Bollywood";

    void display() {
        String n = name;      
        String g = genre;
        double r = rating;

        System.out.println("Name: " + n);
        System.out.println("Genre: " + g);
        System.out.println("Rating: " + r);
        System.out.println("Industry: " + industry);
    }

    public static void main(String[] args) {
        Movie m = new Movie();

        m.name = "Dangal";
        m.genre = "Sports Drama";
        m.rating = 8.3;

        m.display();
    }
}
