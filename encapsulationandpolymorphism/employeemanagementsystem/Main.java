package encapsulationandpolymorphism.employeemanagementsystem;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new FullTimeEmployee(101,"Alice",90000,5000,5);
        Employee employee2=new PartTimeEmployee(202,"Bob",60000,3500,4);
        employee1.calculateSalary();
        employee2.calculateSalary();
        employee1.assignDepartment("Software Engineer");
        employee2.assignDepartment("Finance");
        employee1.displayDetails();
        System.out.println("=================================");
        employee2.displayDetails();
    }
}
