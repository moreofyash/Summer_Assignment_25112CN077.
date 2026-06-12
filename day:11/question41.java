// write a program to write function to find sum of two numbers

package day11;
import java.util.Scanner;

public class question41 {

    public static int sum(int a , int b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int a = sc.nextInt();
        System.out.print("Enter your second number : ");
        int b = sc.nextInt();
        int sum = sum(a , b);
        System.out.println("The sum of "+ a + " and "+ b + " is equal to : "+ sum);
        sc.close();
    }
}
