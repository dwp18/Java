package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/17/2017.
 */
public class SubstractionQuiz {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        System.out.print("What is " + number1 + " - " + number2 + " ? ");
        int answer = input.nextInt();

        int correctAnswer = number1 - number2;

        if (answer == correctAnswer) {
            System.out.print("You're Correct!");
        } else {
            System.out.println("Your answer is wrong");
            System.out.println(number1 + " - " + number2 + " is " + correctAnswer);
        }
    }
}
