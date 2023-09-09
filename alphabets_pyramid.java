package Patterns;
import java.util.*;
public class alphabets_pyramid {
    public static void main(String[] args) {
        int i,j,n,s;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        n = sc.nextInt();
        for (i=1;i<=n;i++){
            for (s=1;s<=(n-i);s++){
                System.out.print(" ");
            }
            for (j=1;j<=(2*i-1);j++){
                System.out.printf("%c",64+j);
            }
            System.out.println();
        }
    }
}
