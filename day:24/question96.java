// write a program to remove duplicate characters 

package day24;
import java.util.Scanner;

public class question96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            boolean duplicate = false;
            for(int j = 0; j < result.length(); j++) {
                if(str.charAt(i) == result.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) {
                result += str.charAt(i);
            }
        }
        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}
