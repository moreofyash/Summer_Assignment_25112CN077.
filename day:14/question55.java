// write a program to second largest element

package day14;
import java.util.Scanner;

public class question55 {

    public static int secondlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largest) {
                secondlargest = largest;
                largest = numbers[i];
            }
            else if(numbers[i] > secondlargest && numbers[i] != largest) {
                secondlargest = numbers[i];
            }
        }
        return secondlargest;
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
        int result = secondlargest(numbers);
        if( result == Integer.MIN_VALUE){
            System.out.println("There is no second largest number");
        }else{
        System.out.println("Second Largest Element : "+result);
        }
        sc.close();
    }
}
