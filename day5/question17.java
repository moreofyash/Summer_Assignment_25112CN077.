// write a program to check perfect number

package day5;
import java.util.Scanner;

public class question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        int sum = 0;

        if (n <= 1) {
            System.out.println("Not a perfect number");
        }else{
                for(int i = 1; i <= n / 2 ; i++){
                if(n % i == 0){
                    sum += i;
                }
            }
            if(sum == n){
                System.out.println("The given number is a perfect number");
            }else{
                System.out.println("The given number is not a perfect number");
            }
        }
        sc.close();
    }
}
