package OOP.Assignment9;

import java.text.ParseException;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) throws ParseException {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("====== Student Management Menu ======");
            System.out.println("1. Input student information");
            System.out.println("2. Display all students");
            System.out.println("3. Search student by ID");
            System.out.println("4. Delete student by ID");
            System.out.println("5. Edit student by ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    studentList.inputStudents();
                    break;
                case 2:
                    studentList.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter student ID to search: ");
                    String searchId = scanner.nextLine();
                    studentList.searchStudentById(searchId);
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    studentList.deleteStudentById(deleteId);
                    break;
                case 5:
                    System.out.print("Enter student ID to edit: ");
                    String editId = scanner.nextLine();
                    studentList.editStudentById(editId);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}