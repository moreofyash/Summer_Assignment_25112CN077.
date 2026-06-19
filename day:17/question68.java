// write a program to find common elements

package day17;
import java.util.Scanner;

public class question68 {

    public static void commonelement(int arr1[], int arr2[]){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    System.err.print(arr1[i]+" ");
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
        System.out.print("Common element : ");
        commonelement(arr1, arr2);
        sc.close();
    }
}
