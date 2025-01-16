class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Constructor to initialize attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: INR " + price);
    }
}public class HandleBook {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("The Power of subconscious mind", "Dr. Joseph Murphy", 150);

        // Display the book details
        book.displayDetails();
    }
}