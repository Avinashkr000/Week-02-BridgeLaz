package Learn;

public class CarRentalSystem {

    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    public CarRentalSystem() {
        this.customerName = "Default Customer";
        this.carModel = "Standard Model";
        this.rentalDays = 1;
        this.costPerDay = 500; // Default cost per day
    }

    public CarRentalSystem(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: INR " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRentalSystem rental = new CarRentalSystem("Avinash kumar", "SUV", 3, 3600);
        rental.displayDetails();
    }
}
