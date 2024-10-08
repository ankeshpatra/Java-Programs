import java.util.Scanner;

/**
 * Prime
 */
public class Prime {

    public static void main(String[] args) {
        int num2,i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        System.out.println("Prime numbers between are: ");
        for (i = 2; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
        
    static boolean isPrime(int n) {
        int i;
        for (i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}