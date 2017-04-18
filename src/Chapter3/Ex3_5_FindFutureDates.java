package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/18/2017.
 */
public class Ex3_5_FindFutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //USER PROMPT
        System.out.print("Enter today's day: ");
        int num = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int add = input.nextInt();

        //FORMULA
        int day = (num + 7) % 7;
        int elapsedDay = (day + add) % 7;

        //DISPLAY
        switch (day){
            case 0 :    System.out.print("Today is Sunday "); break;
            case 1 :    System.out.print("Today is Monday "); break;
            case 2 :    System.out.print("Today is Tuesday "); break;
            case 3 :    System.out.print("Today is Wednesday "); break;
            case 4 :    System.out.print("Today is Thursday "); break;
            case 5 :    System.out.print("Today is Friday "); break;
            case 6 :    System.out.print("Today is Saturday "); break;
            default :   System.out.print("You insert the wrong number"); break;
        }

        switch (elapsedDay) {
            case 0 :    System.out.print("and the Future day is Sunday"); break;
            case 1 :    System.out.print("and the Future day is Monday"); break;
            case 2 :    System.out.print("and the Future day is Tuesday"); break;
            case 3 :    System.out.print("and the Future day is Wednesday"); break;
            case 4 :    System.out.print("and the Future day is Thursday"); break;
            case 5 :    System.out.print("and the Future day is Friday"); break;
            case 6 :    System.out.print("and the Future day is Saturday"); break;
        }
    }
}
