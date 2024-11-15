package java_cmu.String.Asignment8;

import java.util.Scanner;

public class FindLongestWord {

    public static void findLongestWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i <= str.length(); i++) {

            if (i == str.length() || str.charAt(i) == ' ') {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            } else {
                currentWord += str.charAt(i);
            }
        }

        System.out.println("The longest word is: " + longestWord);
    }

    public static void main(String[] args) {
        findLongestWord();
    }
}
