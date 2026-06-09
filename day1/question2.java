// write a program to print multiplication table of a given number 
import java.util.Scanner;

public class question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            a = n * i;
            System.out.println(n + "*" + i + "=" + a );
        }
           sc.close();
    }
}
