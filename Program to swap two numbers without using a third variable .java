//Program to swap two numbers without using a third variable 


import java.util.*;
public class Main{
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number (a):");
        a=sc.nextInt();
        System.out.print("enter second number (b):");
        b=sc.nextInt();
        a+=b;
        b=a-b;
        a-=b;
        System.out.printf("a = %d and b = %d",a,b);
    }
}
