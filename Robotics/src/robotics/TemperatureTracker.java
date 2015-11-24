package robotics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GWS_STUDENT
 */
import java.util.Scanner;

public class TemperatureTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Please display this week's temperatures below. ");

        String[] Days = new String[7];
        Days[0] = "Monday";
        Days[1] = "Tuesday";
        Days[2] = "Wednesday";
        Days[3] = "Thursday";
        Days[4] = "Friday";
        Days[5] = "Saturday";
        Days[6] = "Sunday";
        
//temperature
        int[] Temp = new int[7];
        Scanner userInput = new Scanner(System.in);
       
        for (int i = 0; i < Temp.length; i++) {
            
            Temp[i] = userInput.nextInt();
            }

        
        System.out.println("This is the weekly forcast: ");
        for (int i = 0; i < Days.length; i++) {
            System.out.println( Days[i] +": "+ Temp[i]);
        }
    
    
    
    
    }

}
