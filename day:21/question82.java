// write a program to reverse a string

package day21;
import java.util.Scanner;

public class question82 {
     public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Reversed string: " + reverseString(str));
        sc.close();
    }
}
