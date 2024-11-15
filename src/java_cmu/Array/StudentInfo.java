package java_cmu.Array;
import java.util.Scanner;

public class StudentInfo {
    public static void enterInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity of Students: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] fieldInfo = {"ID: ", "fullName: ", "Class: ","Address: ", "Gender: ", "Phone: "};

        String[][] info = new String[n][6];
        for(int i = 0 ; i < info.length ; i++){
            System.out.println("Enter info for Student " + (i+1) + ": ");
            System.out.println("Enter the information in order (ID, fullName, Class, Address, Gender, Phone): ");
            for (int j = 0 ; j < info[i].length ; j++){
                System.out.print(fieldInfo[j]);
                info[i][j] = sc.nextLine();
            }
        }

        System.out.println("\nDisplaying Information of Students:");
        for(int i = 0 ; i < info.length ; i++){
            System.out.println("Info for Student " + (i+1) + ": ");
            for (int j = 0 ; j < info[i].length ; j++){
                System.out.print(fieldInfo[j]);
                System.out.println(info[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StudentInfo.enterInfo();
    }
}
