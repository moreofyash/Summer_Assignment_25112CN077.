// write a program to find pair with given sum 

package day16;
import java.util.Scanner;

public class question63 {
    public static void findPair(int arr[], int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " " + arr[j]);
                    found = true;
             }
          }
        }
        if (!found) {
            System.out.println("No pair found");
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
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        findPair(numbers, target);
        sc.close();
    }
}
