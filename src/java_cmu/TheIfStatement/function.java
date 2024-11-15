
package java_cmu.TheIfStatement;
import java.util.Scanner;
public class function {
        public static int findMaxNumber(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = scanner.nextInt();
            System.out.println("Enter b: ");
            int b = scanner.nextInt();
            if (a > b){
                return a;
            }
            return b;
        }
    public static void main(String[] args) {
        
        int max = findMaxNumber();
        System.out.println("Max = " + max);
    }
}
