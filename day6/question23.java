// write a program to count set bits in a number 

package day6;
import java.util.Scanner;

public class question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            count += n % 2;
            n /= 2;
        }
        System.out.println("Set Bits = " + count);
        sc.close();
    }
}
