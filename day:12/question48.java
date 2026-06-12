// write a program to write function for perfect number 

package day12;
import java.util.Scanner;
public class question48 {

    public static int perfectnum(int n){
        int sum = 0;
            for(int i = 1; i <= n/2; i++){
                if(n % i == 0){
                    sum += i;
                }
            }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Invalid input");
        }else{
            if(perfectnum(n) == n){
                System.out.println(n + " is a perfect number");
            }else{
                System.out.println(n + " is not a perfect number");
            }
        }
        sc.close();
    }
}
