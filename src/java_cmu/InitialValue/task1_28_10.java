package java_cmu.InitialValue;

import java.util.ArrayList;
import java.util.Scanner;

public class task1_28_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        String myClass;
        String myName;
        int myId;

        System.out.println("Enter your Class: ");
        myClass = scanner.nextLine();
        System.out.println("Enter your Name: ");
        myName = scanner.nextLine();
        System.out.println("Enter your ID: ");
        myId = scanner.nextInt();

        scanner.close();

        System.out.println("CLass: " + myClass);
        System.out.println("Name: " + myName);
        System.out.println("ID: " + myId);
    }
}
