package repetitionStructures;

import java.util.Scanner;

public class GrossPayInputValidator {
    public static void main(String[]args){
        /**
         * Gross Pay Validator
         *
         */
        //Initialize known variables
        int payRate = 15;
        int maxHours = 40;

        //Get input for unknown variables.
        System.out.println("How many hours did the employee work this week");
        Scanner sc = new Scanner(System.in);
        double hoursWorked = sc.nextDouble();

        //Validate User Input
        while (hoursWorked > maxHours){
            System.out.println("Invalid entry. Your hours must be" +
                    " between 1 and 40. Try again.");
            hoursWorked = sc.nextDouble();
        }
        //Resolve working memory
        sc.close();

        //Calculate gross
        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: $"+gross);
    }
}
