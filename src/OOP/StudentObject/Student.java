package OOP.StudentObject;

public class Student {

    int ID;
    String name;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    void displayInformation() {
        System.out.println("ID: " + ID + ", Name: " + name);
    }
}
