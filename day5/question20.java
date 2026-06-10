// write a program to find largest prime factor

package day5;
import java.util.Scanner;

public class question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        if(n <= 1){
            System.out.println("No prime factor exists");
        }else{
             int largestPrimeFactor = -1;

              while (n % 2 == 0) {
                largestPrimeFactor = 2;
                n /= 2;
            } 
            for(int i = 3; i * i <= n; i += 2) {
                while(n % i == 0) {
                    largestPrimeFactor = i;
                    n /= i;
                }
            }
            if (n > 2) {
                largestPrimeFactor = n;
            }
            System.out.println("Largest Prime Factor = " + largestPrimeFactor);
        }
        sc.close();
    }
}
