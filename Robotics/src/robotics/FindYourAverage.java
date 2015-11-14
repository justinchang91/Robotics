/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class FindYourAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numberMarks = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Welcome to FindYourAverage, ");
        System.out.print("How many marks?");
        numberMarks = userInput.nextInt();

        int[] arrayMarks = new int[numberMarks];
        int sum = 0;

        System.out.println("Input marks: ");
        for (int i = 0; i < numberMarks; i++) {

            arrayMarks[i] = userInput.nextInt();
            sum = sum + arrayMarks[i];

        }

        int average = sum / numberMarks;

        System.out.print("This is your average: " + average);
        System.out.print(" %  ");
    }

}
