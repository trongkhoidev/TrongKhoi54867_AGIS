
package java_cmu.ArrayList.Assignment7;
import java.util.ArrayList;
public class SortList {
     public static void sort() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);
        System.out.print("Array before sort: ");
        for(int i : numbers){
            System.out.print(i + ", ");
        }  
        int n = numbers.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
         System.out.println();
        System.out.print("Array after sort: ");
        for(int i : numbers){
            System.out.print(i + ", ");
        }  
    }
     public static void main(String[] args) {
        SortList.sort();
    }
}
