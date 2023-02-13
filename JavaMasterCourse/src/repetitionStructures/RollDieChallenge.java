package repetitionStructures;

import java.util.Random;

public class RollDieChallenge {
    public static void main(String[]args) {
        int lastSpace = 20;
        int dieRoll = (int) Math.round(Math.random() * 6);
        int playerSpace = 0;
        int maxRolls = 5;

        System.out.println("Welcome to Roll the Die! Let's ");

        for(int i = 1; i <=maxRolls; i++ ){
            playerSpace =  playerSpace + dieRoll;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i,dieRoll));

            if(playerSpace == lastSpace){
                System.out.println("You're on on space " + playerSpace + ". Congrats, " +
                        "you win!");
                break;
            }
            else if(playerSpace > lastSpace){
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces." +
                        " You lose!");
                break;
            }else if(i == maxRolls && playerSpace < lastSpace){
                System.out.println("You're on space " + playerSpace + ".");
                System.out.println("Unfortunately, you did not make it to all " +
                        lastSpace + " spaces. You lose!");
            }
            else{
                int spacesToGo = lastSpace - playerSpace;
                System.out.print("You are now on space " + playerSpace +
                        " and have " + spacesToGo + " more to go.");
            }
            System.out.println();
        }

//        Random random = new Random();
//        int die = random.nextInt(6) + 1;

        }
    }

