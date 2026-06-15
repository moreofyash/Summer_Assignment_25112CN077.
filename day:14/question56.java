// write a program to find duplicates in array 

package day14;
import java.util.Scanner;

public class question56 {

    public static void duplicate(int numbers[]){
        int n = numbers.length;
        for(int i = 0; i < n; i++) {
        boolean alreadyPrinted = false;

        for(int k = 0; k < i; k++) {
            if(numbers[i] == numbers[k]) {
                alreadyPrinted = true;
                break;
            }
        }
        if(alreadyPrinted) {
            continue;
        }
        for(int j = i + 1; j < n; j++) {
            if(numbers[i] == numbers[j]) {
                System.out.println("Duplicate element : " + numbers[i]);
                break;
            }
        }
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
        duplicate(numbers);
        sc.close();
    }
}
