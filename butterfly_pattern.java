package Patterns;
import java.util.*;
public class butterfly_pattern{
    public static void main(String[] args) {
        int i,j,s,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(s=1;s<=2*(n-i);s++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(s=1;s<=2*(n-i);s++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
     }
}