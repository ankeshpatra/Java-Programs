package Patterns;
import java.util.*;
public class hollow_rhombus {
    public static void main(String[] args) {
        int i,j,n,s;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        n = sc.nextInt();
        for (i=1;i<=n;i++){
            for (s=1;s<=(n-i);s++){
                System.out.print(" ");
            }
            for (j=1;j<=n;j++){
                if (i==1||i==n||j==1||j==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
