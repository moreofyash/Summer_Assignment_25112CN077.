// write a program to frequency of an element 

package day14;
import java.util.Scanner;

public class question54 {
    public static int frequency(int numbers[] , int key){
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                count++;
            }
        }
        return count;
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
        System.out.print("Enter Element : ");
        int key = sc.nextInt();
        System.out.println("Frequency : "+frequency(numbers, key));
        
        sc.close();
   }
}
