package variables;

import java.util.Scanner;

public class Variables {
    public static void main(String[]args){
        int busPassengers = 5;
        int busTickets = busPassengers;
//        System.out.println(busPassengers);

        //Updating a variable
        busTickets = busPassengers + busTickets;
        busTickets = busTickets - 2;
//        System.out.println(busTickets);

        //Strings

        String newStudentName = "James Wilson";

        String newStudentAnnouncement = "Welcome new student:";
//        System.out.println(newStudentAnnouncement + " " + newStudentName);

        // Char
        char gradeOne = 'A';
        char gradeTwo = 'B';
        char gradeThree = 'C';

//        System.out.println("Grade One:" + gradeOne + "\nGrade Two:" + gradeTwo + "\nGrade Three:" + gradeThree);


        // Long

        long worldPopulation = 7_888_000_000L;
//        System.out.println("The current world population:" + worldPopulation);

        //Double

        double studentAverage = (94 + 77 + 100)/ 3;
//        System.out.println("Student average:" + studentAverage);

        /*Math Operators
        *  +(plus)
        *  -(minus)
        *  *(multiplication)
        *  /(division)
        *  %(modulus)-returns the remainder
        * ++(add 1)
        * --(Subtract 1)
        * +=(add by)
        * -=(subtract by)
        * */

        //Type Casting - Type Conversion
        double salary = (double) (double)2989.04;



        //******* Using User Input ***********//

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name");
//        String name = scanner.nextLine();
//
//        System.out.println("How much money do you spend on coffee?");
//        double coffeeExpense = scanner.nextDouble();
//
//        System.out.println("How much money do you spend on fast food?");
//        double fastFoodExpense = scanner.nextDouble();
//
//        System.out.println("How many times a week do you buy coffee?");
//        int coffeeWeekly = scanner.nextInt();;
//
//        System.out.println("How many times a week do you buy fast food?");
//        int fastFoodWeekly = scanner.nextInt();


        //***** Responding to User

//        double finalCoffeeExpense = coffeeExpense * (double)coffeeWeekly;
//        double finalFastFoodExpense = (double)fastFoodWeekly * fastFoodExpense;
//
//        System.out.println(name + " Here is your spending habits overview:" + "\nYour weekly expense on coffee spent:" + finalCoffeeExpense + "\nYour weekly" +
//                " expense on fast food:" + finalFastFoodExpense);


        //JavaBot Challenge ------

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello what is your name?");
        String name = scanner.nextLine();

        System.out.println("\nHi " + name + "!" + " I'm Javabot. Where are you from?");
        String location = scanner.nextLine();

        System.out.println("I hear it's beautiful in " + location + "!" + " I'm from a place called Oracle");
        System.out.print("\nHow old are you?");
        int age = scanner.nextInt();

        int javaAge = age * 8;

        System.out.println("So you're " + age + ", cool!" + "I'm " + javaAge + "years old." +
                "\nThis means I'm 8 times older than you.");

        System.out.println("Enough about me. What's your favorite language? (Just don't say Python)");
        String language = scanner.next();

        System.out.println(language + ", that's great!" + "Nice chatting with you " + name +". I have to log off now."
        + " See ya!");

    }
}
