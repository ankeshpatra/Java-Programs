package Patterns;
import java.util.*;
public class palindromic_pyramid {
    public static void main(String[] args) {
        int n,i,j,s;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(s=1;s<=(n-i);s++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            for(j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
