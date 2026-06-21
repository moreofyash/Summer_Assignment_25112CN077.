// write a program to check symmetric matrix

package day20;
import java.util.Scanner;

public class question78 {
    public static boolean isSymmetric(int matrix[][], int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] != matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
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
        if(isSymmetric(matrix, n)){
            System.out.println("Matrix is Symmentric");
        }else{
            System.out.println("Matrix is not Symmetric");
        }
        sc.close();
    }
}
