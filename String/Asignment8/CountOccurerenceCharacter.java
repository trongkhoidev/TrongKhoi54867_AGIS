package java_cmu.String.Asignment8;

import java.util.Scanner;

public class CountOccurerenceCharacter {

    public static void countOccurence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter a character: ");
        String x = sc.next();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x.charAt(0)) {
                count++;
            }
        }
        System.out.println("Count the occurrences of '" + x + "' in a string: " + count);
    }

    public static void main(String[] args) {
        CountOccurerenceCharacter.countOccurence();
    }
}
