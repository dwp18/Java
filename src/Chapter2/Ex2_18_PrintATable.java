package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_18_PrintATable {
    public static void main (String[] args){
        System.out.println("a \t\t b \t\t pow(a,b)");

        System.out.println(1 + " \t\t " + 2 + " \t\t " + (int)Math.pow(1, 2));
        System.out.println(2 + " \t\t " + 3 + " \t\t " + (int)Math.pow(2, 3));
        System.out.println(3 + " \t\t " + 4 + " \t\t " + (int)Math.pow(3, 4));
        System.out.println(4 + " \t\t " + 5 + " \t\t " + (int)Math.pow(4, 5));
        System.out.println(5 + " \t\t " + 6 + " \t\t " + (int)Math.pow(5, 6));
    }
}
