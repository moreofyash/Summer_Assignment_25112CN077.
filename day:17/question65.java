// write a program to merge arrays 

package day17;
import java.util.Scanner;

public class question65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array : ");
        int n1 = sc.nextInt();
        System.out.print("Enter your elements : ");
        int arr1[] = new int[n1];
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array : ");
        int n2 = sc.nextInt();
        System.out.print("Enter your elements : ");
        int arr2[] = new int[n2];
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        int merged[] = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        System.out.print("Merged Array : ");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]+" ");
        }
        sc.close();
    }
}
