
package java_cmu.Solve_Equations;

import java.util.Scanner;

public class Equation_1 {
    public static void equation1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: "); // nhap vao he so truoc x
        int a = scanner.nextInt();
        System.out.println("Enter b: "); // nhap vao he so tu do
        int b = scanner.nextInt();
        if (a==0){
            if(b==0) {
                System.out.println("Equation with infinite solutions"); //0x+0 = 0 
            }
            else{
                System.out.println("Equation with no solutions"); //0x + b =  0 
            }
        }
        else {
            System.out.println("x = " +(-b/(float)a));
        }
    }
    
    public static void main(String[] args) {
        equation1();
    }
}

