class Employee {
    static String companyName = "Tech Solution";
    static int totalEmployees = 0;
    final int id;
    String name;
    String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee Name: " + this.name);
            System.out.println("Employee ID: " + this.id);
            System.out.println("Designation: " + this.designation);
            System.out.println("Company Name: " + Employee.companyName);
        } else {
            System.out.println("This is not a valid Employee object.");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Avinash", 101, "Software Engineer");
        Employee emp2 = new Employee("Kunal", 102, "Project Manager");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        displayTotalEmployees();
    }
}
