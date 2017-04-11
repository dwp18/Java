package Chapter2;
import java.util.Scanner;


/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_5_CalculateTips {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratitude rate: ");
        double subtotal = input.nextDouble(); //10
        double rating = input.nextDouble(); //15

        double tips = rating / 100 * subtotal ; //15.0 / 100 = 0.15 * 10 = 1.5
        double total = subtotal + tips;

        System.out.print("The gratuity is $" + tips + " and total is $" + total);
    }
}
