// write a program to convert decimal to binary

package day6;
import java.util.Scanner;

public class question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();
        String binary = "";
        if(n < 0){
            System.out.println("Binary conversion is not supported for negative number");
        }else if(n == 0){
            System.out.println("Binary = 0");
        }else{
              while (n > 0) {
                binary = (n % 2) + binary;
                n = n / 2;
            }
            System.out.println("Binary = " + binary);  
        }
        sc.close();
    }
}
