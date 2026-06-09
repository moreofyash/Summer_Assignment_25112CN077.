//write a program to check whether the number is palindrome

package day2;
import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int n = num;
        int rev = 0;

        if(n < 0){
        System.out.println(n + " is not palindrome");
        }else{
            while(num != 0){
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
           }

        if(n == rev){
            System.out.println(n + " is palindrome");
        }else{
            System.out.println(n + " is not palindrome");
           }
        }
        sc.close();
    }
