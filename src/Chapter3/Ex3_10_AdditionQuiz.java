package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/18/2017.
 */
public class Ex3_10_AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random() / 2 * 100);
        int num2 = (int)(Math.random() * 100);

        System.out.print("What is " + num1 + " + " + num2 + " ? ");
        int answer = input.nextInt();

        int result = num1 + num2;

        if (answer == result){
            System.out.println("You are Correct!");
        } else {
            System.out.println("Your answer is wrong");
            System.out.println(num1 + " + " + num2 + " is " + result);
        }
    }
}
