package SelfProblems;

import java.util.ArrayList;
import java.util.List;

class Courses {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public void Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    Courses(String courseName, List<Student> students) {
        this.courseName = courseName;
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "No professor assigned"));
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("  - " + student.getName());
        }
    }
}

class Professor {
    private final String name;
    private final List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
    }

    public void showProfessorDetails() {
        System.out.println("Professor: " + name);
        System.out.println("Courses being taught:");
        for (Course course : courses) {
            System.out.println("  - " + course.getCourseName());
        }
    }
}

class Student {
    private final String name;
    private final List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void showStudentDetails() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : courses) {
            System.out.println("  - " + course.getCourseName());
        }
    }

    public void viewCourses() {
    }

    public void enrollInCourse(Course course) {
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor drAvinash = new Professor("Dr. Avinash");
        Professor drKunal = new Professor("Dr. Kunal");

        Course cs101 = new Course("CS101 - Introduction to Computer Science");
        Course math101 = new Course("MATH101 - Calculus I");

        Student alice = new Student("Abhisek");
        Student bob = new Student("Vikash");


        drAvinash.assignCourse(cs101);
        drKunal.assignCourse(math101);


        alice.enrollCourse(cs101);
        bob.enrollCourse(cs101);
        alice.enrollCourse(math101);


        drAvinash.showProfessorDetails();
        drKunal.showProfessorDetails();
        alice.showStudentDetails();
        bob.showStudentDetails();
        cs101.showCourseDetails();
        math101.showCourseDetails();
    }
}
