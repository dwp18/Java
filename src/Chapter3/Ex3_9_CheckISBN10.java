package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/18/2017.
 */
public class Ex3_9_CheckISBN10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as Integer: ");
        int allDigit = input.nextInt();

        int remainingDigits = allDigit;

        int firstDigit = (int)(allDigit / 100000000);
        remainingDigits = remainingDigits % 100000000;

        int secondDigit = (int)(remainingDigits / 10000000);
        remainingDigits = remainingDigits % 10000000;

        int thirdDigit = (int)(remainingDigits / 1000000);
        remainingDigits = remainingDigits % 1000000;

        int fourthDigit = (int)(remainingDigits / 100000);
        remainingDigits = remainingDigits % 100000;

        int fifthDigit = (int)(remainingDigits / 10000);
        remainingDigits = remainingDigits % 10000;

        int sixthDigit = (int)(remainingDigits / 1000);
        remainingDigits = remainingDigits % 1000;

        int seventhDigit = (int)(remainingDigits / 100);
        remainingDigits = remainingDigits % 100;

        int eighthDigit = (int)(remainingDigits / 10);
        remainingDigits = remainingDigits % 10;

        int ninthDigit = remainingDigits;

        int tenthDigit = (firstDigit * 1 + secondDigit * 2 + thirdDigit * 3 + fourthDigit * 4 + fifthDigit * 5 + sixthDigit * 6 + seventhDigit * 7 + eighthDigit * 8 + ninthDigit * 9) % 11;

        /*
        System.out.println(firstDigit); //DEBUGGING
        System.out.println(remainingDigits); //DEBUGGING
        */
        if (tenthDigit == 10){
            System.out.print("The ISBN-10 number is " + allDigit + "X");
        } else {
            System.out.print("The ISBN-10 number is " + allDigit + "" + tenthDigit);
        }
    }
}
