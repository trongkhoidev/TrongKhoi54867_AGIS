package java_cmu.ArrayList.Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class Friends {
    public static void createFriend(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> friends = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++){
            System.out.print("Enter name: ");
            String names = sc.nextLine();
            friends.add(names);
        }
        System.out.print("List my friends: ");
        for(String name: friends){
            System.out.print(name + ", ");
        }
    }
    public static void main(String[] args) {
        Friends.createFriend();
    }
}
