// write a program to move zeros to end 

package day15;
import java.util.Scanner;

public class question60 {
    public static void moveZeroes(int numbers[]) {
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[index] = numbers[i];
                index++;
          }
        }
        while (index < numbers.length) {
            numbers[index] = 0;
            index++;
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
        moveZeroes(numbers);
        System.out.print("Array after moving zeroes : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        sc.close();
   }
}
