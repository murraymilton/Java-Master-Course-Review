package scanner;

import java.util.Scanner;

public class UserInputTester {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a String");
            String userInput = sc.nextLine();
            System.out.println("User Input: " + userInput);
        }catch (Exception ex){
            ex.getLocalizedMessage();
        }finally {
            sc.close();
        }
    }
}
