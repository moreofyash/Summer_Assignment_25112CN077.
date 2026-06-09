//write a program to find sum of digits of a number

package day2;
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int digit;
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        n = Math.abs(n);
        while(n != 0){
         digit = n % 10;
         sum += digit;
         n = n /10;
        }
        System.out.println("The sum of digits of given number is : " + sum);
        sc.close();
    }
}
