/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoboticsGrade9;

import java.util.Scanner;

/**
 *
 * @author 1changjus
 */
public class MethodsPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        int randomNumber = generateRandomNumber();
        int guess;
        boolean playAgain = false;

        do {
           System.out.println("Please enter 1 or 2");
           guess = getUserGuess();
            switch (randomNumber) {
                case 1:
                    System.out.println("The computer chose 1");
                    if (guess == 1) {
                        System.out.println("You guessed correct!");
                    } else {
                        System.out.println("You guessed wrong");
                    }

                    break;

                default:

                    System.out.println("The computer chose 2");
                    if (guess == 2) {
                        System.out.println("You guessed correct!");
                    } else {
                        System.out.println("You guessed wrong");
                    }
                    break;
            }
            String y = playAgain();
            if (y.equals("y")){
            playAgain = true;
            }
        } while (playAgain);

    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * 2);
    }

    public static int getUserGuess() {
        Scanner input = new Scanner(System.in);
        
        return input.nextInt();

    }
    
    public static String playAgain(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nDo you want to play again?\n"
                    + "Enter y to play again.");
        return input.nextLine();
    }

}
