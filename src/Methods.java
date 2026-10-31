import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("how many times the method will be called: ");
        int times = scn.nextInt();
        for(int i=1; i<=times; i++){
            printText();
        }

    }
        public static void printText(){

        System.out.println("In a hole in the ground there lived a method");
    }

}
