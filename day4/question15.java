// write a program to check armstrong number

package day4;
import java.util.Scanner;

public class question15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();

        if(n < 0){
            System.out.println("Negative numbers are not armstrong numbers");
        }else if(n == 0){
            System.out.println("0 is an armstrong number");
        }else{
            int num = n;
        int temp = n;
        int digits = 0;
        int sum = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int)Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == num)
            System.out.println(n + " is an Armstrong Number");
        else
            System.out.println(n + " is not an Armstrong Number");
        }
        sc.close();
    }
}
