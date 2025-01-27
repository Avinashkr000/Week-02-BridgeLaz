package encapsulationandpolymorphism.employeemanagementsystem;

public class FullTimeEmployee extends Employee {
    private double amount;
    private int hours;
    private double totalSalary;
    public FullTimeEmployee(int id,String name,double salary,double amount,int hours){
        super(id,name,salary);
        this.amount=amount;
        this.hours=hours;
    }

    @Override
    public void calculateSalary() {
        double extraPay=amount*hours;
        totalSalary=extraPay+getBaseSalary();
    }

    @Override
    public void displayDetails() {
        System.out.println("Full Time Employee...");
        super.displayDetails();
        System.out.println("Total salary paid : "+totalSalary);
        getDepartmentDetails();
    }


}
