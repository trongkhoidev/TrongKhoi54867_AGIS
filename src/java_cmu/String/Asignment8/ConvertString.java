package java_cmu.String.Asignment8;

import java.util.Scanner;

public class ConvertString {

    public static void convertStr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        

        System.out.println("Converted string: " + result.toString());
    }

    public static void main(String[] args) {
        ConvertString.convertStr();
    }
}
