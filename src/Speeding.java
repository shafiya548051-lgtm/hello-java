import java.util.Scanner;
public class Speeding {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int speed = scn.nextInt();
        if (speed >= 120){
            System.out.println("Speeding ticket!");
        }

    }
}
