package Instance;

class ProductInventry {

    private String productName;
    private double price;
    private static int totalProducts = 0;

    public ProductInventry(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        ProductInventry product1 = new ProductInventry("Laptop", 1200.99);
        ProductInventry product2 = new ProductInventry("Smartphone", 799.49);

        product1.displayProductDetails();
        product2.displayProductDetails();
        displayTotalProducts();
    }
}
