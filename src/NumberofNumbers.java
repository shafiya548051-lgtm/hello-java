import java.util.Scanner;

public class NumberofNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("give a number:");
            int num = (Integer.valueOf(scn.nextLine()));
            if (num == 0) {
                break;
            }
            count++;
        }
        System.out.println("Number of numbers:" + count);
        scn.close();
    }
}
