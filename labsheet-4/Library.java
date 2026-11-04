class Library {
    int booksAvailable;
    static String libraryName = "City Library";

    void issueBook() {
        
        int books = booksAvailable;

        if (books > 0) {
            books--;
            booksAvailable = books;
            System.out.println("Book issued successfully");
        } else {
            System.out.println("No books available");
        }
    }

    void returnBook() {
        
        int books = booksAvailable;

        books++;
        booksAvailable = books;

        System.out.println("Book returned successfully");
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.booksAvailable = 5;

        System.out.println("Library: " + libraryName);
        l.issueBook();
        l.returnBook();

        System.out.println("Books Available: " + l.booksAvailable);
    }
}
