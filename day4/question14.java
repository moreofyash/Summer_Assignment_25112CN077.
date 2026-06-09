// write a program to find nth fibonacci term

package day4;
import java.util.Scanner;

public class question14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number of term : ");
        int term = sc.nextInt();
        if(term <= 0){
            System.out.println("Invalid input, try again");
        }else if(term == 1){
            System.out.println("Nth fibonacci term : 0");
        }else if(term == 2){
            System.out.println("Nth fibonacci term : 1");
        }else{
            int firstterm = 0;
            int secondterm = 1;
            int nextterm = 0;
            for(int i = 3; i <= term; i++){
                nextterm = firstterm + secondterm;
                firstterm = secondterm;
                secondterm = nextterm;
            }
           System.out.println("Nth fibonacci term : "+ secondterm);
        }
        sc.close();
    }
}
