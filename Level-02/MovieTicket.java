// The MovieTicket class models a movie ticket booking system
public class MovieTicket {

    // Attributes of the MovieTicket class
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize the movie ticket with movie name and price
    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.seatNumber = "Not Assigned";  // Default seat number when no seat is booked
    }

    // Method to book a ticket, assign seat number, and update the price
    public void bookTicket(@org.jetbrains.annotations.NotNull String seatNumber) {
        this.seatNumber = seatNumber;
        // Example logic to adjust price based on seat selection
        if (seatNumber.startsWith("A")) {
            this.price += 5.0;  // Premium seat (e.g., "A1" could be premium)
        } else if (seatNumber.startsWith("B")) {
            this.price += 2.0;  // Standard seat (e.g., "B1")
        } else {
            this.price += 1.0;  // Budget seat (e.g., "C1")
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    // Main method for testing the MovieTicket class
    public static void main(String[] args) {
        // Create a MovieTicket object for a movie
        MovieTicket ticket = new MovieTicket("Avengers Endgame", 150.0);

        // Book the ticket with a specific seat number
        ticket.bookTicket("A3");

        // Display the details of the ticket
        ticket.displayTicketDetails();

        // Book another ticket with a different seat
        ticket.bookTicket("B10");

        // Display the updated details of the ticket
        ticket.displayTicketDetails();
    }
}
