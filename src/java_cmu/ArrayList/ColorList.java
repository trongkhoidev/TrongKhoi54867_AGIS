
package java_cmu.ArrayList;

import java.util.ArrayList;

public class ColorList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("White");
        for(int i = 0 ; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }
        System.out.println();
        for(String color : colors){
            System.out.println(color);
        }
    }
}
