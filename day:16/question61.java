// write a program to find missing number in array

package day16;
import java.util.Scanner;

public class question61 {

    public static int missingnumber(int arr[] , int n){
        int expectedSum = n * ( n + 1) / 2;
        int actualSum = 0;
        for(int i = 0; i < arr.length; i++){
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of array from 1 to ");
        int n = sc.nextInt();
        System.out.print("Enter your elements : ");
        int arr[] = new int[n-1];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing number : "+ missingnumber(arr, n));
        sc.close();
    }
}
