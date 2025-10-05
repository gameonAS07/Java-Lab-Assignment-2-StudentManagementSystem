# 🎓 Student Management System (Java OOP Project)

- Course: Java Programming Lab
- Faculty: Dr. Manish Kumar
- Name : Akash Sharma
- Roll No: 2401201108
- BCA(Ai & Ds) Sec : B

A simple **Student Record Management System** built in **Java** demonstrating Object-Oriented Programming (OOP) concepts like **Inheritance**, **Encapsulation**, **Abstraction**, and **Polymorphism**.

This project was created as part of the **Java Programming Lab Assignment (Dr. Manish Kumar)**.

---

## 🚀 Features

- Add new student records  
- Display all student records  
- Calculate grade automatically based on marks  
- Input validation for marks (0–100)  
- Menu-driven console interface  
- Uses **ArrayList** to store multiple students  
- Demonstrates:
  - Constructors (default + parameterized)
  - Inheritance (`Student` extends `Person`)
  - Methods and encapsulation
  - Conditional statements and loops

---

## 📁 Project Structure

StudentManagementSystem/
└── StudentRecordSystem.java

> 💡 *If you’re using the advanced version with packages (Assignment 2), your structure may include `model`, `service`, and `main` folders.*

---

## ⚙️ How to Run

### **1. Save the file**
Save the code as `StudentRecordSystem.java` inside a folder named `StudentManagementSystem`.

### **2. Open Command Prompt / Terminal**
Navigate to your project directory:
```bash```
cd StudentManagementSystem
3. Compile the program
javac StudentRecordSystem.java
4. Run the programjava StudentRecordSystem
java StudentRecordSystem

## Example Output
===== Student Record Menu =====
1. Add Student
2. Display All Students
3. Exit
Enter your choice: 1
Enter Roll No: 101
Enter Name: Rahul
Enter Course: BCA
Enter Marks: 87.5
Student added successfully!

===== Student Record Menu =====
Enter your choice: 2
===== Student Records =====
Roll No: 101
Name: Rahul
Course: BCA
Marks: 87.5
Grade: B
-----------------------

Enter your choice: 3
Exiting the application. Goodbye!
