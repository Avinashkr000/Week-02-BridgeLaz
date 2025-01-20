class Book {
    static String libraryName = "village Library";
    final String isbn;
    String title;
    String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN: " + this.isbn);
        } else {
            System.out.println("This is not a valid Book object.");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Power of your Subconcious mind", "Dr. Jospeh murphy", "978-0061124");
        Book book2 = new Book("1984", "George Orwelll", "978-045935");

        book1.displayBookDetails();
        book2.displayBookDetails();

        displayLibraryName();
    }
}
