import java.util.Scanner;
public class IFelseQuestions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //OrWell
        System.out.println("Enter the number:");
        int num = scn.nextInt();
        if(num == 1984){
            System.out.println("OrWell");
        }
      // Ancient
        System.out.println("Enter the number:");
        int Anc = scn.nextInt();
        if(Anc < 2015){
            System.out.println("Ancient history!");
        }
        //Positive or negative
        System.out.println("Enter the number:");
        int number = scn.nextInt();
        if(number  >= 0) {
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
        //Adulthood
        System.out.println("Enter the number:");
        int Adult = scn.nextInt();
        if(Adult  >= 18) {
            System.out.println("You are an adult");
        }else {
            System.out.println("You are not an adult");
        }
        //Larger Than or Equal To
        System.out.println("Give the first number :");
        int first = scn.nextInt();
        System.out.println("Give the second number:");
        int second = scn.nextInt();
        if(first == second) {
            System.out.println("Both are same numbers");
        }else if(first > second){
            System.out.println("Greater number is: " + first);
        }else{
            System.out.println("Greater number is: " + second);

        }

    }
}

