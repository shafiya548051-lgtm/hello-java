import java.util.Scanner;

public class Carryon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Shall we carry on?");
            String carry = scn.nextLine();
            if (carry.equals("no")) {
                break;
            }/*

        /*
            //Are we there yet?
            while(true) {
                System.out.println("Give a number:");
                int num = Integer.valueOf(scn.nextLine());
                if(num == 4){
                    break;
                }
            }
            */
        }
    }
}

