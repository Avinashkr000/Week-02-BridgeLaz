class Student {
    static String universityName = "ABCD University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Student Name: " + this.name);
            System.out.println("Roll Number: " + this.rollNumber);
            System.out.println("Grade: " + this.grade);
            System.out.println("University: " + Student.universityName);
        } else {
            System.out.println("This is not a valid Student object.");
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + this.grade);
        } else {
            System.out.println("This is not a valid Student object.");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Aviansh", 1001, "A");
        Student student2 = new Student("Kunal", 1002, "B");

        student1.displayStudentDetails();
        student2.displayStudentDetails();

        displayTotalStudents();

        student1.updateGrade("A+");
        student2.updateGrade("A");

        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}
