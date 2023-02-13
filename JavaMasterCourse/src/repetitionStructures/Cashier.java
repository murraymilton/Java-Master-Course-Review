package repetitionStructures;

import java.util.Scanner;

public class Cashier {
    public static  void main(String[]args){

        //Get number of items to scan
        System.out.println("Enter the number of items you would like to scan:");
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();

        double total = 0;


        //Create loop to iterate through all of the items and accumulate the costs
        for(int i=0; i<quantity; i++){
            System.out.print("\nEnter the cost of item:");
            double price  = sc.nextDouble();

            total = total + price;
        }
        sc.close();
        System.out.println("Total cost of Items: $" + total);
    }
}
