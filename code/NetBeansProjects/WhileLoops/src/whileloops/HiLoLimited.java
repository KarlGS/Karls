/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloops;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HiLoLimited {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int guess;
         int cpu= RandomNumber();
         int counter = 0;
         int tries=4;
         System.out.println("I'm thinking of a number from 1 to 100. Guess a number: ");
         guess = sc.nextInt();
         
         while(guess!=cpu&&counter<tries){
             counter++;
         if(guess<cpu){
             System.out.println("Sorry that guess is too low. Guess again: ");
             guess=sc.nextInt();
         }else if(guess>cpu){
             System.out.println("Sorry that guess is too high. Guess again: ");
             guess=sc.nextInt();
       
                }
         }
         if(guess==cpu){
            System.out.println("You guessed it!! It only took "+counter+" tries.");
         }else{
             System.out.println("Sorry, you didn't guess it. You took "+tries+" tries. Thats too many.");
         }
     }
     public static int RandomNumber(){
         Random r = new Random();
         int number = 1+r.nextInt(100);
         return number;
     }
}
