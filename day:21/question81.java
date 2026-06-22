// write a program to find string length without strlen()

package day21;
import java.util.Scanner;

public class question81 {
    public static int strLength(String str){
        char ch[] = str.toCharArray();
        int count = 0;
        for (int i = 0;i < ch.length; i++) {
            count++;
        }
        return count;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Length = " + strLength(str));
        sc.close();
    }
}
