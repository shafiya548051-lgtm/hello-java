import java.util.Scanner;
public class Conditional {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int marks = scn.nextInt();
        if(marks > 100){
            System.out.println("incredible");
        }
        else if (marks >= 90) {
            System.out.println("5");
        }
        else if(marks >= 80){
            System.out.println("4");
        }
        else if(marks >= 70){
            System.out.println("3");
        }
        else if(marks >= 60){
            System.out.println("2");
        }
        else if(marks >= 50){
            System.out.println("1");
        }
        else if(marks >= 40){
            System.out.println("failed");
        }
        else{
            System.out.println("impossible");
        }
    }
}
