package java_cmu.String.Asignment8;

import java.util.Scanner;

public class RemoveSpace {

    public static void removeSpace() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String before removing spaces: " + str);
        int start = 0;
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        int end = str.length() - 1;
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        if (start <= end) {
            str = str.substring(start, end + 1);
        } else {
            str = "";
        }

        System.out.println("String  after removing spaces: " + str);
    }

    public static void main(String[] args) {
        RemoveSpace.removeSpace();
    }
}
