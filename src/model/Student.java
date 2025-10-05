package model;

public class Student extends Person {
    private int rollNo;
    private String course;
    private double marks;
    private char grade;

    public Student(int rollNo, String name, String email, String course, double marks) {
        super(name, email);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        calculateGrade();
    }

    // Overloaded constructor (without marks)
    public Student(int rollNo, String name, String email, String course) {
        this(rollNo, name, email, course, 0.0);
    }

    // Method overloading for display
    public void displayInfo(boolean showMarks) {
        displayInfo();
        if (showMarks) {
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
    }

    private void calculateGrade() {
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 50) grade = 'C';
        else grade = 'D';
    }

    // Getters and setters
    public int getRollNo() { return rollNo; }
    public void setCourse(String course) { this.course = course; }
    public void setMarks(double marks) { this.marks = marks; calculateGrade(); }
}
