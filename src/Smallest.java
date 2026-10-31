public class Smallest {
    public static void main(String[] args) {
        int answer =  smallest(8, 90);
        System.out.println("Smallest: " + answer);
        int ans =  greatest(2, 7, 3);
        System.out.println("Greatest: " + ans);
    }
    public static int smallest(int number1, int number2) {
        if (number1 < number2) {
            return(number1);
        }else{
            return(number2);
        }
    }
    //Greatest
    public static int greatest(int number1, int number2, int number3) {
        if(number1>number2 || number1>number3){
            return(number1);
        }else if(number2>number3){
            return(number2);
        }else if(number2>number1){
            return(number2);
        }else{
            return(number3);
        }
    }
}
