//Program to check whether a number is perfect number or not.

import java.util.*;
public class Main{
    public static void main(String[] args) {
        int num,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        num=sc.nextInt();
        for (i=1;i<num;i++){
            if (num%i==0)
                sum+=i;
        }
        if (sum==num)
            System.out.printf("%d is a perfect number",num);
        else
            System.out.printf("%d is not a perfect number",num);
    }
}
