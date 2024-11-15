package java_cmu.forLoops;

public class FindPrimeNumbers {
    public static boolean primeNumber(int n){
        for (int i = 2 ; i < Math.sqrt(n) ; i++){
            if (n < 2) {
            return false;
            }
            if (n == 2){
                return true;
            }
            if (n % i == 0 ){
                return false;
            }
        }
        return true;
    }
    public static void findPrime(){
        for(int i = 1 ; i <= 100; i++){
            if(primeNumber(i)){
                System.out.print(i + ", ");
            }
        }
    }
    public static void main(String[] args) {
        FindPrimeNumbers.findPrime();
    }
}
