package AssistedProblems;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private final String departmentName;
    private final List<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName) {
        Employee employee = new Employee(employeeName);
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

class Company {
    private final String companyName;
    private final List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);
    }

    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (department.getDepartmentName().equals(departmentName)) {
                department.addEmployee(employeeName);
                return;
            }
        }
    }

    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            System.out.println("  Department: " + department.getDepartmentName());
            for (Employee employee : department.getEmployees()) {
                System.out.println("    Employee: " + employee.getName());
            }
        }
    }

    public void removeAllDepartments() {
        departments.clear();
    }

    public void removeAllEmployees() {
        for (Department department : departments) {
            department.getEmployees().clear();
        }
    }


    public void deleteCompany() {
        removeAllEmployees();
        removeAllDepartments();
        System.out.println("Company and all related departments and employees have been delete");
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {

        Company company = new Company("Tech ");


        company.addDepartment("IT");
        company.addDepartment("HR");


        company.addEmployeeToDepartment("Engineering", "Avinash");
        company.addEmployeeToDepartment("Engineering", "Abhisek");
        company.addEmployeeToDepartment("HR", "Rajan");


        company.displayCompanyDetails();


        company.deleteCompany();


        company.displayCompanyDetails();
    }
}
