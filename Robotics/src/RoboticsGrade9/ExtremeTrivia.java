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
        boolean anotherQuestion;
        int questionsAsked = 0;
        String question;
         
        //user creates question
        
       
        do {
        System.out.println("What is your question?");
        question = input.nextLine();
        questionsAsked = questionsAsked + 1;
        System.out.println("What are the answers? (4) ");
        
       
        String[] answers = new String[4];
        answers[0] = input.nextLine();
        answers[1] = input.nextLine();
        answers[2] = input.nextLine();
        answers[3] = input.nextLine(); 

        
        System.out.println("\nYou have created " + questionsAsked + " question(s) ");
        
        System.out.println("Another question? (y/n)");
            String y = input.nextLine();

            if (y.equals("y")) {
                anotherQuestion = true;
            } else {
                anotherQuestion = false;
            }
        } while (anotherQuestion);
        
        
     //user answers
    System.out.println(question);
    
    
        
    
  

    
       
    }

public static void gatherAnswers() {
   Scanner input = new Scanner(System.in);
    String[] answers = new String[4];
        answers[0] = input.nextLine();
        answers[1] = input.nextLine();
        answers[2] = input.nextLine();
        answers[3] = input.nextLine(); 

        
        
}


}

