//Program to check whether the entered character is a vowel or not.

import java.util.*;
public class Main{
    public static void main(String[] args) {
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a character:");
        c=sc.next().charAt(0);
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
            System.out.printf("%c is a vowel",c);
        } else {
            System.out.printf("%c is a consonant",c);
        }
    }
}
