// write a program to count words in a sentence

package day22;
import java.util.Scanner;

public class question86 {
    public static int countWords(String str) {
        int count = 0;
        if(str.length() == 0) {
            return 0;
        }
        count = 1;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        System.out.println("Number of words = " + countWords(str));
        sc.close();
    }
}
