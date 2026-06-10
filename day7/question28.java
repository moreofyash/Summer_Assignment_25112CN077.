// write a program to recursive reverse number 

package day7;
import java.util.Scanner;

public class question28 {
    static int reverseNumber(int n , int rev) {
        if (n == 0) {
            return rev;
        }
        return reverseNumber(n / 10,rev * 10 + n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Negative numbers not supported");
        } else {
            System.out.println("Reversed Number = " + reverseNumber(n, 0));
        }
        sc.close();
    }
}
