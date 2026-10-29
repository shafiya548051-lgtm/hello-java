import java.util.Scanner;

public class Sumofsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("first number?  ");
        int first = scn.nextInt();
        System.out.println("last number?  ");
        int last = scn.nextInt();
        int sum = 0;
        for(int i=first; i<=last; i++){
            sum += i;
        }
        System.out.println("the sum is: "+ sum);

    }
}