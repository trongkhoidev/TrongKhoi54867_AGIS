
package java_cmu.Array.Assignment6;
import java.util.Scanner;
public class FindLargestAndSmallest {
    public static void findMaxMin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity element:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("Enter value index " + i + ":");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Largest of Array: " + max);
        System.out.println("Smallest of Array: " + min);
    }
    public static void main(String[] args) {
        FindLargestAndSmallest.findMaxMin();
    }
}
