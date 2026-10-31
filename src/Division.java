import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        division(4, 2);
        divisibleByThreeInRange(3, 6);
    }

    public static void division(int numerator, int denominator) {
        double div;
        div = (double) numerator / (double) denominator;
        System.out.println(div);


    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);

            }
        }

    }
}


