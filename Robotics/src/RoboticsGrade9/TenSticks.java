/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoboticsGrade9;

import static RoboticsGrade9.GuessingGame.playAgain;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class TenSticks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean userGoFirst = false;
        int amountUserTakes;
        int totalSticks = 10;
        System.out.println("Welcome to 10!");

        //Asks user if they want to go first
        String f = goFirst();
        if (f.equals("f")) {
            userGoFirst = true;
        } else {
            System.out.println("Alright, computer goes first!");
        }

        //what to do if user chooses to go first
        if (userGoFirst = true) {
            amountUserTakes = sticksToTake();

            switch (amountUserTakes) {
                case 1:
                    if (amountUserTakes == 1) {
                        totalSticks = totalSticks - 1;

                    }
            
                case 2
            
            }

        }

    }

    public static String goFirst() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nDo you want to go first?\n"
                + "Enter f to go first" + "\nEnter s to go second");
        return input.nextLine();

    }

    public static int sticksToTake() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many sticks to take? 1 or 2?");

        return input.nextInt();

    }

}
