// write a program to sort array in descending order 

package day18;
import java.util.Scanner;

public class question72 {
    public static void bubblesort(int nums[]){
        int n = nums.length;
        for(int i = 0; i < n -1; i++){
            for(int j = 0
                ;j < n -1 -i;j++){
                if(nums[j] < nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
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
        bubblesort(nums);
        System.out.print("Sorted Array(Descending order) : ");
        printarray(nums);
        sc.close();
    }
}
