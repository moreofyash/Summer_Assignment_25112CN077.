// write a program to input and display array

package day13;
import java.util.*;

public class question49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter your elements : ");
        int array[] = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        System.out.print("ARRAY = [");
        for(int i = 0; i < n; i++){
            System.out.print(array[i]);
            if(i < n - 1){
            System.out.print(", ");
            }
        }
        System.out.print("]");
        sc.close();
    }
}
