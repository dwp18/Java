package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/10/2017.
 */
public class Eg2_9_ComputeLoan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the interest rate (%): ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("How long the loan will be (Years): ");
        double numberOfYears = input.nextDouble();

        System.out.print("How much is loan amount: ");
        int loanAmount = input.nextInt();

        double monthlyPayment = loanAmount * monthlyInterestRate /  (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        System.out.println("The monthly payment is $" + monthlyPayment);

    }
}
