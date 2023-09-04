//Program to print the multiplication table

import java.util.*;
public class Main {
    public static void main(String[] args){
        int i,p,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        n=sc.nextInt();
        for (i=1;i<=10;i++){
            p=n*i;
            System.out.println(n+" x "+i+" = "+p);
        }
    }
}
