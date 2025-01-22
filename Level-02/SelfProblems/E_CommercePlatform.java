package SelfProblems;

import java.util.ArrayList;
import java.util.List;

class Product {
    private final String productName;
    private final double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private final int orderId;
    private final List<Product> products;
    private final Customer customer;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in this order:");
        double totalAmount = 0;
        for (Product product : products) {
            System.out.println("  - " + product.getProductName() + ": " + product.getPrice());
            totalAmount += product.getPrice();
        }
        System.out.println("Total Amount : " + totalAmount);
    }

    public List<Product> getProducts() {
        return products;
    }
}

class Customer {
    private final String name;
    private final List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void viewOrders() {
        System.out.println(name + "'s Orders:");
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

public class E_CommercePlatform {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 97099.00);
        Product smartphone = new Product("Smartphone", 23099.00);
        Product headphones = new Product("Headphones", 4999.00);

        Customer avinash = new Customer("Aviansh kumar");

        Order order1 = new Order(1, avinash);
        order1.addProduct(laptop);
        order1.addProduct(smartphone);

        Order order2 = new Order(2, avinash);
        order2.addProduct(headphones);

        avinash.placeOrder(order1);
        avinash.placeOrder(order2);

        avinash.viewOrders();
    }
}
