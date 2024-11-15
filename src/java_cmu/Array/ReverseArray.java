
package java_cmu.Array;
import java.util.Scanner;
public class ReverseArray {
    public static void reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("Enter value index " + i +": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("ARRAY after enter: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + ", ");
        }
        //reverse array
        for(int i = 0 ; i < arr.length/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }    
        //print
        System.out.println();
        System.out.print("ARRAY after reverse: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        ReverseArray.reverse();
    }
}
