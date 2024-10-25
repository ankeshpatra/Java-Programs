import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matrix add = new Matrix();
        System.out.println("Enter the row and column of Matrix 1:");
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        System.out.println("Enter the row and column of Matrix 2:");
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        if(r1!=r2 || c1!=c2) {
            System.out.println("Matrix addition is not possible");
        } else {
            int[][] a = new int[r1][c1];
            int[][] b = new int[r2][c2];
            int[][] sum = new int[r1][c1];
            System.out.println("Enter the elements of Matrix 1:");
            add.read(a, r1, c1, scanner);
            System.out.println("Enter the elements of Matrix 2:");
            add.read(b, r2, c2, scanner);
            add.addition(a, b, sum, r1, c1);
            System.out.println("The sum of two matrices is:");
            add.display(sum, r1, c1);
        }
        scanner.close();
    }
    void read(int[][] a,int r1,int c1,Scanner scanner) {
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c1;j++) {
                a[i][j] = scanner.nextInt();
            }
        }
    }

    void addition(int[][] a,int[][] b,int[][] c,int r1,int c1) {
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c1;j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    void display(int[][] c,int r1,int c1) {
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c1;j++){
                System.out.println(c[i][j]+"\t");
            }
        }
    }
}
