package OOP.Assignment9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {

    private String id;
    private String fullName;
    private Date dateOfBirth;
    private String major;
    private float gpa;

    Scanner sc = new Scanner(System.in);

    public Student() {
    }

    public Student(String id, String fullName, Date dateOfBirth, String major, float gpa) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
        this.gpa = gpa;
    }

    public void enterStudentInfo() throws ParseException {
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter Full Name: ");
        fullName = sc.nextLine();
        System.out.print("Enter BirthDate (dd/MM/yyyy): ");
        String inputDate = sc.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        formatter.setLenient(false);
        dateOfBirth = formatter.parse(inputDate);

        System.out.print("Enter major: ");
        major = sc.nextLine();
        System.out.print("Enter GPA: ");
        gpa = sc.nextFloat();
        sc.nextLine();
    }

    public void displayStudentInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(dateOfBirth);
        System.out.println("Information Student: ");
        System.out.println("ID: " + id + ", FullName: " + fullName + ", Date: " + formattedDate + ", Major: " + major + ", GPA: " + gpa);
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
