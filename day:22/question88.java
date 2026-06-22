// write a program to remove spaces from string 

package day22;
import java.util.Scanner;

public class question88 {
    public static String removeSpaces(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String after removing spaces: " + removeSpaces(str));
        sc.close();
    }
}
