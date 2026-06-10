// write a program to recursive fibonacci

package day7;
import java.util.Scanner;

public class question26 {
    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid input");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
        sc.close();
    }
}
