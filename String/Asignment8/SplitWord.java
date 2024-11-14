package java_cmu.String.Asignment8;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitWord {

    public static void splitStr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();

        int x = 0;
        while (x < str.length()) {

            while (x < str.length() && str.charAt(x) == ' ') {
                x++;
            }

            int start = x;
            while (x < str.length() && str.charAt(x) != ' ') {
                x++;
            }

            if (start < x) {
                arr.add(str.substring(start, x));
            }
        }

        System.out.println(arr);
    }

    public static void main(String[] args) {
        SplitWord.splitStr();
    }
}
