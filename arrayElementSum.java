// Program to input the Elements of an Array and print the Sum of the Elements of the Array

import java.util.Scanner;

public class arrayElementSum{
    public static void main(String[] args) {
        int sum =0;
        System.out.print("Enter the size of the Array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numArray = new int[size];
        for (int i=0;i<size;i++) {
            System.out.print("Enter the "+i+" Element :");
            int number = scanner.nextInt();
            numArray[i] = number;
        }
        for (int j=0;j<numArray.length;j++) {
            sum = sum + numArray[j];
        }
        System.out.println("The Sum of the Elements in the Array is : "+sum);
        scanner.close();
    }
}