import java.util.Scanner;
public class inputOfStringsArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size = scanner.nextInt();
        int length=0;
        String[] string = new String[size];
        for (int i=0 ; i<size ; i++) {
            System.out.printf("enter the %d string: ",i);
            string[i] = scanner.next();
            length += string[i].length();
        }
        System.out.println("the length of the string is :"+length);
        scanner.close();
    }
}
