// write a program to find sum and average of array

package day13;
import java.util.Scanner;

public class question50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter your elements : ");
        int array[] = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        float sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Sum of array : " + sum);
        if(n == 0){
            System.out.println("Array is empty");
        }else{
            float average = sum / n;
            System.out.println("Average of array : "+ average);
        }
        sc.close();
    }
}
