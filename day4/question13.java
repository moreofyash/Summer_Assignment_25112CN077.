// write a program to generate fibonacci series

package day4;
import java.util.Scanner;

public class question13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms in your series : ");
        int term = sc.nextInt();
        int firstterm = 0;
        int secondterm = 1;

        if(term <= 0){
            System.out.println("Invalid input, try again");
        }else{
            System.out.print("Fibonacci series : ");
            for(int i = 1; i <= term; i++){
            System.out.print(firstterm + " ");
            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
            }
        }
        sc.close();
    }
}
