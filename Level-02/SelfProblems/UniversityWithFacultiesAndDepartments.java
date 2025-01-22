package SelfProblems;

import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private final String departmentName;
    private final List<Faculty> facultyMembers;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void showFaculty() {
        System.out.println("Faculty in " + departmentName + " department:");
        for (Faculty faculty : facultyMembers) {
            System.out.println("  - " + faculty.getName());
        }
    }

    public List<Faculty> getFacultyMembers() {
        return facultyMembers;
    }
}

class University {
    private final String universityName;
    private final List<Department> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public void showDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (Department department : departments) {
            System.out.println("  - " + department.getDepartmentName());
        }
    }

    public void deleteUniversity() {
        departments.clear();
        System.out.println("University and all related departments have been delete");
    }
}

public class UniversityWithFacultiesAndDepartments {
    public static void main(String[] args) {
        Faculty ProfVivekSharma = new Faculty("Prof. Vivek sharma");
        Faculty ProfManojTyagi = new Faculty("Prof. Manoj Tyagi");
        Faculty ProfDeepti = new Faculty("Prof. Deepti");

        Department csDepartment = new Department("Computer Science");
        Department DataScience = new Department("Data Science");

        csDepartment.addFaculty(ProfVivekSharma);
        csDepartment.addFaculty(ProfManojTyagi);
        DataScience.addFaculty(ProfDeepti);

        University university = new University("RGPV University");
        university.addDepartment(csDepartment);
        university.addDepartment(DataScience);

        university.showDepartments();
        csDepartment.showFaculty();
        DataScience.showFaculty();

        university.deleteUniversity();

        university.showDepartments();

        System.out.println(ProfVivekSharma.getName() + " still exists independently.");
        System.out.println(ProfDeepti.getName() + " still exists independently.");
    }
}
