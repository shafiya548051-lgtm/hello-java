import java.util.Scanner;

public class Onlypositives {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number:");
            int number = Integer.valueOf(scn.nextLine());

            if (number == 0) {
                break;

            }else if(number < 0) {
                System.out.println("Unsuitable number");
                continue;
            }else{
                System.out.println(number*number);
                break;

            }
        }



        }

    }

