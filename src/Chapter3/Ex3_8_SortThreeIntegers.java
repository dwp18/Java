package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/18/2017.
 */
public class Ex3_8_SortThreeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 number: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int temp = 0;

        if (second < first){
            temp = first;
            first = second;
            second = temp;
        }

        if (third < first){
            temp = first;
            first = third;
            third = temp;
        }

        if (third < second){
            temp = second;
            second = third;
            third = temp;
        }

        System.out.print(first + " " + second + " " + third);

        /*
        if (a < b && a < c) {
            System.out.print(a + " ");
            if (b < c) {
                System.out.print(b + " " + c);
            } else {
                System.out.print(c + " " + b);
            }
        } else if (b < a && b < c){
            System.out.print(b + " ");
            if (a < c){
                System.out.print(a + " " + c);
            } else {
                System.out.print(c + " " + a);
            }
        } else {
            System.out.print(c + " ");
            if (a < b) {
                System.out.print(a + " " + b);
            } else {
                System.out.print(b + " " + a);
            }
        }*/
    }
}
