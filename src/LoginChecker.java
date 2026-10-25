import java.util.Scanner;

public class LoginChecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String num = "Admin";
        int number = 123;
        System.out.println("Enter the username:");
        String username = scn.nextLine();
        System.out.println("Enter the password:");
        int password = scn.nextInt();
        if(username.equals(num) && password ==number) {
            System.out.println("welcome");
        }else if(!username.equals(num) && password != number){
            System.out.println("User not found");
        }else if(!username.equals(num)) {
            System.out.println("Wrong username");
        }else{
            System.out.println("Wrong password");
        }
        scn.close();

        }
}
