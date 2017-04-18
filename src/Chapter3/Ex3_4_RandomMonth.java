package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/18/2017.
 */
public class Ex3_4_RandomMonth {
    public static void main(String[] args) {

        int x = (int)(Math.random() * 12);

        System.out.println(x);

        switch (x) {
            case 0 : System.out.print("December"); break;
            case 1 : System.out.print("January"); break;
            case 2 : System.out.print("February"); break;
            case 3 : System.out.print("March"); break;
            case 4 : System.out.print("April"); break;
            case 5 : System.out.print("May"); break;
            case 6 : System.out.print("June"); break;
            case 7 : System.out.print("July"); break;
            case 8 : System.out.print("August"); break;
            case 9 : System.out.print("September"); break;
            case 10 : System.out.print("October"); break;
            case 11 : System.out.print("November");
        }
    }
}
