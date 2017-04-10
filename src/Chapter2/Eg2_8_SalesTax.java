package Chapter2;
import java.util.Scanner;


/**
 * Created by Wahyu on 4/10/2017.
 */
public class Eg2_8_SalesTax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        System.out.println("");
        double tax = purchaseAmount * 0.06; //4.56
        System.out.println("Sales tax is $" + (int)(tax * 100.0)/100.0); // Accuracy
        System.out.println("Sales tax is $" + tax);
    }
}
