import java.util.Scanner;

public class parameters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        printUntilNumber(3);
    }
    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
