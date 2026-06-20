// write a program to find diagonal sum 

package day19;
import java.util.Scanner;

public class question76 {
    public static int diagonalSum(int matrix[][], int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += matrix[i][i];    
        sum += matrix[i][n - 1 - i];   
    }
    if (n % 2 != 0) {
        sum -= matrix[n/2][n/2];
    }
    return sum;
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix : "); 
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        System.out.print("Enter elements of matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int result = diagonalSum(matrix, n);
        System.out.println("SUm of Primay and Seconday diagonal is : "+ result);
        sc.close();
   }
}
