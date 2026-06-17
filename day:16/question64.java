// write a program to remove duplicates from array

package day16;
import java.util.Scanner;

public class question64 {

    public static void removeduplicate(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            boolean isduplicate = false;
            for (int j = 0; j < i; j++) {
                if(nums[i] == nums[j]){
                    isduplicate = true;
                    break;
                }
            }
            if(!isduplicate){
                System.out.print(nums[i] + " ");
            }
        }
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
        System.out.print("Array after removing duplicates : ");
        removeduplicate(nums);
        sc.close();
    }
}
