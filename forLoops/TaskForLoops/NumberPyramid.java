package java_cmu.forLoops.TaskForLoops;

import java.util.Scanner;
public class NumberPyramid {
    public static void numberPyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity rows: ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ;i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        NumberPyramid.numberPyramid();
    }
}
