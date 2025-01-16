class Employee {
    // Attributes
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize attributes
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class DisplayEmployee {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Avinash  ", 101, 50000);

        // Display the employee's details
        emp.displayDetails();
    }
}