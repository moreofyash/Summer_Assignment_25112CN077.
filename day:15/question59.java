// write a program to rotate array right 

package day15;
import java.util.Scanner;

public class question59 {

    public static void rightrotate(int numbers[]){
        int last = numbers[numbers.length - 1];
       for(int i = numbers.length - 1; i > 0; i--){
        numbers[i] = numbers[i - 1];
       }
        numbers[0] = last;
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
        rightrotate(numbers);
        System.out.print("Array after rotating right : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        sc.close();
    }
}
