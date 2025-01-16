class Student {
    // Attributes
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor to initialize attributes
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display the student's details and grade
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}public class StudentReport {
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Avinash", 101, 92);
        Student student2 = new Student("AK", 102, 78);

        // Displaying details of each student
        student1.displayDetails();
        System.out.println(); // Add a line break
        student2.displayDetails();
    }
}