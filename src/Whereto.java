import java.util.Scanner;

public class Whereto {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Where to? ");
            int to = scn.nextInt();
            System.out.println("Where from? ");
            int from = scn.nextInt();
            for(int i=from; i<=to; i++){

                System.out.println(i);


            }

        }
}
