import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scn.nextInt();
        for(int i=0; i <= number; i++){
            System.out.println(i);
        }

    }
}
