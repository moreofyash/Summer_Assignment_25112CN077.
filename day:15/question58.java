// write a program to rotate array left 

package day15;
import java.util.Scanner;

public class question58 {

    public static void leftrotate(int numbers[]){
        int first = numbers[0];
        for(int i = 0; i < numbers.length - 1; i++){
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length - 1] = first;
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
        leftrotate(numbers);
        System.out.print("Array after rotating left : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        sc.close();
    }
}
