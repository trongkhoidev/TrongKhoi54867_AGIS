package java_cmu.SolveEquations;

import java.util.Scanner;
public class Equation_2 {
    public static void equation2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();
        
        float denta = b*b - 4*a*c;
        if (denta > 0) { // phuong trinh co 2 nghiem phan biet
            System.out.println("x1 = " + ((-b - Math.sqrt(denta))/(2*a)));
            System.out.println("x2 = " + ((-b + Math.sqrt(denta))/(2*a)));
        } else if (denta == 0){ // phuong trinh co nghiem kep
            System.out.println("x1 = x2 = " + (-b/(float)2*a));
        }
        else { // denta < 0 => phuong trinh vo nghiem
            System.out.println("Equation with no solutions");
        }
    }
    
    public static void main(String[] args) {
        equation2();
    }
    
}
