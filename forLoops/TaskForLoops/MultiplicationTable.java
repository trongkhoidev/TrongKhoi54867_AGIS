
package java_cmu.forLoops.TaskForLoops;

public class MultiplicationTable {
    public static void mutiplicationTable(){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("Multiplication table of " + i);
            for(int j = 1 ; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
    public static void main(String[] args) {
        MultiplicationTable.mutiplicationTable();
   }
}
