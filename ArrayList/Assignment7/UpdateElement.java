
package java_cmu.ArrayList.Assignment7;

import java.util.ArrayList;

public class UpdateElement {
    public static void update(){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1 ; i <= 5 ;i++){
            numbers.add(i);
        }
        System.out.print("Array before update: ");
        for(int i : numbers){
            System.out.print(i + ", ");
        }
        System.out.println(numbers.set(3, 100));
        System.out.print("Array after update: ");
        for(int i : numbers){
            System.out.print(i + ", ");
        }
    }
    public static void main(String[] args) {
        UpdateElement.update();
    }
}
