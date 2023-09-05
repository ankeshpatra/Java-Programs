//Program to input a day number from the user and print the corresponding day to that entered number.

import java.util.*;
class Main{
    public static void main(String[] args) {
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a day number:");
        day=sc.nextInt();
        switch (day) {
            case 1:
                System.out.printf("The day number corresponds to %d is SUNDAY",day);
                break;
            case 2:
                System.out.printf("The day number corresponds to %d is MONDAY",day);
                break;
            case 3:
                System.out.printf("The day number corresponds to %d is TUESDAY",day);
                break;
            case 4:
                System.out.printf("The day number corresponds to %d is WEDNESDAY",day);
                break;
            case 5:
                System.out.printf("The day number corresponds to %d is THRUSDAY",day);
                break;
            case 6:
                System.out.printf("The day number corresponds to %d is FRIDAY",day);
                break;
            case 7:
                System.out.printf("The day number corresponds to %d is SATURDAY",day);
                break;
        
            default:
                System.out.print("INVALID INPUT PLEASE ENTER A NUMBER BETWEEN 1-7 !!");
                break;
        }
    }
}
