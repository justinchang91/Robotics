package RoboticsGrade9;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

        System.out.println("Welcome to 10 sticks!");
        System.out.print("You and the computer take turns picking sticks");
        System.out.println("and whoever gets to 0 sticks first loses!");
        //if user goes first
        String y = goFirst();

        if (y.equals("y")) {
            userGoesFirst();
        } else {
            compGoesFirst();
        }
    }

    public static String goFirst() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWould you like to go first? (y/n)");

        return input.nextLine();

    }

    public static void userGoesFirst() {
        Scanner input = new Scanner(System.in);

        int totalSticks = 10;

        do {
            System.out.println("There are " + totalSticks + " sticks.");

            System.out.println("YOUR TURN: How many sticks to take? (1 or 2)");
            int sticks = input.nextInt();

            totalSticks = totalSticks - sticks;

            if (totalSticks <= 0) {
                System.out.println("You lose!");

            } else {
                System.out.println("There are " + totalSticks + " sticks.");
                if (totalSticks - 2 <= 0) {
                    sticks = 1;

                } else {
                    sticks = 2;
                }

                System.out.println("COMPUTER'S TURN: The computer takes " + sticks + " sticks.");
                totalSticks = totalSticks - sticks;

                if (totalSticks <= 0) {
                    System.out.println("You win!");
                }
            }
        } while (totalSticks > 0);
    }

    public static void compGoesFirst() {
        Scanner input = new Scanner(System.in);
        int totalSticks = 10;

        do {
            System.out.println("There are " + totalSticks + " sticks.");
            int sticks;
            if (totalSticks - 2 <= 0) {
                sticks = 1;

            } else {
                sticks = 2;
            }

            System.out.println("COMPUTER'S TURN: The computer takes " + sticks + " sticks.");
            totalSticks = totalSticks - sticks;

            if (totalSticks <= 0) {
                System.out.println("You win!");

            } else {
                System.out.println("There are " + totalSticks + " sticks.");

                System.out.println("YOUR TURN: How many sticks to take? (1 or 2)");
                sticks = input.nextInt();

                totalSticks = totalSticks - sticks;

                if (totalSticks <= 0) {
                    System.out.println("You lose!");

                }

            }
        } while (totalSticks > 0);
    }
}
