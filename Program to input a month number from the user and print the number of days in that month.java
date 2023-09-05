//Program to input a month number from the user and print the number of days in that month.

import java.util.*;
class Main{
    public static void main(String[] args) {
        int month;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a day number:");
        month=sc.nextInt();
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("This month has 31 days");
                break;
            case 2:
                System.out.print("This month have 28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("This month constains 30 days");
                break;
            default:
                System.out.print("INVALID INPUT PLEASE ENTER BETWEEN 1-12 !!");
        }
    }
}
