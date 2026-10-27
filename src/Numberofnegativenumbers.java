import java.util.Scanner;

public class Numberofnegativenumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("give a number:");
            int num = (Integer.valueOf(scn.nextLine()));
            if (num == 0) {
                break;
            }
            if (num < 0) {
                count++;
            }
        }
        System.out.println("Number of negative numbers::" + count);
        scn.close();
    }
}

