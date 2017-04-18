package Chapter3;

import java.util.Scanner;

/**
 * Created by Wahyu on 4/18/2017.
 */
public class Ex3_2_AddThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = (int) (System.currentTimeMillis() % 10);
        int num2 = (int) (System.currentTimeMillis() / 7 % 10);
        int num3 = (int) (System.currentTimeMillis() * 7 % 10);

        System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + " ? ");
        int answer = input.nextInt();

        System.out.print(num1 + " + " + num2 + " + " + num3 + " = " + answer + " is " + (num1 + num2 + num3 == answer));
    }

}
