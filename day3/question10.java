// write a program to print prime number in range

package day3;
import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you range from 1 to ");
        int n = sc.nextInt();
        
        for(int i = 2; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j * j<= i; j++){
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }  
        }

        sc.close();
    }
}
