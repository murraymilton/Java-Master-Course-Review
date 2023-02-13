package passwordValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String userName = "johndoe";
        String currentPass = "ABC_1234";

        System.out.print("Enter a new password:");
        String newPassWord = sc.nextLine();

        //Check the length
        if(newPassWord.length() >= 8){
            for (int i = 1; i < newPassWord.length(); i++){
               if(newPassWord.contains("@") || newPassWord.contains("%")
                       || newPassWord.contains("#")
                       || newPassWord.contains("$")&& newPassWord !=currentPass) {
                   System.out.println("Password has been updated.");
               }else {
                   System.out.println("Password could not be updated!");
               }
            }
        }
    }
}
