package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/19/2017.
 */
public class Ex3_14_HeadsOrTails {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int flipCoin = (int)(Math.random() * 2);

        //System.out.println(flipCoin); DEBUGGING

        System.out.print("Insert [0] for Heads or [1] tails: ");
        int guess = input.nextInt();

        if (guess > 1 || guess < 0 ){
            System.out.println("You enter the wrong number");
        } else{
            if (guess == flipCoin){
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");
            }
        }
    }
}
