// write a program to transpose matrix 

package day19;
import java.util.Scanner;

public class question75 {

    public static int[][] transpose(int matrix[][], int n , int m){
        int transpose[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : "); 
        int n = sc.nextInt();
        System.out.print("Enter number of Columns : "); 
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        System.out.print("Enter elements of matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int result[][] = transpose(matrix, n, m);
        System.out.println("Transpose of matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
