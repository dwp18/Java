package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/17/2017.
 */
public class Eg3_1_AdditionQuiz {
    public static void main (String[] args){
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() /7 % 10);

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int result = input.nextInt();

        System.out.print(number1 + " + " + number2 + " = " + result + " is " + (number1 + number2 == result));

    }
}
