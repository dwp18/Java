package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/19/2017.
 */
public class Ex3_11_FindNumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = input.nextInt();
        System.out.print("Enter Month: ");
        int month = input.nextInt();

        switch (month){
            case 1 : System.out.print("January "); break;
            case 2 : System.out.print("February "); break;
            case 3 : System.out.print("March "); break;
            case 4 : System.out.print("April "); break;
            case 5 : System.out.print("May "); break;
            case 6 : System.out.print("June "); break;
            case 7 : System.out.print("July "); break;
            case 8 : System.out.print("August "); break;
            case 9 : System.out.print("September "); break;
            case 10 : System.out.print("October "); break;
            case 11: System.out.print("November "); break;
            case 12 : System.out.print("December "); break;
        }

        boolean leapYear = (year % 4 == 0 & year % 100 != 0) || (year % 400 == 0);
        int totalDays = 0;

        if (month == 1 || month == 3 || month == 5  || month == 7  || month == 8  || month == 10  || month == 12) {
            totalDays = 31;
        } else if (month == 2){
            totalDays = (leapYear) ? 29 : 28;
        } else {
            totalDays = 30;
        }

        System.out.println(year + " had " + totalDays + " days");
    }
}
