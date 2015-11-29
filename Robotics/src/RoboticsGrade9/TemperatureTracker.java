/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoboticsGrade9;

import java.util.Scanner;

/**
 *This is a combination of my TemperatureArrayExercise and TemperatureTracker files.
 * @author Justin
 */
public class TemperatureTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner userInput = new Scanner(System.in);
        int[] aryNums = new int[7];
        int max = 0;
        int sum = 0;
        int average;

    //TempTrackerV1Code-------------------------------------------------------------
        System.out.println("Please display this week's temperatures below. ");

        String[] Days = new String[7];
        Days[0] = "Monday";
        Days[1] = "Tuesday";
        Days[2] = "Wednesday";
        Days[3] = "Thursday";
        Days[4] = "Friday";
        Days[5] = "Saturday";
        Days[6] = "Sunday";
        
        int[] Temp = new int[7];
        
       
        for (int i = 0; i < Temp.length; i++) {
            
            Temp[i] = userInput.nextInt();
            }

        
        System.out.println("\nThis is the weekly forcast: ");
        for (int i = 0; i < Days.length; i++) {
            System.out.println( Days[i] +": "+ Temp[i]);
        }
        
        //TempArrayCode-------------------------------------------------------------
        for (int i = 0; i < Temp.length; i++) {
            if (max < Temp[i]) {
                max = Temp[i];
            }
        }
        System.out.println("\nThe highest temperature is: " + max);
        //----------------------------------------------------------------------
        int min = Temp[0];
        for (int i = 0; i < Temp.length; i++) {
            if (min > Temp[i]) {
                min = Temp[i];
            }
        }
        System.out.println("The lowest temperature is: " + min);
        //----------------------------------------------------------------------
        for (int i = 0; i < Temp.length; i++) {
            sum = sum + Temp[i];
        }
        //----------------------------------------------------------------------
        average = (sum / Temp.length);
        System.out.println("The average temperature is: " + average);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
