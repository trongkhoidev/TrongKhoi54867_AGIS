package java_cmu.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Weather {

    public static void printTemprature() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days' tempratures: ");
        int day = sc.nextInt();
        int[] wt = new int[day];
        float avg = 0;
        for (int i = 0; i < wt.length; i++) {
            System.out.println("Enter temprature " + (i + 1) + ": ");
            wt[i] = sc.nextInt();
            avg += wt[i];
        }
        avg = avg / wt.length;
        int temp = 0;
        for (int i = 0; i < wt.length; i++) {
            if (wt[i] > avg) {
                temp++;
            }
        }
        System.out.println(temp + " days were above average");
    }

    public static void main(String[] args) {
        Weather.printTemprature();
    }
}
