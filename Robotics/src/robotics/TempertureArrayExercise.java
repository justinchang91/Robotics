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
package robotics;

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

        int[] aryNums = new int[10];
        int max = 0;
        int sum = 0;
        int average;

        for (int i = 0; i < aryNums.length; i++) {
            Scanner userInput = new Scanner(System.in);
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
        /* We are just finding the max temperature here. It is saying if max 
         (highest term) is less than the [i] or the first term, this first term 
         would be max (since at the start there is only one term anyway) Then once 
         that's done the loop adds 1, so now we are looking at aryNums[1] or the 
         second term in the array. If the max (whatever the new max was after the 
         first term) is less than this new number, aryNums[1], then this new number, 
         aryNums[1], is now the new max.
        
         */
        System.out.println("Highest temperature is " + max);

        for (int i = 0; i < aryNums.length; i++) {
            if (min > aryNums[i]) {
                min = aryNums[i];
            }
        }
        /* Finding min temperature here. This is kind of similar to what is being 
         done on max but in this case it is saying that if min (lowest term) is 
         greater than the [i] or the first term, this first term would become min.
         Then when the loop adds one, we are now looking at aryNums[1] or the second 
         term in the array. If the min (whatever the new min was after the first term)
         is greater than this new number, aryNums[1], then this new number, aryNums[1],
         is now the new min.
        
         */
        System.out.println("Lowest Temperature is " + min);

        for (int i = 0; i < aryNums.length; i++) {
            sum = sum + aryNums[i];
        }
        /* Finding sum. So if sum was zero, then 0 = 0 + aryNums[i]. For example
        if aryNums[i] (or the first term) was 25, then you're saying 0 + 25 is the
        sum, so 25 is the sum. Then the loop adds one and we are now looking at 
        the aryNums[1] or the second term. So if the aryNums[1] was 30, then an 
        example would be sum = 25 + 30. So the new sum would be 55. Then the loop
        keeps on repeating.
       
        */
        
        average = (sum / aryNums.length);
        /* Finding average. Just taking the sum that we got and dividing it by
        the number of numbers. In this case, the number of numbers would be 
        aryNums.length because thats the length of the array.
        
        */

        System.out.println("Average Temperature is " + average);
    }

}
