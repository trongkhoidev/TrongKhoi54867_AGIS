
package java_cmu.ArrayList.Assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ConverseList {
    public static void converse(){
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0 ; i < 5 ;i++){
            int tmp = rand.nextInt(10) ;
            numbers.add(tmp);
        }
        Arrays.toString(numbers.toArray());
        System.out.print("Elements of Array: ");
        for(int i : numbers){
            System.out.print(i + ", ");
        }
    }
    public static void main(String[] args) {
        ConverseList.converse();
    }
}
