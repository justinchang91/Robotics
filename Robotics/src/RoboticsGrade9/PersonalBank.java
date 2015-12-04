/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoboticsGrade9;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class PersonalBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       
        boolean playagain;
        double depositAmount;
        double totalMoney = 0;
        double withdrawAmount;
        boolean deposit;
        boolean withdrawal;
        
        
        System.out.println("Welcome to your personal bank account.");
        System.out.println("\nWould you like to deposit or withdraw? ");
        
       
        do {
            System.out.println("Enter d to deposit / w to withdraw");

            if (deposit = input.nextLine().equals("d")) {
                System.out.println("How much money would you like to deposit?");
                depositAmount = input.nextDouble();

                System.out.print("You have deposited " + "$" + depositAmount);
                System.out.println(" Thank you for making a deposit");
                totalMoney = totalMoney + depositAmount;
                System.out.println("You have " + "$" + totalMoney + " in your account.");
            
            } else {  
                System.out.println("How much money would you like to withdraw?");
                withdrawAmount = input.nextDouble();

                System.out.print("You have withdrew " + "$" + withdrawAmount);
                System.out.println(" Thank you for making a withdrawal");
                totalMoney = totalMoney - withdrawAmount;
                System.out.println("You have " + "$" + totalMoney + " in your account.");
            }
            System.out.println("\nWould you like to make another deposit/withdrawal?\n"
                    + "Enter y to make another deposit/withdrawal.");

            playagain = input.nextLine().equals("y");

        } while (playagain);

    }

}
