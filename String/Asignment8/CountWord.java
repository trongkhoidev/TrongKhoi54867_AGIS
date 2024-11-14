package java_cmu.String.Asignment8;

import java.util.Scanner;

public class CountWord {

    public static void countStr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        System.out.println("Quantity of Words: " + count);
    }

    public static void main(String[] args) {
        CountWord.countStr();
    }
}
