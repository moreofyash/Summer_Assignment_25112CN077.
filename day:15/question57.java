// write a program to reverse array

package day15;
import java.util.Scanner;

public class question57 {

    public static void reverse(int numbers[]){
        int first = 0; int last = numbers.length - 1;
        while(first < last){
            int temp = numbers[last];
            numbers[last] =numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
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
        reverse(numbers);
        System.out.print("reverse of array : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        sc.close();
    }
}
