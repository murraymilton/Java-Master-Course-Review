package methodsWorking;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
//        greetUser();

        //Get input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary:");
        double salary = sc.nextDouble();

        System.out.print("Enter your credit score:");
        int creditScore = sc.nextInt();

        sc.close();

        //Check if user is qualified.......
        creditCheck(creditScore, salary);
    }
//    public static void greetUser(){
//        System.out.print("Enter your name:");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("Welcome " + name);
//    }
//
    public static void creditCheck(int creditScore, double income){
        double requiredCreditScore = 700;
        int requiredSalary = 25000;
        if(creditScore >= requiredCreditScore && income >= requiredSalary){
            System.out.println("You are approved! Congratulations.");
        }else {
            System.out.println("We could not approve your request at this time.");
        }
    }
}
