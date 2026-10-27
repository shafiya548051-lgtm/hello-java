import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = Integer.valueOf(scn.nextLine());
        System.out.println("Enter the Second number:");
        int second = Integer.valueOf(scn.nextLine());
        int sum = first + second;
        double Square =  Math.sqrt(sum);
        System.out.println(Square);
    }
}
