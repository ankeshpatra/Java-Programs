import java.util.Scanner;

public class emailToUsername {
    public static void main(String[] args) {
        String email,username="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email: ");
        email = scanner.nextLine();
        for (int i=0;i<email.length();i++) {
            if (email.charAt(i)=='@') {
                break;
            }
            else {
                username = username + email.charAt(i);
            }
        }
        System.out.println("The username is: "+username);
        scanner.close();
    }
}
