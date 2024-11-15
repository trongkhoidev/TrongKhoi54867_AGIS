package java_cmu.ScannerInfoStu;

import java.util.Scanner;

public class tas1_31_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //syntax:variable = next + datatype(). Ex: nextByte(), nextShort(), nextInt(), nextLine(),...
        System.out.println("Enter an integer number: ");
        int number = scanner.nextInt();
        System.out.println("Enter a boolean: ");
        boolean value = scanner.nextBoolean();
        System.out.println("Enter a string: ");
        String word = scanner.next();
        
        scanner.nextLine();
        
        
        System.out.println("Enter a chain: ");
        String chain = scanner.nextLine();
        System.out.println("Number have just entered: " + number);
        System.out.println("Boolean have just entered: " + value);
        System.out.println("Word have just entered: " + word);
        System.out.println("Chain have just entered: " + chain);


    }

}
