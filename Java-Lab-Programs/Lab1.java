
/**
 * Lab1-Addition of two matrices
 */
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row1, cols1, row2, cols2;
        System.out.println("Enter the rows and columns for matrix 1:");
        row1 = scanner.nextInt();
        cols1 = scanner.nextInt();
        System.out.println("Enter the rows and columns for matrix 2:");
        row2 = scanner.nextInt();
        cols2 = scanner.nextInt();
        if (row1 != row2 || cols1 != cols2)
            System.out.println("Addition cannot be performed");
        int[][] matrix1 = new int[row1][cols1];
        int[][] matrix2 = new int[row2][cols2];
        int[][] result = new int[row1][cols1];
        Lab1 matrix = new Lab1();
        System.out.println("Enter the elements of matrix 1:");
        matrix.read(matrix1, row1, cols1);
        System.out.println("Enter the elements of matrix 2:");
        matrix.read(matrix2, row2, cols2);
        System.out.println("The sum of the matrices are:");
        matrix.sum(matrix1, matrix2, result, row2, cols2);
        matrix.display(result, row1, cols1);
        scanner.close();
    }

    void read(int[][] a, int row, int cols) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void sum(int[][] a, int[][] b, int[][] c, int row, int cols) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    void display(int[][] c, int row, int cols) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}