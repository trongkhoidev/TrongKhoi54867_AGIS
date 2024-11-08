
package java_cmu.ArrayList.Assignment7;

import java.util.ArrayList;


public class RemoveElement {
    public static void removeElement(){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1 ; i <= 10 ; i++){
            numbers.add(i);
        }
        System.out.println(numbers.remove(Integer.valueOf(5)));
        for(int i : numbers){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        RemoveElement.removeElement();
    }
}
