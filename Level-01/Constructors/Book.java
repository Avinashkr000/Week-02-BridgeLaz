package Learn;

class Book {
    String title;
    String author;
    double price;

    public Book() {

    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Detail:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: INR " + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.displayDetails();

        Book book = new Book("The Power of subconscious mind", "Dr. Joseph Murphy", 150);
        book.displayDetails();
    }
}
