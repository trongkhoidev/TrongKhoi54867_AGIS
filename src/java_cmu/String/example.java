
package java_cmu.String;
public class example {
    public static void main(String[] args) {
        String str1 = new String("Hello Java"); 
        String str2 = "Hello Java"; 
        String str3 = str2.intern(); 
        System.out.println("str1 == str2 " + (str1 == str2)); System.out.println("str1 == str3 " + (str1 == str3)); System.out.println("str2 == str3 " + (str2 == str3)); } 

    
            
}
