
package java_cmu.forLoops;
import java.util.Scanner;
public class SumofDigits {
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int tmp = n % 10;
            sum += tmp;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
    public static void main(String[] args) {
        SumofDigits.sum();
    }
}
