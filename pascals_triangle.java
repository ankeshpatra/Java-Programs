package Patterns;
import java.util.Scanner;
public class pascals_triangle {
    public static void main(String[] args) {
        int i,j,s,n,val=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number:");
        n = scanner.nextInt();
        for (i=1;i<=n;i++) {
            for (s=1;s<=(n-i);s++) {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++) {
                if (i==1 || j==1) {
                    val=1;
                } else {
                    val=val*(i-j+1)/(j-1);
                }
                System.out.printf("%d ",val);
            }
            System.out.println();
            scanner.close();
        }
    }
}
