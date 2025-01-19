package Learn;

class LibraryBookSystem {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBookSystem(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book " + title + " is currently unavailable.");
        }
    }

    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: INR " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        LibraryBookSystem book1 = new LibraryBookSystem("The Power of subconscious mind", "Dr. Joseph Murphy", 150, true);
        book1.displayDetails();
        book1.borrowBook();
        book1.displayDetails();
    }
}
