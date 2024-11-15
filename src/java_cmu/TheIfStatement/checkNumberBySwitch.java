package java_cmu.TheIfStatement;

import java.util.Scanner;
public class checkNumberBySwitch {
    public static void checkNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n( 0->9 ): ");
        int n = sc.nextInt();
        switch(n){
            case 2, 3, 5, 7:
                System.out.println("n = " + n + " is prime number");
                break;
            case 0, 1, 4, 6, 8, 9:
                System.out.println("n = " + n + " is not prime number");
                break;
            default:
                System.out.println("n is invalid!!!");
        }
    }
    public static void loopCheckNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n( 0->9 ): ");
        int n = sc.nextInt();
        for(int i = 2 ; i <= 9 ; i++){
             if (n == 1 || n == 0){
                System.out.println("n = " + n + " is not prime number");
                return;
            }
            if (n == 2){
                System.out.println("n = " + n + " is prime number");
                return;
            }
            else if (n % i == 0 && n != i){
                System.out.println("n = " + n + " is not prime number");
                return;
            }
        }
        System.out.println("n = " + n + " is prime number");
    }
    public static void main(String[] args) {
        //checkNumberBySwitch.checkNumber();
        checkNumberBySwitch.loopCheckNumber();
    }
}
