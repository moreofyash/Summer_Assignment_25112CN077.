// write a program to write function for palindrome

package day12;
import java.util.*;
public class question45 {

    public static int palindrome(int n){
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = rev*10 + digit;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        if(n < 0){
        System.out.println("Negative numbers are not palindrome");
        }else{
            int rev = palindrome(n);
            if(n == rev){
            System.out.println(n+ " is palindrome");
            }else{
            System.out.println(n+ " is not palindrome");
                }
            }
        sc.close();
    }
}
