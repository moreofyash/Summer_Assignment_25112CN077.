// write a program to covert lowercase to uppercase

package day21;
import java.util.Scanner;

public class question84 {
     public static String toUpper(String str) {
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char)(ch[i] - 32);
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Uppercase String: " + toUpper(str));
        sc.close();
    }
}
