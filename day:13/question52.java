// write a program to count even and odd elements 

package day13;
import java.util.Scanner;

public class question52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter your elements : ");
        int numbers[] = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        int oddEle = 0;
        int evenEle = 0;
        for (int i = 0; i < n; i++) {
            if(numbers[i] % 2 == 0){
                evenEle++;
            }else{
                oddEle++;
            }
        }
        System.out.println("Number of odd elements are : " + oddEle);
        System.out.println("Number of even elements are : " + evenEle);
        sc.close();
    }
}
