package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/19/2017.
 */
public class Ex3_12_PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int currentNumber = number;

        int firstDigit = currentNumber / 100;
        //System.out.println(firstDigit); DEBUGGING
        currentNumber = currentNumber % 100;

        int secondDigit = currentNumber / 10;
        //System.out.println(secondDigit); DEBUGGING
        currentNumber = currentNumber % 10;

        int thirdDigit = currentNumber;
        //System.out.println(thirdDigit); DEBUGGING

        if(firstDigit == secondDigit || firstDigit == thirdDigit || secondDigit == thirdDigit){
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
