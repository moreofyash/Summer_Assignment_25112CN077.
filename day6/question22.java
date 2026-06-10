// write a program to convert binary to decimal 

package day6;
import java.util.Scanner;

public class question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();

        if (binary < 0) {
            System.out.println("Invalid binary number");
        } 
        else if (binary == 0) {
            System.out.println("Decimal = 0");
        }else{
                int decimal = 0;
            int power = 0;

            while (binary > 0) {
                int digit = binary % 10;
                decimal += digit * (1 << power);
                power++;
                binary /= 10;
            }
            System.out.println("Decimal = " + decimal);
        }
        
        sc.close();
    }
}
