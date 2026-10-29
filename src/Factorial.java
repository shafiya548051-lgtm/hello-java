import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give a number: ");
        int fact = scn.nextInt();
        int product = 1;
        for(int i=1; i<=fact; i++){
           product *= i;
            }
        System.out.println("Factorial: " + product);


        }


    }

