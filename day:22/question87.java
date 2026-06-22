// write a program to character frequency 

package day22;
import java.util.Scanner;

public class question87 {
    public static int characterFrequency(String str, char target) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to find frequency: ");
        char ch = sc.next().charAt(0);
        System.out.println("Frequency of '" + ch + "' = " + characterFrequency(str, ch));
        sc.close();
    }
}
