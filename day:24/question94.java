// write a program to compress a string 

package day24;
import java.util.Scanner;

public class question94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = sc.nextLine();
        String compressed = "";
        for(int i = 0; i < str.length(); i++){
            int count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt( i + 1)){
                count++;
                i++;
            }
            compressed += str.charAt(i);
            compressed += count;
        }
        System.out.println("Compressed String : "+ compressed);
        sc.close();
    }
}
