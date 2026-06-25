// write a program to find first repeating character 

package day23;
import java.util.Scanner;

public class question90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++) {
            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if(count > 1) {
                System.out.println("First repeating character: " + str.charAt(i));
                sc.close();
                return;
            }
        }
        System.out.println("No repeating character found.");
        sc.close();
    }
}
