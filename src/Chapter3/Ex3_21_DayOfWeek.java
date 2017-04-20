package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/20/2017.
 */
public class Ex3_21_DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year (e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day of the month (1-31): ");
        int day = input.nextInt();

        if (month <= 2){
            month = month + 12;
            year = year - 1;
        }

        int century = year / 100;
        int yearOfCentury = year % 100;

        // System.out.println(month); DEBUGGING

        int dayOfWeek = (day + (26 * (month + 1) / 10) + yearOfCentury + (yearOfCentury / 4) + (century / 4) + (5 * century)) % 7;

        // System.out.println(dayOfWeek); DEBUGGING

        switch (dayOfWeek) {
            case 0 : System.out.print("Day of the week is Saturday"); break;
            case 1 : System.out.print("Day of the week is Sunday"); break;
            case 2 : System.out.print("Day of the week is Monday"); break;
            case 3 : System.out.print("Day of the week is Tuesday"); break;
            case 4 : System.out.print("Day of the week is Wednesday"); break;
            case 5 : System.out.print("Day of the week is Thursday"); break;
            case 6 : System.out.print("Day of the week is Friday"); break;
        }
    }
}
