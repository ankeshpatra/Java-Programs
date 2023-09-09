import java.util.*;
class armstrong{
    public static void main(String[] args) {
        int num,rem,res=0,a;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        num=sc.nextInt();
        a=num;
        while (num>0) {
            rem=num%10;
            res=res+(rem*rem*rem);
            num/=10;
        }
        if (res==a){
            System.out.printf("%d is an armstrong number",a);
        }
        else
        System.out.printf("%d is not an armstrong number",a);
        sc.close();
    }
}