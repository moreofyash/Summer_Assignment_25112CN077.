// write a program to check palindrome string 

package day22;
import java.util.Scanner;

public class question85 {
     public static boolean isPalindrome(String str) {
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if(isPalindrome(str)) {
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not a Palindrome String");
        }
        sc.close();
    }
}
