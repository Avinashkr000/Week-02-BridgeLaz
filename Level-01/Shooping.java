class Product {
    static double discount = 10.0;
    final int productID;
    String productName;
    double price;
    int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + this.productID);
            System.out.println("Product Name: " + this.productName);
            System.out.println("Price: " + this.price);
            System.out.println("Quantity: " + this.quantity);
            System.out.println("Discount: " + Product.discount + "%");
        } else {
            System.out.println("This is not a valid Product object.");
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 12000.00, 5);
        Product product2 = new Product(102, "Smart-phone", 8000.00, 10);

        product1.displayProductDetails();
        product2.displayProductDetails();

        updateDiscount(15.0);  // Update the discount for all products
        System.out.println("\nAfter updating discount:\n");

        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}
