//write a program to find product of digits

package day2;
import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        n = Math.abs(n);
        int product = 1;
        if(n == 0){
            System.out.println("Product of given number is 0");
        }else{
            while(n != 0){
            int digit = n % 10;
            product = product * digit;
            n = n / 10;
           }
            System.out.println("Product of given number is : "+ product);
        }
        sc.close();
    }
