// write a program to check string rotation

package day24;
import java.util.Scanner;

public class question93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        if(str1.length() != str2.length()){
            System.out.println("Rotation not possible");
        }else{
            String temp = str1 + str1;
            if(temp.contains(str2)){
                System.out.println("Rotation");
            }else{
                System.out.println("Not a Rotation");
            }
        }
        sc.close();
    }
}
