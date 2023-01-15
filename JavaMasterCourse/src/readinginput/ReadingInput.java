package readinginput;

import java.util.Scanner;

public class ReadingInput {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine().trim();
        System.out.println("Welcome! " + name);


        System.out.print("Enter age:");
        byte age = scanner.nextByte();
        System.out.println("You are " + age + " years old");
    }
}
