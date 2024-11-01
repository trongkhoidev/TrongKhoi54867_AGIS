
package java_cmu;

import java.text.DateFormat;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Locale;
public class task2_31_10 {
    public static void main(String[] args)  throws Exception  {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Enter your full name: ");
        System.out.println("String type? " + scanner.hasNext());
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        System.out.println("String type? " + scanner.hasNextInt());
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your sex: ");
        System.out.println("String type? " + scanner.hasNext());
        String sex = scanner.nextLine();
        System.out.println("Enter your major: ");
        System.out.println("String type? " + scanner.hasNext());
        String major = scanner.nextLine();
        System.out.println("Enter your GPA: ");
        System.out.println("String type? " + scanner.hasNextFloat());
        float GPA = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter your hometown: ");
        System.out.println("String type? " + scanner.hasNext());
        String hometown = scanner.nextLine();
        
        //BirthDate
        System.out.println("Enter your BirthDate (dd/MM/yyyy): ");
        String inputDate = scanner.nextLine();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        formatter.setLenient(false); 
        Date birthDate = formatter.parse(inputDate);
        
        System.out.println("Enter ");
  
        // Print
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
        System.out.println("Hometown: " + hometown);
        System.out.println("Date : " + formatter.format(birthDate));
    }
}
