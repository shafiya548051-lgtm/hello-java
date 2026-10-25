import java.util.Scanner;
public class Sumofnumbers {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = scn.nextInt();
        System.out.println("Enter the Second number:");
        int Second = scn.nextInt();
        System.out.println("Enter the third number:");
        int third = scn.nextInt();

        int sum = first + Second + third ;
        System.out.println("the sum of numbers is : " + sum);

        System.out.println("Enter the 1st number:");
        int one = scn.nextInt();
        System.out.println("Enter the 1st number:");
        int two = scn.nextInt();
        int add = one + two;
        System.out.println("one + two = " + add);

        System.out.println("Enter the 1st number:");
        int mu = scn.nextInt();
        System.out.println("Enter the 2nd number:");
        int st = scn.nextInt();
        int mul = mu * st;
        System.out.println("one * two = " + mul);

        System.out.println("Enter the 1st number:");
        int di = scn.nextInt();
        System.out.println("Enter the 2nd number:");
        int de = scn.nextInt();
        int div = di / de;
        System.out.println("one / two = " + div);



    }
}
