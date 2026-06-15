// write a program to linear search 

package day14;
import java.util.Scanner;

public class question53 {

    public static int search(int numbers[] , int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
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
        System.out.print("Enter Element to be search : ");
        int key = sc.nextInt();
        int index = search(numbers, key);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index : "+ index);
        }
        sc.close();
    }    
}
