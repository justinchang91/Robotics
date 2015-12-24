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
public class AddGuestsHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int whichRoom;
        int numGuests;
        boolean anotherOne = false;
        int[] guestsIn = new int[10];

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            guestsIn[roomNum] = 0;

        }

        do {

            System.out.println("Room number: ");
            whichRoom = input.nextInt();
            System.out.println("Number of guests: ");
            numGuests = input.nextInt();
            guestsIn[whichRoom] = numGuests;

            System.out.println("Another one? (y/n)");
            String y = input.nextLine();

            if (input.nextLine().equals("y")) {
                anotherOne = true;
            } else {
                anotherOne = false;
            }
        } while (anotherOne);

        System.out.println("");
        System.out.println("Room\tGuests");
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.println(roomNum + "\t" + guestsIn[roomNum]);

        }

    }

}
