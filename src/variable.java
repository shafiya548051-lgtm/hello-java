import java.util.Scanner;
public class variable {
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
        int chicken = scn.nextInt();
        float Bacon = scn.nextFloat();
        String Tractor = scn.next();

        System.out.println("chicken:");
        System.out.println(chicken);

       System.out.println("Bacon:");
       System.out.println(Bacon);

       System.out.println("Tractor:");
       System.out.println(Tractor + "!");

       System.out.println("And finally, a summary:");
        System.out.println(chicken);
        System.out.println(Bacon);
        System.out.println(Tractor + "!");

      scn.close();
    }
}
