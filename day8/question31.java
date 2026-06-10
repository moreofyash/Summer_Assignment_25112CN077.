// write a program to print character triangle 

package day8;
import java.util.Scanner;

public class question31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of triangle : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 65; j < 65 + i; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
        sc.close();
    }
}
