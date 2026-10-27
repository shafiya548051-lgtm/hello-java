import java.util.Scanner;

public class Numbersofsum {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int sum = 0;
            int count = 0;
            while (true) {
                System.out.println("give a number:");
                int num = scn.nextInt();
                if (num == 0) {
                    break;
                }
                count++;
                if(num > 0){
                    sum += num;
                }else{
                    System.out.println("Cannot calculate the average");
                }

            }
            double average = (double) sum / count;
            System.out.println("numbers of numbers:" + count);
            System.out.println("sum of numbers:" + sum);
            System.out.println("Average of the numbers: :" + average);
        }
}
