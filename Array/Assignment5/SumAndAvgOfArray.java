
package java_cmu.Array.Assignment5;
import java.util.Scanner;
public class SumAndAvgOfArray {
    public static void calculateSumAndAvg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity element: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("Enter value index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        float avg = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum+=arr[i];
        }
        avg = (float)sum/arr.length;
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + avg);
    }
    public static void main(String[] args) {
        SumAndAvgOfArray.calculateSumAndAvg();
    }
}
