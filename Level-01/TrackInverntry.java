class Item {
    // Attributes
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize attributes
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}public class TrackInverntry {
    public static void main(String[] args) {
        // Create an Item object
        Item item = new Item(101, "Laptop", 75000);

        // Display item details
        item.displayDetails();

        // Calculate and display total cost for a given quantity
        int quantity = 5; // Example quantity
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total cost for quantity " + quantity + ": INR " + totalCost);
    }
}