package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/17/2017.
 */
public class SimpleIfDemo {
    public static void  main (String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter an Integer: ");
        int number =  input.nextInt();

        if( number % 5 == 0){
            System.out.println("HiFive");
        }

        if (number % 2 == 0) {
            System.out.print("HiEven");
        }
    }
}
