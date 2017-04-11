package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_6_SummarizingIntegerDigits {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt(); ///923

        int number1 = number / 1000; //923 / 1000 = 0.923 -> 0
        int currentNumber = number % 1000; //923 % 1000 = 923
        //System.out.println("Number 1: " + number1);
        //System.out.println("Number Current Number: " + currentNumber);

        int number2 = currentNumber / 100;
        currentNumber = currentNumber % 100;
        //System.out.println("Number 2: " + number2);

        int number3 = currentNumber / 10;
        currentNumber = currentNumber % 10;
        //System.out.println("Number 3: " + number3);

        int number4 = currentNumber;
        //System.out.println("Number 4: " + number4);

        int totalNumber = number1 + number2 + number3 + number4;

        System.out.print("The sum of the digits is " + totalNumber);
    }
}
