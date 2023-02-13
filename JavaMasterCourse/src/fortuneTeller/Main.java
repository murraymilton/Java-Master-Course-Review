package fortuneTeller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("When did WW1(World War I) start?");
        System.out.print("\nA.May 3, 1913");
        System.out.print("\nB.August 24, 1915");
        System.out.print("\nC.July 28, 1914");
        System.out.print("\n ");
        String userChoice = sc.next();

        if (userChoice.equals("a")) {
            System.out.println("Perhaps reviewing history would not be such a bad ideal.");
            System.out.println("C.July 28, 1914 is the correct answer");
        } else if (userChoice.equals("b")) {
            System.out.println("C.July 28, 1914 is the correct answer");
            System.out.println("WW1(World War One was already occurring");
        } else if (userChoice.equals("c")) {
            System.out.println("Congratulations!!! You are a history guru, I see.");
            System.out.println("C.July 28, 1914 is the correct answer");
        }

       /*int userNumb;

       while(true){
           System.out.println("//Welcome to fortune's unlimited//");
           System.out.println("Pick a number between 1 and 10");
           userNumb = sc.nextInt();
           if(userNumb >= 1 && userNumb <= 5){
               System.out.println("Enjoy the good luck a friend brings you");
               break;
           }else if(userNumb > 5) {
               System.out.println("Your magical moment is upon you.");
               break;
           }
       }

       /**
        * Song on repeat example
        */

       /*boolean isOnRepeat = true;
       while(isOnRepeat){
           System.out.println("Repeating current song.");
           System.out.println("Would you like to change the current song?");
           String input = sc.next();

           if("yes".equals(input)){
               isOnRepeat = false;
               System.out.println("Changing to your next song selection.");
           }
       }
       System.out.println("Playing next song.");*/
   }
}
