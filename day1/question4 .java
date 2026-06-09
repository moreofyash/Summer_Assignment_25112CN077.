// write a program to count digits in a number
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        if(n == 0){
            System.out.print("The number of digits in given number is 1");
        }else{
            n = Math.abs(n);
            while(n != 0){
            n /= 10;
            count++;
            }
            System.out.println("The number of digits in given number is : "+ count);   
        }
        sc.close();
    }
}
