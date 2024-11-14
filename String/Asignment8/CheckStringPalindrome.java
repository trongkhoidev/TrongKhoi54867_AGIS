package java_cmu.String.Asignment8;

import java.util.Scanner;

public class CheckStringPalindrome {

    public static void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < (str.length() / 2); i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                check = true;
            }
        }
        if (check) {
            System.out.println("String is a palindrome ");
        } else {
            System.out.println("String is not a palindrome ");
        }
    }

    public static void main(String[] args) {
        CheckStringPalindrome.checkPalindrome();
    }
}
