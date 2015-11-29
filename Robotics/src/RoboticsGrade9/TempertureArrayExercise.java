/*
 * Name: Temperature Array Exercise
 * Date: 11/5/2015
 * Author: Justin Chang
 * Version: 01
 * Description: Arrays

 * aryNums[i], [i] is the first term in an array. Since we always start at 0,
 [i] would be zero. If it was [1] you would be refering to the second number in 
 the array, [2] would be the third and so on.  

 */
package RoboticsGrade9;

import java.util.Scanner;

/**
 *
 * @author GWS_STUDENT
 */
public class TempertureArrayExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] aryNums = new int[10];
        int max = 0;
        int sum = 0;
        int average;

        System.out.println("Please list 10 temperatures below. ");

        for (int i = 0; i < aryNums.length; i++) {

            aryNums[i] = userInput.nextInt();
        }

        int min = aryNums[0];
        /*You put min after the loop because if you put it before the loop the 
         lowest number would always zero
         */

        for (int i = 0; i < aryNums.length; i++) {
            System.out.print("" + aryNums[i] + ", ");
        }
        /*This was just to display all the numbers in the array on one line 
         instead of multiple lines
         */

        for (int i = 0; i < aryNums.length; i++) {
            if (max < aryNums[i]) {
                max = aryNums[i];
            }
        }
        /* if the max is smaller than that term in the array, that term becomes the 
         new max
         */
        System.out.println("Highest temperature is " + max);

        for (int i = 0; i < aryNums.length; i++) {
            if (min > aryNums[i]) {
                min = aryNums[i];
            }
        }
        /* if the min is greater than that term in the array, that term becomes the 
         new min
         */
        System.out.println("Lowest Temperature is " + min);

        for (int i = 0; i < aryNums.length; i++) {
            sum = sum + aryNums[i];
        }
        /* sum is equal to the sum plus whatever the next term is. 
       
         */

        average = (sum / aryNums.length);
        /* get the sum and divide it by the array length or the number of numbers
         */

        System.out.println("Average Temperature is " + average);
    }

}
