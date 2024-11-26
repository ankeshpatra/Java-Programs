/*
 * lab 9 - Develop a JAVA program to raise a custom exception (user defined exception) for DivisionByZero using try, catch, throw and finally.
 */

import java.util.Scanner;
class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String s){
        super(s);
    }
}
public class CustomException{
    public static double divide(int a,int b) throws DivisionByZeroException{
        if(b==0){
            throw new DivisionByZeroException("Error: Division by Zero is not possible");
        }
        return (double)a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,deno;
        try{
            System.out.println("Enter the Numerator: ");
            num = sc.nextInt();
            System.out.println("Enter the Denominator: ");
            deno = sc.nextInt();
            double result = divide(num,deno);
            System.out.println("Result: "+result);
        }
        catch(DivisionByZeroException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            System.out.println("Finally Block Executed");
            sc.close();
        }
    }
}
