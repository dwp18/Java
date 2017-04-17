package Chapter3;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/17/2017.
 */
public class Eg3_8_Lottery {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        int lottery = (int)(Math.random() * 100);

        System.out.print("Enter Your Lottery Pick: ");
        int guess = input.nextInt();

        int number1 = guess / 10;
        int number2 = guess % 10;

        int lottery1 = lottery / 10;
        int lottery2 = lottery % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery){
            System.out.print("Exact Match: You Win $10,000");
        } else if (number1 == lottery2 && number2 == lottery1){
            System.out.print("Match all digits: You Win $3,000");
        } else if (number1 == lottery1 || number2 == lottery1 || number1 == lottery2 || number2 == lottery2){
            System.out.print("Match one digits: You Win $1,000");
        } else {
            System.out.print("Sorry: no match");
        }
    }
}
