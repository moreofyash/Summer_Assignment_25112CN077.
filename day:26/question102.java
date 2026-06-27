// write a program to create voting eligibility system

package day26;
import java.util.Scanner;

public class question102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age < 0){
            System.out.println("Age cannot be negative, Enter a proper age ");
        }else if(age >= 18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
        sc.close();
    }
}
