import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = Integer.valueOf(scn.nextLine());
        System.out.println("Enter the second number:");
        int second = Integer.valueOf(scn.nextLine());
        if(first > second){
            System.out.println(+ first + " is greater than " + second);
        }else if(first < second){
            System.out.println(+ first + " is small than "+ second );
        }else if (first == second){
            System.out.println(+ first + " is equal to " + second );
        }

    }

}
