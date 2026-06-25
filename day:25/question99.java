// write a program to sort names alphabetically

package day25;
import java.util.Scanner;

public class question99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        System.out.println("Enter names:");
        for(int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                if(names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        System.out.println("Names in alphabetical order:");
        for(String name : names) {
            System.out.println(name);
        }
        sc.close();
    }
}
