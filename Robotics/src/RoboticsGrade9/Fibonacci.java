
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoboticsGrade9;

/**
 *
 * @author GWS_STUDENT
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1;
        int b = 1;
        int c = 0;

        for (int i = 0; i < 20; i++) {

            /* So the first number is 0 and the second number is 1, the c value
             is initiialized as anything but it changes later. C is the sum of the 
             last two terms.
             */
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
            /* Term A becomes whatever value Term B was and Term B becomes whatever 
             Term C was.
             */
        }
    }

}
