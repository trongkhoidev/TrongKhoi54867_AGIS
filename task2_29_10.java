package java_cmu;

public class task2_29_10 {
    public static void main(String[] args) {
        double myGPA ;
        myGPA = 10 + 2.25;
        System.out.println("myGPA: " + myGPA);
        int x = 1;
        int y = x++ + --x + x + x-- + x++ + --x;//1 + 3+ 3 + 3 + 4 + 6
        System.out.println(y);
    }
}
