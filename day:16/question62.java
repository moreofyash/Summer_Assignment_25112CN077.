// write a program to find maximum frequency element

package day16;
import java.util.Scanner;

public class question62 {

    public static int maxfrequency(int numbers[]){
        int maxcount = 0;
        int element = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                    count++;
                }
            }
            if(count > maxcount){
                    maxcount = count;
                    element = numbers[i];
                }
        }
        return element;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter your elements : ");
        int numbers[] = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Maximum frequency element : "+maxfrequency(numbers));
        sc.close();
    }
}
