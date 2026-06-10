// write a program to find x^n without pow()

package day6;
import java.util.Scanner;

public class question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();
        System.out.print("Enter power (n): ");
        int n = sc.nextInt();
        long result = 1;

        if (n < 0) {
        System.out.println("Negative power not supported");
        } else if (n == 0) {
        System.out.println("Result = 1");
        } else {
        
        for (int i = 1; i <= n; i++) {
        result *= x;
        }

        System.out.println("Result = " + result);
        }
        sc.close();
    }
}
