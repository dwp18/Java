package Chapter2;
import java.util.Scanner;

/**
 * Created by Wahyu on 4/11/2017.
 */
public class Ex2_13_FinancialCompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double saving = input.nextDouble();
        double interest = 1 + 0.00417;

        double currentSaving = saving * interest;

        currentSaving = (saving + currentSaving) * interest;
        currentSaving = (saving + currentSaving) * interest;
        currentSaving = (saving + currentSaving) * interest;
        currentSaving = (saving + currentSaving) * interest;
        currentSaving = (saving + currentSaving) * interest;

        double twoDecimals = (int)(currentSaving * 100);
        double futureSaving = twoDecimals / 100;

        System.out.print("After the sixth month, account value is $" + futureSaving);
    }
}
