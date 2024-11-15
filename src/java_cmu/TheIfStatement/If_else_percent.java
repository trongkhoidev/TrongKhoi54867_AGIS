/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_cmu.TheIfStatement;

import java.util.Scanner;

public class If_else_percent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What percentage did you earn? : ");
        int percent = scanner.nextInt();

        if (percent >= 90) {
            System.out.println("You got an A!");
        } else if (percent >= 80) {
            System.out.println("You got a B!");
        } else if (percent >= 70) {
            System.out.println("You got a C!");
        } else if (percent >= 60) {
            System.out.println("You got a D!");
        } else {
            System.out.println("You got a F!");
        }
    }
}
