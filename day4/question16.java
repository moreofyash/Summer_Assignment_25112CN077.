// write a program to print armstrongs number in a range

package day4;
import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your range's start: ");
        int start = sc.nextInt();

        System.out.print("Enter your range's end: ");
        int end = sc.nextInt();

        System.out.println("The Armstrong Numbers are : ");

        for (int i = start; i <= end; i++) {
            if(i < 0){
                continue;
            }
            int temp = i;
            int digits = 0;
            int sum = 0;

            int t = temp;
            if (t == 0) digits = 1;
            while (t > 0) {
                digits++;
                t /= 10;
            }

            t = temp;

            while (t > 0) {
                int digit = t % 10;
                sum += (int) Math.pow(digit, digits);
                t /= 10;
            }

            if (sum == i)
                System.out.print(i + " ");
        }
        sc.close();
    }
}
