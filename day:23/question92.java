// write a program to find maximum occuring character 

package day23;
import java.util.Scanner;

public class question92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int maxCount = 0;
        char maxChar = ' ';
        for(int i = 0; i < str.length(); i++) {
            int count = 0;

            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }
        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
        sc.close();
    }
}
