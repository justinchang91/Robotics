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
public class ExtremeTrivia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Welcome to Extreme Trivia!");
        whatIsYourQuestion();

    }

    public static void whatIsYourQuestion() {
        Scanner input = new Scanner(System.in);

        String question;
        String wrongAnswerOne;
        String wrongAnswerTwo;
        String wrongAnswerThree;
        String rightAnswer;
        Boolean playAgain = false;
        int randomNumber;

        do {
            //user creates question
            System.out.println("What is your question?");
            question = input.nextLine().toLowerCase();

            System.out.println("What is the right answer?");

            rightAnswer = input.nextLine().toLowerCase();

            System.out.println("What are the wrong answers? (3)");
            wrongAnswerOne = input.nextLine().toLowerCase();
            wrongAnswerTwo = input.nextLine().toLowerCase();
            wrongAnswerThree = input.nextLine().toLowerCase();

            //user answers
            System.out.println("\n" + question);

            randomNumber = (int) (Math.random() * 4);

            switch (randomNumber) {

                case 1:
                    System.out.println("\n1. " + wrongAnswerOne);
                    System.out.println("2. " + wrongAnswerTwo);
                    System.out.println("3. " + rightAnswer);
                    System.out.println("4. " + wrongAnswerThree);
                    break;

                case 2:
                    System.out.println("\n1. " + rightAnswer);
                    System.out.println("2. " + wrongAnswerTwo);
                    System.out.println("3. " + wrongAnswerOne);
                    System.out.println("4. " + wrongAnswerThree);
                    break;

                case 3:
                    System.out.println("\n1. " + wrongAnswerOne);
                    System.out.println("2. " + rightAnswer);
                    System.out.println("3. " + wrongAnswerTwo);
                    System.out.println("4. " + wrongAnswerThree);
                    break;

                default:
                    System.out.println("\n1. " + wrongAnswerOne);
                    System.out.println("2. " + wrongAnswerTwo);
                    System.out.println("3. " + wrongAnswerThree);
                    System.out.println("4. " + rightAnswer);

            }
            System.out.println("\nWhat is your answer?");

            String userChoice = input.nextLine();

            if (userChoice.equals(rightAnswer)) {
                System.out.println("You guessed right!");
            } else {
                System.out.println("You guessed wrong!");
            }

            System.out.println("Play again? (y/n)");
            String y = input.nextLine();
            if (y.equals("y")) {
                playAgain = true;
            } else {
                playAgain = false;
            }
        } while (playAgain);

    }
}
