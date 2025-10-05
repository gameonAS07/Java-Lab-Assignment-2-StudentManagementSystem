package service;

import model.Student;
import java.util.HashMap;

public class StudentManager implements RecordActions {
    private HashMap<Integer, Student> students = new HashMap<>();

    @Override
    public void addStudent(Student s) {
        if (students.containsKey(s.getRollNo())) {
            System.out.println("Error: Student with this roll number already exists!");
        } else {
            students.put(s.getRollNo(), s);
            System.out.println("Student added successfully.");
        }
    }

    @Override
    public void deleteStudent(int rollNo) {
        if (students.remove(rollNo) != null) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("No student found with this roll number.");
        }
    }

    @Override
    public void updateStudent(int rollNo, String field, Object newValue) {
        Student s = students.get(rollNo);
        if (s == null) {
            System.out.println("No student found with this roll number.");
            return;
        }

        switch (field.toLowerCase()) {
            case "course":
                s.setCourse((String)newValue);
                break;
            case "marks":
                s.setMarks((Double)newValue);
                break;
            default:
                System.out.println("Invalid field.");
                return;
        }
        System.out.println("Student record updated.");
    }

    @Override
    public Student searchStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
        } else {
            for (Student s : students.values()) {
                s.displayInfo(true);
                System.out.println("----------------------");
            }
        }
    }
}
