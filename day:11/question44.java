// write a program to write function to find factorial

package day11;
import java.util.Scanner;

public class question44 {
    public static long fact(int n){

        long fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Invalid input");
        }else{
            long fact = fact(n);
            System.out.println("factorial of "+ n +" = "+ fact);
        }
        sc.close();
    }
}
