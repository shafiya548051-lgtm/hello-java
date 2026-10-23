import java.util.Scanner;
public class Variable1 {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        String value = scn.nextLine();
        int number = scn.nextInt();
        double num = scn.nextDouble();
        boolean vlu = scn.nextBoolean();
        System.out.println("Give a number:");
        System.out.println(value);
        System.out.println("Give an integer :");
        System.out.println(number);
        System.out.println("Give a double:");
        System.out.println(num);
        System.out.println("Give a boolean:");
        System.out.println(vlu);
        System.out.println("you give a String :"+ value);
        System.out.println("you give a integer :"+ number);
        System.out.println("you give a double :"+ num);
        System.out.println("you give a boolean :"+ vlu);
    }
}
