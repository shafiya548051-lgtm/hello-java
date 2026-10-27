import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int value = Integer.valueOf(scn.nextLine());
        if(value < 0){
            int positive = value * -1  ;
            System.out.println(positive);
        }else if(value == value){
            System.out.println(value);
        }
    }

}
