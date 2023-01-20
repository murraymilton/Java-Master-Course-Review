package loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[]args){
//        for(int i = 5; i > 0; i--){
//            System.out.println("Welcome to Muse!" + i);
//        }
//
//        int i = 0;
//        while(i < 5){
//            System.out.println("Waiting");
//            i++;
//        }
        Scanner sc = new Scanner(System.in);
        String userResponse = "";
        while (true){
            System.out.print("Enter a response:");
            userResponse = sc.nextLine().toLowerCase();
            if(userResponse.equals("pass"))
                continue;
            if(userResponse.equals("quit"))
                break;
            System.out.println(userResponse);
        }
    }
}
