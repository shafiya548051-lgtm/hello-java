import java.util.Scanner;
public class CalculatingNumbers {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int days = scn.nextInt();
        int seconds = days*24*60*60;
        System.out.println(  +  days  +  " days in seconds is " + seconds );



    }
}
