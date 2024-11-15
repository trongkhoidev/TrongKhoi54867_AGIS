package java_cmu.TheIfStatement;

import java.util.Scanner;

public class checkQuadrant {

    public static void quadrant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        float x = scanner.nextFloat();
        System.out.println("Enter y: ");
        float y = scanner.nextFloat();
        System.out.println("A(x;y) = (" + x + "," + y + ")");
        if (x == 0 && y == 0) {
            System.out.println("A = O(0;0)");
        } else if (x > 0) {
            if (y > 0) {
                System.out.println("A belongs to quandrant 1");
            } else {
                System.out.println("A belongs to quandrant 4");
            }
        } else if (x < 0) {
            if (y > 0) {
                System.out.println("A belongs to quandrant 2");
            } else {
                System.out.println("A belongs to quandrant 3");
            }
        }
    }

    public static void main(String[] args) {
        checkQuadrant.quadrant();
    }

}
