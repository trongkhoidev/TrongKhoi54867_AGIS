package java_cmu.forLoops.TaskForLoops;
import java.util.*;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void numberGuessing(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n = rand.nextInt(50);
        int guessNumber;
        do{
            System.out.println("Enter your numer: ");
            guessNumber = sc.nextInt();
            
            if (n > guessNumber) {
                System.out.println("Your number is lower");
            }else {
                System.out.println("Your number is higher");
            }
        }while(n != guessNumber);
        System.out.println("YOU WIN");
    }
    public static void main(String[] args) {
        NumberGuessingGame.numberGuessing();
    }
            
}
