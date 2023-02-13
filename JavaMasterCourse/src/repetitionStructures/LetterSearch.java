package repetitionStructures;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[]args){
        System.out.println("Enter some text:");
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        sc.close();

        boolean letterFound = false;

        //Search for the letter A
        for(int i = 0; i < text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
    }
}
