// write a program to find LCM of two numbers

package day3;
import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        int max;
        if(n1 == 0 || n2 == 0){
            System.out.println("LCM = 0");
        }else{
            max = Math.max(n1, n2);
        while(true){
            if(max % n1 == 0 && max % n2 == 0){
                System.out.println("LCM = "+max);
                break;
            }
            max++;
           }
        }
        sc.close();
    }   
}
