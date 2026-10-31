import java.util.Scanner;

public class parameters1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        printFromNumberToOne(10);
    }
    public static void printFromNumberToOne(int n){
        for(int i=n; i>=1; i--){
           System.out.println(i);
        }
    }
}
