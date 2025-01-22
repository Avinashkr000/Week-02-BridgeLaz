import java.util.ArrayList;

class GradeCalculator{
    // calculates the grade
    public static String calculateGrade(Student student){
        int total = 0;
        // iterating through the subjects and totalling marks
        for(Subject subject : student.getSubjects()){
            total += subject.marks;
        }
        // calculating average
        int average = total / student.getSubjects().size();
        String grade = "Grade is : ";
        // returns grade
        if(average >= 90){
            return grade + "A";
        }else if(average >= 80){
            return grade + "B";
        }else if(average >= 70){
            return grade + "C";
        }else if(average >= 60){
            return grade + "D";
        }else{
            return grade + "F";
        }
    }
}
class Subject{
    // attributes
    String name;
    int marks;
    // constructor
    Subject(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}
public class Student{
    // static list to store subjects of a student
    private static ArrayList<Subject> subjects = new ArrayList<Subject>();
    // attributes
    private String name;
    private int rollNumber;
    // constructor
    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        System.out.println("Student Name: " + name + " , Roll Number: " + rollNumber);
    }
    // method to get subject
    public ArrayList<Subject> getSubjects(){
        return subjects;
    }
    public static void main(String[] args) {
        // adding subjects to student
        Student student = new Student("Avinash", 434);

        // adding subjects to list
        Subject maths = new Subject("Maths" , 70);
        Subject chemistry = new Subject("Chemistry" , 78);
        Subject physics = new Subject("Physics" , 85);
        subjects.add(maths);
        subjects.add(chemistry);
        subjects.add(physics);
        
        // calculating and printing grade
        System.out.println(GradeCalculator.calculateGrade(student));
    }
}