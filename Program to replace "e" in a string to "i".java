import java.util.Scanner;
public class replaceEwithI {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        string = scanner.nextLine();
        String result ="";
        for (int i=0;i<string.length();i++) {
            if (string.charAt(i)=='e') {
                result=result+'i';
            }
            else {
                result=result+string.charAt(i);
            }
        }
        System.out.println("The modified string is: "+result);
        scanner.close();
    }
}
