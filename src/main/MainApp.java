package main;

import model.Student;
import service.StudentManager;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;
        do {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Search Student");
            System.out.println("5. View All Students");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(roll, name, email, course, marks);
                    manager.addStudent(s);
                    break;

                case 2:
                    System.out.print("Enter Roll No to delete: ");
                    int delRoll = sc.nextInt();
                    manager.deleteStudent(delRoll);
                    break;

                case 3:
                    System.out.print("Enter Roll No to update: ");
                    int updRoll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter field to update (course/marks): ");
                    String field = sc.nextLine();
                    System.out.print("Enter new value: ");
                    Object newVal = field.equalsIgnoreCase("marks") ? sc.nextDouble() : sc.nextLine();
                    manager.updateStudent(updRoll, field, newVal);
                    break;

                case 4:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    Student found = manager.searchStudent(searchRoll);
                    if (found != null) found.displayInfo(true);
                    else System.out.println("Student not found.");
                    break;

                case 5:
                    manager.viewAllStudents();
                    break;

                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}
