package encapsulationandpolymorphism.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        LibraryItem b = new Book("101", "Java Basics", "John Doe");
        b.getLoanDuration(14);
        b.getItemDetails();
        System.out.println("Is Available: " + b.checkAvailability());
        b.reserveItem();
        System.out.println();
        b= new Magazine("202", "Abc", "xyz");
        b.getLoanDuration(16);
        b.getItemDetails();
        System.out.println("Is Available: " + b.checkAvailability());
        System.out.println("Is Available: " + b.checkAvailability());
        b.reserveItem();
        b.reserveItem();
        System.out.println();
        b = new DVD("303", "Songs", "Arijit singh");
        b.getLoanDuration(18);
        b.getItemDetails();
        System.out.println("Is Available: " + b.checkAvailability());
        b.reserveItem();




    }
}
