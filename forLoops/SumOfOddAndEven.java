
package java_cmu.forLoops;

public class SumOfOddAndEven {
    public static void sum(){
        int totalOdd = 0, totalEven = 0;
        for (int i = 1 ; i <= 100 ; i++){
            if (i % 2 == 0){
                totalEven += i;
            } else {
                totalOdd += i;
            }
        }
        System.out.println("Sum of Odd = " + totalOdd);
        System.out.println("Sum of Even = " + totalEven);
    }
    public static void main(String[] args) {
        SumOfOddAndEven.sum();
    }
}
