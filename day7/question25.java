// write a program to recursive factorial 

package day7;
import java.util.Scanner;

public class question25 {
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Factorial not defined for negative numbers");
        }else{
            long result = factorial(n);
            System.out.println("Factorial = "+ result);
        }
        sc.close();
    }
}
