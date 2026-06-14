// write a program to find largest and smallest element 

package day13;
import java.util.Scanner;

public class question51 {
    public static int max(int numbers[]){
        int max = Integer.MIN_VALUE ;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }

    public static int min(int numbers[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Array is empty");
        }else{
                System.out.print("Enter your elements : ");
            int numbers[] = new int[n];
            for(int i = 0; i < n; i++){
                numbers[i] = sc.nextInt();
            }
            System.out.println("max : "+ max(numbers));
            System.out.println("Min : " + min(numbers));
        }
        sc.close();
    }
}
