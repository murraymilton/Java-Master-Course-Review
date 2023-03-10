package mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[]args){
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal =  scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualRate = scanner.nextFloat();
        float monthlyInterest = annualRate / PERCENT / MONTHS_IN_YEARS;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numbersOfPayments = years * MONTHS_IN_YEARS;

        double mortgage = principal
                 * (monthlyInterest * Math.pow(1+monthlyInterest, numbersOfPayments))
                / (Math.pow(1+monthlyInterest, numbersOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);


        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
