package readingUserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = sc.nextLine().trim();
        System.out.println("Welcome!" + name);
    }
}
