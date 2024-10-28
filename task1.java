/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_cmu;

/**
 *
 * @author Trong Khoi dev
 */
import java.util.Scanner;
public class Java_CMU {

    /**
     * @param args the command line arguments
     */
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
