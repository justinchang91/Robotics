/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics;

import static java.time.Clock.system;
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
        int choice;
        boolean valid;

        
        
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
        } while (valid == false);
    }
}
