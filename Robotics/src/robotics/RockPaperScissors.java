/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics;


import java.util.Scanner;

/**
 *
 * @author GWS_STUDENT
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        String RPS;
        int choice = 0;
        int compchoice;
        boolean valid;
        boolean playagain;
        int gamesplayed = 0;
        int wins = 0;
        int losses = 0;
        int ties = 0;

        playagain = true;
        do {
            System.out.println("Please select Rock, Paper or Scissors");
            gamesplayed = gamesplayed + 1;

            do {
                valid = true;
                RPS = input.nextLine().trim().toLowerCase();
                switch (RPS) {
                    case "rock":
                        choice = 0;
                        break;
                    case "paper":
                        choice = 1;
                        break;
                    case "scissors":
                        choice = 2;
                        break;
                    default:
                        valid = false;
                }

                if (valid == false) {
                    System.out.println("Choice not valid. Please choose rock, paper or scissors");
                }
            } while (valid == false);

            compchoice = (int) (Math.random() * 3);

            if (compchoice == 0) {
                System.out.println("The computer chose rock!");
                if (choice == 1) {
                    System.out.println("Paper beats rock. You win!");
                    wins = wins + 1;
                }
                else if (choice == 2) {
                    System.out.println("Rock beats scissors. You lose!");
                    losses = losses + 1;
                } else {
                    System.out.println("This is a tie!");
                    ties = ties + 1;
                }
            }

            else if (compchoice == 1) {
                System.out.println("The computer chose paper!");
                if (choice == 1) {
                    System.out.println("This is a tie!");
                    ties = ties + 1;
                }

                else if (choice == 2) {
                    System.out.println("Scissors beats paper. You win!");
                    wins = wins + 1;
                } else {
                    System.out.println("Paper beats rock. You lose!");
                    losses = losses + 1;
                }
            }

            else {
                System.out.println("The computer chose scissors!");
                if (choice == 1) {

                    System.out.println("Scissors beats paper. You lose!");
                    losses = losses + 1;
                }

                else if (choice == 2) {

                    System.out.println("This is a tie!");
                    ties = ties + 1;
                } else {

                    System.out.println("Rock beats scissors. You win!");
                    wins = wins + 1;
                }
            }

            System.out.println("\nYou have played " + gamesplayed + " game(s) ");
            System.out.println("You have " + wins + " wins");
            System.out.println("You have " + losses + " losses");
            System.out.println("You have " + ties + " ties");

            System.out.println("\nDo you want to play again?\n"
                    + "Enter y to play again.");

            playagain = input.nextLine().equals("y");

        } while (playagain);

    }
}
