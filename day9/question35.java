// write a program to print repeated character pattern 

package day9;
import java.util.Scanner;

public class question35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of triangle : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print((char)(i + 64));
            }
            System.out.println();
        }
        sc.close();
    }
}
