
package java_cmu.Array.Assignment5;
import java.util.Scanner;
public class CountTheOccurences {
    public static void countOccurence(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity element: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print("Enter value index " + i +": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a random number:  ");
        int x = sc.nextInt();
        int k = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == x){
                k++;
            }
        }
        System.out.println("Number of times " + x + " appears in Array: " + k);
    }
    public static void main(String[] args) {
        CountTheOccurences.countOccurence();
    }
}
