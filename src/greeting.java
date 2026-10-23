import java.util.Scanner;
public class greeting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings! how are you doing today?");
        String greeting = scanner.nextLine();
        System.out.println("oh, how interesting. tell me more!");
        String question = scanner.nextLine();
        System.out.println("thanks for sharing!");

    }

}
