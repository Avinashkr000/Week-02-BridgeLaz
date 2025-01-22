import java.util.ArrayList;
import java.util.List;

class Customer{
    // Customer details
    // Attributes: name, list of products
    public String name;
    private List<Product> products;

    // Constructor: initializes customer with name and empty list of products
    public Customer(String name){
        this.name = name;
        products = new ArrayList<>();
    }

    // Method to add a product to the customer's list of products
    public void purchaseProduct(Product product){
        products.add(product);
    }
    // Method to get the list of products purchased by the customer
    public List<Product> getPurchasedProducts() {
        return products;
    }
}
class Product{
    // Product details
    public String name;
    public int quantity;
    public double price;

    // Constructor: initializes product with name, quantity, and price
    public Product(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

class BillGenerator{
    // Bill details
    public double generateBill(Customer customer) {
        double total = 0;

        System.out.println("Bill for " + customer.name + ":");
        // iterating through all customers and getting products
        for (Product product : customer.getPurchasedProducts()) {
            double productTotal = product.price;
            System.out.println("- " + product.name + " = " + productTotal);
            total += productTotal;
        }
        System.out.println("Total: " + total); 
        return total; // returns total
    }
}

public class GroceryMain{
    public static void main(String[] args) {
        // Creating a new customer and adding products to their cart
        Customer c1 = new Customer("Avinash");
        
        // Creating products and adding them to the customer's cart
        Product p1 = new Product("Apples", 20, 3);
        Product p2 = new Product("Milk", 1, 32);

        // Adding products to the customer's cart
        c1.purchaseProduct(p1);
        c1.purchaseProduct(p2);

        // Generating and displaying the bill for the customer
        BillGenerator bill = new BillGenerator();
        bill.generateBill(c1);
    }
}