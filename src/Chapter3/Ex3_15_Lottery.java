package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/20/2017.
 */
public class Ex3_15_Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 1000);

        System.out.println(lottery); //DEBUGGING

        System.out.print("Enter your lottery pick (3 digits): ");
        int guess = input.nextInt();

        int remainingGuess = guess;
        int firstGuess = remainingGuess / 100;
        remainingGuess = remainingGuess % 100;
        int secondGuess = remainingGuess / 10;
        remainingGuess = remainingGuess % 10;
        int thirdGuess = remainingGuess;

        int remainingLottery = lottery;
        int firstLottery = remainingLottery / 100;
        remainingLottery = remainingLottery % 100;
        int secondLottery = remainingLottery / 10;
        remainingLottery = remainingLottery % 10;
        int thirdLottery = remainingLottery;

        if(guess / 100 == 0 || guess / 100 > 9){
            System.out.println("You enter less / more than 3 digits");
        } else {
            if (lottery == guess){
                System.out.println("Exact order: you win $10.000");
            } else if ((firstGuess == firstLottery || firstGuess == secondLottery || firstGuess == thirdLottery) && (secondGuess == firstLottery || secondGuess == secondLottery || secondGuess == thirdLottery) && (thirdGuess == firstLottery || thirdGuess == secondLottery || thirdGuess == thirdLottery)){
                System.out.println("Match all: you win $3.000");
            } else if (firstGuess == firstLottery || firstGuess == secondLottery || firstGuess == thirdLottery || secondGuess == firstLottery || secondGuess == secondLottery || secondGuess == thirdLottery || thirdGuess == firstLottery || thirdGuess == secondLottery || thirdGuess == thirdLottery){
                System.out.println("Match one digit: you win $1.000");
            } else {
                System.out.println("Sorry, no match");
            }
        }
    }

}
