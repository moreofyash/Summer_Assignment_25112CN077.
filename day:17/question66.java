// write a program to union of arrays

package day17;
import java.util.Scanner;

public class question66 {
    public static void union(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
          System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
               }
            }
            if (!found) {
                System.out.print(arr2[i] + " ");
          }
       }
    }

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
        System.out.print("Union of Array : ");
        union(arr1, arr2);
        sc.close();
    }

}
