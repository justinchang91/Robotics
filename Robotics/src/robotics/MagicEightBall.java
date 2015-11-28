/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics;

/**
 *
 * @author Justin
 */
import java.util.Scanner;

public class MagicEightBall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int randomNumber;
        String question;
        boolean playagain;
        int questionsAsked = 0;

        System.out.println("Welcome to Magic 8 Ball!");

        playagain = true;
        do {
            System.out.println("\nMagic 8 Ball: What is your question? ");
            question = input.nextLine();

            randomNumber = (int) (Math.random() * 21);
            switch (randomNumber) {
                case 1:
                    System.out.println("Magic 8 Ball: Signs point to yes.");
                    break;

                case 2:
                    System.out.println("Magic 8 Ball: Yes.");
                    break;

                case 3:
                    System.out.println("Magic 8 Ball: Reply hazy, try again.");
                    break;

                case 4:
                    System.out.println("Magic 8 Ball: Without a doubt.");
                    break;

                case 5:
                    System.out.println("Magic 8 Ball: My sources say no.");
                    break;

                case 6:
                    System.out.println("Magic 8 Ball: As I see it,yes.");
                    break;

                case 7:
                    System.out.println("Magic 8 Ball: You may rely on it.");
                    break;

                case 8:
                    System.out.println("Magic 8 Ball: Concentrate and ask again.");
                    break;

                case 9:
                    System.out.println("Magic 8 Ball: Outlook not so good.");
                    break;

                case 10:
                    System.out.println("Magic 8 Ball: It is decidedly so.");
                    break;

                case 11:
                    System.out.println("Magic 8 Ball: Better not tell you now.");
                    break;

                case 12:
                    System.out.println("Magic 8 Ball: Very doubtful.");
                    break;

                case 13:
                    System.out.println("Magic 8 Ball: Yes - definitely.");
                    break;

                case 14:
                    System.out.println("Magic 8 Ball: It is certain.");
                    break;

                case 15:
                    System.out.println("Magic 8 Ball: Cannot predict now.");
                    break;

                case 16:
                    System.out.println("Magic 8 Ball: Most likely.");
                    break;

                case 17:
                    System.out.println("Magic 8 Ball: Ask me again later.");
                    break;

                case 18:
                    System.out.println("Magic 8 Ball: My reply is no.");
                    break;

                case 19:
                    System.out.println("Magic 8 Ball: Outlook good.");
                    break;

                case 20:
                    System.out.println("Magic 8 Ball: Don't count on it.");
                    break;

                default:
                    System.out.print("Magic 8 Ball: You think you've got problems?");
                    System.out.println(" My random number generator is broken!");

            }

            questionsAsked = questionsAsked + 1;
            System.out.println("\nYou have asked " + questionsAsked + " question(s).");

            System.out.println("\nDo you have another question?\n"
                    + "Enter y to ask again.");

            playagain = input.nextLine().equals("y");

        } while (playagain);

    }

}
