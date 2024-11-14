package java_cmu.String.Asignment8;

import java.util.Scanner;

public class ReverseString {

    public static void reverseStr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String before reverse: " + str);
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        System.out.println("String after reverse: " + str1);
    }

    public static void main(String[] args) {
        ReverseString.reverseStr();
    }
}
