//write a program to calculate sum of first N natural numbers 
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }
}
