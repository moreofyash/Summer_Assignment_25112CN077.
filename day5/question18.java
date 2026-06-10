// write a program to check strong number 

package day5;
import java.util.Scanner;

public class question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number : ");
        int n = sc.nextInt();
        int sum = 0;
        int num = n;

        if (n < 0) {
            System.out.println("Negative numbers are not Strong numbers");
        }else{
            while(n > 0){
            int digit = n % 10;
            int fact = 1;
            for(int i = 1; i <= digit; i++){
                fact *= i;
            }
            sum += fact;
            n = n/10;
           }
           if(sum == num){
            System.out.println(num +" is an strong number");
           }else{
            System.out.println(num +" is not a strong number");
           }
        }
        sc.close();
    }
}
