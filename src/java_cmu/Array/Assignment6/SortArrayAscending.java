
package java_cmu.Array.Assignment6;

import java.util.Scanner;
public class SortArrayAscending {
    public static void sortAscending(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity element: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println();
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("Enter value element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Array before sort: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + ", ");
        }
        
        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = 0 ; j < n - 1 - i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Array after sort: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        SortArrayAscending.sortAscending();
    }
    
}
