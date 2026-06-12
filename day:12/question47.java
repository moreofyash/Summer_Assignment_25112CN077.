// write a program to write function for fibonacci

package day12;
import java.util.*;
public class question47 {

    public static void fibonacci(int n){
        int firstterm = 0;
        int secondterm = 1;
        if(n <= 0){
            System.out.println("Invalid input, try again");
            return;
        }else{
            System.out.print("Fibonacci series : ");
            for(int i = 1; i <= n; i++){
                System.out.print(firstterm + " ");
                int nextterm = firstterm + secondterm;
                firstterm = secondterm;
                secondterm = nextterm;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }
}
