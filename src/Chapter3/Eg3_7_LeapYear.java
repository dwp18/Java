package Chapter3;

import java.util.Scanner;


/**
 * Created by Wahyu on 4/17/2017.
 */
public class Eg3_7_LeapYear {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a year: ");
        int year =  input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.print(year + " is Leap Year? " + isLeapYear);
    }


}
