import java.util.Scanner;
public class Square {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = Integer.valueOf(scn.nextLine());
        int Square = num * num ;
        System.out.println("the Given number of Square is: " + Square);

    }
}
