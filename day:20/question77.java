// write a program to multiply matrices

package day20;
import java.util.Scanner;

public class question77 {

    public static int[][] multiply(int A[][] , int B[][] , int c1, int c2, int r1){
        int result[][] = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns of first matrix : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.print("Enter rows and columns of second matrix : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if(c1 != r2){
            System.out.println("Multiplication is not Possible");
        }else{
            int A[][] = new int[r1][c1];
            int B[][] = new int[r2][c2];
            System.out.print("Enter elements od matix A : ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
            System.out.print("Enter elements od matix B : ");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    B[i][j] = sc.nextInt();
                }
            }
            int result[][] = multiply(A, B, c1, c2, r1);
            System.out.println("Final matrix A * B : ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
