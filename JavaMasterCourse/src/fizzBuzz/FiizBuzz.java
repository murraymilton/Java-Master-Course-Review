package fizzBuzz;

import java.util.Scanner;

public class FiizBuzz {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();

        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        }else if(number % 5 == 0){
            System.out.println("Fizz");
        }else{
            System.out.println("No a fizzible number😁");
        }
    }
}
