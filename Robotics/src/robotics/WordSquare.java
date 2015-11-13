/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics;

/**
 *
 * @author GWS_STUDENT
 */
import java.util.Scanner;

public class WordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner userInput = new Scanner(System.in);

        String word = userInput.nextLine();
        String newWord;
        for (int i = 0; i <= word.length(); i++) {
            newWord = word.substring(i, word.length()) + word.substring(0, i);
            System.out.println(newWord);
            //0 is the "space" before the first letter
        }

    }

}
