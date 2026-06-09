// write a program to check whether a number is prime

package day3;
import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        int prime = 0;
        if(n <= 1){
            System.out.println("The number is not prime");
        }else{
            for(int i = 2; i * i  <= n; i++){
            if(n % i == 0){
                prime = 1;
                break;
            }
        }

            if(prime == 0){
            System.out.println("The number is Prime");
            }else{
            System.out.println("The number is not prime");
           }
        }
        
        sc.close();
    }
}
