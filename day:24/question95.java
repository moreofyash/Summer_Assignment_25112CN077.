// write a program to find longest word

package day24;
import java.util.Scanner;

public class question95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String longest = words[0];
        for(int i = 1; i < words.length; i++) {
            if(words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        System.out.println("Longest word: " + longest);
        sc.close();
    }
}
