/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class NumberGuessingWCounter {
         public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int guess;
         int counter=1;
         int answer=2;
         
         System.out.println("I have a chosen a number between 1 and 10. Try to guess it");
         System.out.println("Your guess: ");
         guess=sc.nextInt();
         
         while(guess!=answer){
             counter++;
             System.out.println("That is incorrect. Guess Again");
             guess=sc.nextInt();

         }
         
         System.out.println("That's right! You're a good guesser.");
         System.out.println("It only took you "+counter+" tries.");
         }
         
         
         
}
