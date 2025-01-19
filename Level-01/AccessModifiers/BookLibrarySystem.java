package AccessModifiers;

public class BookLibrarySystem {

    // Book class
    public static class Book {
        public String ISBN;
        protected String title;
        private String author;

        public Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }

    // EBook subclass
    public static class EBook extends Book {
        public EBook(String ISBN, String title, String author) {
            super(ISBN, title, author);
        }

        public void displayDetails() {
            System.out.println("ISBN: " + ISBN);
            System.out.println("Title: " + title);
        }
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        EBook ebook = new EBook("12", "Java", "Author Name");
        ebook.displayDetails();
        System.out.println("Author: " + ebook.getAuthor());
    }
}
