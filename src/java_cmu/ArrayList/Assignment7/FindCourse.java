
package java_cmu.ArrayList.Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class FindCourse {
    public static void findCourse(){
        ArrayList<String> course = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity course: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter quantity course: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter name course " + (i + 1) + ": ");
            String tmp = sc.nextLine();
            course.add(tmp);
        }
        for(String name : course){
            if("Python".equals(name)){
                System.out.println("Course Python have in Courses");
                return ;
            }
        }
        System.out.println("Course Python have not in Courses");
    }
    public static void main(String[] args) {
        FindCourse.findCourse();
    }
}
