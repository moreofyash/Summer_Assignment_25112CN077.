// write a program to selection sort 

package day18;
import java.util.Scanner;

public class question70 {
    public static void selectionsort(int nums[]){
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minpos = i;
            for(int j = i+1; j < n; j++ ){
                if(nums[minpos] > nums[j]){
                    minpos = j;
                }
            }
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i] = temp;

        }
    }
    public static void printarray(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter your elements : ");
        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        selectionsort(nums);
        System.out.print("Sorted Array : ");
        printarray(nums);
        sc.close();
    }
}
