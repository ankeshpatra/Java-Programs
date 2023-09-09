package Patterns;
import java.util.*;
public class hollow_rectangle_with_diagonals{
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }
                else if(i==j){
                    System.out.print("* ");
                }
                else if((i+j)==n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
