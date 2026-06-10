// write a program to print reverse number triangle 

package day9;
import java.util.Scanner;

public class question34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of triangle : ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
