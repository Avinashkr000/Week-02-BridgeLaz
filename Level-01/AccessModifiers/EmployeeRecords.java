package AccessModifiers;

class EmployeeRecords {
    public static class Employee {
        public int employeeID;
        protected String department;
        private double salary;

        public Employee(int employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    public static class Manager extends Employee {
        public Manager(int employeeID, String department, double salary) {
            super(employeeID, department, salary);
        }

        public void displayEmployeeDetails() {
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);
        }
    }
    public static void main(String[] args) {
        Manager manager = new Manager(101, "IT", 50000);
        manager.displayEmployeeDetails();
    }
}
