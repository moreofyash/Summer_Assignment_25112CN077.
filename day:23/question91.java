// write a program to check anagram strings

package day23;
import java.util.*;

public class question91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        if(str1.length() != str2.length()) {
            System.out.println("Not Anagram");
        }else{
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1, ch2)) {
                System.out.println("Anagram");
            }else {
                System.out.println("Not Anagram");
            }
        }
        sc.close();
    }
}
