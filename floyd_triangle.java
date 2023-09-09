package Patterns;
import java.util.*;
public class floyd_triangle {
    public static void main(String[] args) {
        int i,j,n,c=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
