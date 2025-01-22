package SelfProblems;


import java.util.ArrayList;
import java.util.List;

class Course {
    private final String courseName;
    private final List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("  - " + student.getName());
        }
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void showCourseDetails() {
    }

    public void assignProfessor(Professor professor) {
    }
}

class Students {
    private String name;
    private List<Course> courses;

    public Students(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println("  - " + course.getCourseName());
        }
    }

    public List<Course> getCourses() {
        return courses;
    }
}

class School {
    private final String schoolName;
    private final List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println("  - " + student.getName());
        }
    }
}

public class SchoolAndStudent {
    public static void main(String[] args) {

    }
}
