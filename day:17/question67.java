// write a program to intersection of arrays

package day17;
import java.util.Scanner;

public class question67 {

    public static void intersection(int arr1[], int arr2[]){
        for (int i = 0; i < arr1.length; i++) {
            boolean duplicate = false;
            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate) {
                continue;
            }
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
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
        System.out.print("Intersection of Array : ");
        intersection(arr1, arr2);
        sc.close();
    }
}
