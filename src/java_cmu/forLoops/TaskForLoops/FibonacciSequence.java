package java_cmu.forLoops.TaskForLoops;
import java.util.Scanner;

public class FibonacciSequence {
    public static void printFibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        int fi1 = 0;  
        int fi2 = 1; 
        
        if (n >= 1) {
            System.out.print(fi1 + ", "); 
        }
        
        if (n >= 2) {
            System.out.print(fi2 + ", ");  
        }
        
        for (int i = 3; i <= n; i++) {  
            int fi3 = fi1 + fi2; 
            System.out.print(fi3 + ", ");  
            fi1 = fi2; 
            fi2 = fi3;  
        }
    }

    public static void main(String[] args) {
        FibonacciSequence.printFibonacci();
    }
}
