package OOP.Assignment9;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    private ArrayList<Student> students;

    public StudentList() {
        students = new ArrayList<>();
    }


    public void inputStudents() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter information for student " + (i + 1) + ":");
            Student student = new Student();
            student.enterStudentInfo();
            students.add(student);
        }
    }

    
    public void displayAllStudents() throws ParseException {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }
        for (Student student : students) {
            student.displayStudentInfo();
            System.out.println("-------------------");
        }
    }

    
    public void searchStudentById(String id) throws ParseException {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Student found:");
                student.displayStudentInfo();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    
    public void deleteStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                System.out.println("Student with ID " + id + " has been removed.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    
    public void editStudentById(String id) throws ParseException {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Editing information for student with ID " + id + ":");
                student.enterStudentInfo();
                System.out.println("Information updated successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}

