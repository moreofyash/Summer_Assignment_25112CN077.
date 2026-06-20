// write a program to add matrices 

package day19;
import java.util.Scanner;

public class question73 {

    public static int[][] addMatrices(int matrices1[][] , int matrices2[][] , int n , int m){
        int sum[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = matrices1[i][j] + matrices2[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : "); 
        int n = sc.nextInt();
        System.out.print("Enter number of Columns : "); 
        int m = sc.nextInt();

        int matrices1[][] = new int[n][m];
        int matrices2[][] = new int[n][m];
        System.out.print("Enter elements of first matrices : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrices1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter elements of second matrices : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrices2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of Matrices : ");
        int result[][] = addMatrices(matrices1, matrices2, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
