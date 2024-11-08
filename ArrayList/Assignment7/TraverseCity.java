
package java_cmu.ArrayList.Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class TraverseCity {
    public static void traverse(){
        ArrayList<String> city = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 5 ; i++){
            System.out.print("Enter name city " + (i + 1) + ": ");
            String tmp = sc.nextLine();
            city.add(tmp);
        }
        System.out.print("List city: ");
        for(String name : city){
            System.out.print(name + ", ");
        }
    }
    public static void main(String[] args) {
        TraverseCity.traverse();
    }
}
