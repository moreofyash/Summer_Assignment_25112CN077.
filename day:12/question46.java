// write a program to write function for armstrong 

package day12;
import java.util.*;
public class question46 {

    public static boolean armstrong(int n){
        int temp = n;
        int pow = 0;
        while(temp > 0){
            pow++;
            temp /= 10;
        }
        temp = n;
        int sum = 0;
        while(temp > 0){
            int digit = temp % 10;
             sum +=(int)Math.pow(digit , pow);
             temp /= 10; 
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Negative numbers are not an armstrong number");
         }else{
            if(armstrong(n)){
            System.out.println(n + " is an armstrong number");
            }else{
            System.out.println(n + " is not an armstrong number");
            }
        }
        sc.close();
    }
}
