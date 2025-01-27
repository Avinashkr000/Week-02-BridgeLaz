package encapsulationandpolymorphism.employeemanagementsystem;

abstract class Employee implements Department{
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(int employeeId, String name, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        setBaseSalary(baseSalary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0)
            this.baseSalary = baseSalary;
        else
            System.out.println("Enter valid salary!");
    }
    public abstract void calculateSalary();
    public void displayDetails(){
        System.out.println("Employee name : "+name);
        System.out.println("Employee ID  : "+employeeId);
        System.out.println("Employee's base salary : "+baseSalary);
    }

    @Override
    public void assignDepartment(String department) {
        setDepartment(department);
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department : "+getDepartment());;
    }
}
