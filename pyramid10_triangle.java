package Patterns;
import java.util.*;
public class pyramid10_triangle{
    public static void main(String[] args) {
        int i,j,n,a=1,b=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        n = sc.nextInt();
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(a+" ");
                }
                else{
                    System.out.print(b+" ");
                }
            }
            System.out.println();
        }
    }
}