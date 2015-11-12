/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics;
import java.util.Scanner;
/**
 *
 * @author GWS_STUDENT
 */
public class SwitchStatementAndStringTaskVowelCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
       System.out.println("Write a word, and I will print it");
       //This asks the user for a word
       
       int vowels = 0;
       //the amount of vowels that will be added
       
       int length;
       
       String word = input.nextLine();
       
       word.toLowerCase();
       
       length = word.length();
       
       for(int i = 0; i<length; i++){
           
          switch (word.charAt(i)){
              
              case 'a':
              case 'e':
              case 'i':
              case 'o':
              case 'u':
                  
                 vowels++;
                  
          }
       }
       
       System.out.println("Number of vowels" + vowels);
       
               
                 
                         
          }
       
       
                   
                   
       
     
       
       
       
       
               
    
    }
    
    
 
    
    
    

