class MobilePhone {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize attributes
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: INR " + price);
    }
}public class HandleMobilePhone {
    public static void main(String[] args) {
        // Creating MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 14", 79999);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23 Ultra", 124999);

        // Displaying details of the phones
        phone1.displayDetails();
        System.out.println(); // Add a line break
        phone2.displayDetails();
    }
}