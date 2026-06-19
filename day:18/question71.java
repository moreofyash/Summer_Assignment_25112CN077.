// write a program to binary search 

package day18;
import java.util.Scanner;

public class question71 {
    public static int binarysearch(int nums[] , int key){
        int first = 0; int end = nums.length - 1;
        while(first <= end){
            int mid = (first + end) / 2 ;
            if(nums[mid] == key){
                return mid;
            }
            if(nums[mid] < key){
                first = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
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
        System.out.print("Enter key : ");
        int key =  sc.nextInt();
        int index = binarysearch(nums, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Key at index : "+ index);
        }
        sc.close();
    }
}
